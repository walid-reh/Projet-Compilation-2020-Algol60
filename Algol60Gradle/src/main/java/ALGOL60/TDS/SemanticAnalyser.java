package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

import static ALGOL60.grammar.Algol60Parser.Number;
import static ALGOL60.grammar.Algol60Parser.*;


public class SemanticAnalyser {
    private ArrayList<SymbolTable> symbolTables;
    private Tree root;
    private int tableIndex = 0;

    public SemanticAnalyser(Tree root, ArrayList<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables;
        this.root = root;
    }

    public void startAnalysis() {
        if (root.getChildCount() == 0) {
        } else {
            Tree child = root.getChild(0);//The first begin
            switch (child.getType()) {
                case LABELLED_BLOCK:
                    ArrayList<String> Labels = new ArrayList<>();
                    Tree beginblock = analyse_LABELLED_BLOCK(child);
                    analyse_BEGIN(beginblock);
                    break;

                case BEGIN:
                    analyse_BEGIN(child);
                    break;
                default:
                    break;
            }

        }


    }


    public Tree analyse_LABELLED_BLOCK(Tree LABELLEDBLOCK) {
        if (LABELLEDBLOCK.getChild(1).getType() != BEGIN) {
            return analyse_LABELLED_BLOCK(LABELLEDBLOCK.getChild(1));
        } else {
            return LABELLEDBLOCK.getChild(1); //valeur de retour : begin
        }

    }


    //Travels Begin node / Begin 's childrens are : Block? Declarations?
    private void analyse_BEGIN(Tree begin) {
        for (int i = 0; i < begin.getChildCount(); i++) {
            Tree child = begin.getChild(i);
            switch (child.getType()) {
                case DECLARATIONS:
                    analyse_DECLARATIONS(child);
                    //surtout pour le block de la procédure
                    break;
                case BLOCK:
                    //A la fin d'un block il faut décrementer nesting
                    analyse_block(child);
                    break;
                default:
                    System.out.println("(travel_BEGIN:a child didnt get traveled " + child.getText() + ",line: " + child.getLine());
                    break;
            }

        }

    }

    public void analyse_DECLARATIONS(Tree declaration) {
        for (int i = 0; i < declaration.getChildCount(); i++) {
            Tree child = declaration.getChild(i);

            switch (child.getType()){

                case SWITCH_DECLARATION:

                    analyse_Switch(child);
                    break;
                case PROC_DECLARATION:
                    analyse_PROC_DECLARATION(child);
                    break;
                case LOCAL_DECLARATION:
                    if(child.getChild(1).getType()==PROC_DECLARATION){
                        analyse_PROC_DECLARATION(child.getChild(1));
                    }
                    break;

            }

        }
    }
    public void analyse_PROC_DECLARATION(Tree procdec){
        String procname=procdec.getChild(0).getText();
        tableIndex++;
        analyse_proc_statement(procdec.getChild(procdec.getChildCount()-1),procname);
        tableIndex++;
    }

    private void analyse_proc_BEGIN(Tree begin,String procname) {
        for (int i = 0; i < begin.getChildCount(); i++) {
            Tree child = begin.getChild(i);
            switch (child.getType()) {
                case DECLARATIONS:
                    analyse_DECLARATIONS(child);
                    //surtout pour le block de la procédure
                    break;
                case BLOCK:
                    //A la fin d'un block il faut décrementer nesting
                    for (int j = 0; j < child.getChildCount(); j++) {
                        Tree  statement = child.getChild(j);
                        analyse_proc_statement(statement,procname);

                    }
                    break;
                default:
                    System.out.println("(travel_BEGIN:a child didnt get traveled " + child.getText() + ",line: " + child.getLine());
                    break;
            }

        }

    }

    public void analyse_proc_statement(Tree statement, String procname){

        switch (statement.getType()) {
            case GOTO:
                analyse_goto(statement);// control semantique
                break;
            case IF:
                analyse_if(statement);
                //pas le meme if que designational expression
                break;
            case EMPTY_STATEMENT:
                break;
            case BEGIN:
                analyse_proc_BEGIN(statement,procname);
                break;
            case LABELLED_STATEMENT:
                analyse_proc_statement(statement.getChild(1),procname);
                break;
            case LABELLED_EMPTY_STATEMENT:
                break;
            case FOR:
                analyse_FOR(statement);
                break;
            //mazal partie li fiha assignment array precedure call etc
            case ALGOL60.grammar.Algol60Parser.ASSIGNMENT:
                analyse_Assignment(statement,procname);
                break;
            case ALGOL60.grammar.Algol60Parser.FUNCTION_CALL:
                analyse_FunctionCall(statement);
                break;
        }
    }

    public void analyse_block(Tree block) {
        for (int i = 0; i < block.getChildCount(); i++) {
            Tree child = block.getChild(i);
            analyse_statement(child);

        }


    }

    private void analyse_statement(Tree statement) {
        switch (statement.getType()) {
            case GOTO:
                analyse_goto(statement);// control semantique
                break;
            case IF:
                analyse_if(statement);
                //pas le meme if que designational expression
                break;
            case EMPTY_STATEMENT:
                break;
            case BEGIN:
                tableIndex++;
                analyse_BEGIN(statement);
                tableIndex++;
                break;
            case LABELLED_STATEMENT:
                analyse_statement(statement.getChild(1));
                break;
            case LABELLED_EMPTY_STATEMENT:
                break;
            case FOR:

                analyse_FOR(statement);

                break;
            //mazal partie li fiha assignment array precedure call etc
            case ALGOL60.grammar.Algol60Parser.ASSIGNMENT:
                analyse_Assignment(statement,null);
                break;
            case ALGOL60.grammar.Algol60Parser.FUNCTION_CALL:
                analyse_FunctionCall(statement);
                break;
        }
    }


    //makes sure that assignment doesnt have a function_CALL  / + - * / boolean operators !
    //only the last child of assignment might have a boolean opera or arithmetic since its the affectation value
    public boolean verifyAssignment(Tree assignNodeChild) {
        if ((assignNodeChild.getType() >= T__60 && assignNodeChild.getType() <= T__66) || (assignNodeChild.getType() >= T__70 && assignNodeChild.getType() <= T__79) || assignNodeChild.getType() == T__105) {
            System.out.println("Syntax Error: Line "+assignNodeChild.getLine() +": Arithmetic/boolean operator found");
            return false;
        }else{
            return true;
        }
    }

    public void analyse_Assignment(Tree assignNode,String procname) {
        //verify all left part has the same type
        boolean hasCommonType=true;
        BASICTYPE CommonType=BASICTYPE.UNDEFINED;
        for(int i=0;i<assignNode.getChildCount()-1;i++) {
            Tree firstChild = assignNode.getChild(i);
            BASICTYPE ChildType=BASICTYPE.UNDEFINED;
            switch (firstChild.getType()) {
                case ARRAY_ACCESS:
                    //vérification type avec expression // verification de l'index call
                    verifyAssignment(firstChild); //cette fonction vérifie qu'il n'ya pas des opérations arithmétiques/booléennes
                    //car on a ajouté dans notre grammaire des règles d'écriture, et il fallait les enlever après
                    ArraySymbol arr=analyseArrayAccess(firstChild);//index respects the bounds
                    if(arr!=null){
                        ChildType=arr.getArrayType();
                    }
                    break;
                case FUNCTION_CALL:
                    ProcSymbol proc=analyse_FunctionCall(firstChild);
                    if(proc!=null){
                        ChildType=proc.getReturnType();
                    }
                    break;
                case Identifier:
                    if(procname!=null){ //Proc dec case
                        Symbol possibleProc=this.symbolTables.get(tableIndex).identifySymbol(procname,true);
                        if(possibleProc instanceof ProcSymbol){
                            ChildType=((ProcSymbol) possibleProc).getReturnType();
                            break;
                        }
                    }
                    VarSymbol var = analyse_variable(firstChild);
                    if (var != null) {
                        ChildType = var.getTypevariable();
                    }

                    break;
            }
            if(i==0){
                CommonType=ChildType;
            }
            if(ChildType!=CommonType){
                System.out.println(" \n Semantic Error: Line "+firstChild.getLine()+": The associated with all destinations of a left part list must be the same(CommonType:"+CommonType+",Found: "+firstChild.getText()+" "+ChildType+")");
                break;
            }
            CheckAssignmentCompatibility(ChildType,assignNode.getChild(assignNode.getChildCount()-1));
        }
    }


    //IFarithmetic = false means the Any encountered  IF: it will be a boolean one
    public BASICTYPE findType(Tree node,boolean IFarithmetic){ //USED FOR ASSIGNMENT // DOES SEMANTIC ANALYSIS TOO
        String nodeText=node.getText();
        switch(node.getType()){
            case STRING:
                return  BASICTYPE.STRING;
            case Number:
                try{
                    int toNumber=Integer.parseInt(nodeText);
                    return BASICTYPE.INTEGER;
                }catch(NumberFormatException e){
                    return BASICTYPE.REAL;
                }

            case Identifier:
                //variable ou label?

                //test if its a function call with no parameter first
                Symbol Possibleproc=this.symbolTables.get(tableIndex).identifySymbol(node.getText(),true);
                if(Possibleproc instanceof ProcSymbol){
                    if(((ProcSymbol) Possibleproc).getNumberOfparameters() ==0){
                        return ((ProcSymbol) Possibleproc).getReturnType();
                    }else{
                        System.out.println(" \n Semantic Error: Line"+node.getLine()+" : Found a procedure but it needs to have more parameters ("+((ProcSymbol) Possibleproc).getNumberOfparameters()+"Required )");
                    }
                }
                VarSymbol var=analyse_variable(node);
                if(var!=null){
                    return var.getTypevariable();
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Variable "+node.getText()+" is Undefined/Undeclared");
                    return BASICTYPE.UNDEFINED;

                }
            case ARRAY_ACCESS:
                ArraySymbol arr=analyseArrayAccess(node);
                if(arr!=null){
                    return arr.getArrayType();
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array "+node.getChild(0).getText()+" is Undefined/Undeclared");
                    return BASICTYPE.UNDEFINED;
                }
            case FUNCTION_CALL:
                ProcSymbol proc=analyse_FunctionCall(node);
                if(proc!=null){
                    return proc.getReturnType();
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Function "+node.getChild(0).getText()+" is Undefined/Undeclared");

                    return BASICTYPE.UNDEFINED;
                }
            case T__101://true
                return BASICTYPE.BOOLEAN;
            case T__88: // false
                return BASICTYPE.BOOLEAN;
            default:

                if(isArithmeticOperation(node,IFarithmetic)) {

                    if (isCorrectArithmeticExpression(node)) {
                        BASICTYPE typefound=isIntegerOrReal(node);
                        //System.out.println("found "+typefound+" during analysis");
                        return typefound;
                    }else{
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": not a correct Arithmetic Expression");
                        return BASICTYPE.UNDEFINED;

                    }
                }else {

                    if (isCorrectBooleanExpression(node)) {
                        return BASICTYPE.BOOLEAN;
                    } else {
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": not a correct Boolean Expression");

                        return BASICTYPE.UNDEFINED;

                    }
                }

        }
    }


    public BASICTYPE isIntegerOrReal(Tree node){
        //use it after isCorrectArithmeticExpression
        int nodeType=node.getType();
        //cas + - * **
        if((nodeType==60 || nodeType==62 || nodeType==64|| nodeType==61) && node.getChildCount()==2 ){
            BASICTYPE leftPartType=findType(node.getChild(0),true);
            BASICTYPE rightPartType=findType(node.getChild(1),true);
            if(leftPartType==BASICTYPE.INTEGER && rightPartType==BASICTYPE.INTEGER){
                return BASICTYPE.INTEGER;
            }else{
                return BASICTYPE.REAL;
            }
        }

        if(nodeType==64){
            BASICTYPE returntype=findType(node.getChild(0),true);
            return returntype;
        }
        //cas /
        if(nodeType==65){
            return  BASICTYPE.REAL;
        }
        //cas //
        if(nodeType==66){
            BASICTYPE leftPartType=findType(node.getChild(0),true);
            BASICTYPE rightPartType=findType(node.getChild(1),true);
            if(leftPartType==BASICTYPE.INTEGER && rightPartType==BASICTYPE.INTEGER){
                return  BASICTYPE.INTEGER;
            }else{
                System.out.println(" \n Semantic Error: Line"+ node.getLine()+": // operator is defined only for two operands both of integer types");
            }

        }
        return BASICTYPE.UNDEFINED;

    }

    public boolean isCorrectArithmeticExpression(Tree node){
        int type=node.getType();
        if(type==Number){
            return true;
        }
        if(type==Identifier){
            Symbol Possibleproc=this.symbolTables.get(tableIndex).identifySymbol(node.getText(),true);
            if(Possibleproc instanceof ProcSymbol){
                if(((ProcSymbol) Possibleproc).getNumberOfparameters() ==0){
                    BASICTYPE returnvalue=((ProcSymbol) Possibleproc).getReturnType();
                    if(returnvalue==BASICTYPE.BOOLEAN){
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": Procedure "+Possibleproc.getName()+" can't be Boolean");
                        return false;
                    }else{
                        return true;
                    }
                }else{
                    System.out.println(" \n Semantic Error: Line"+node.getLine()+" : Found a procedure but it needs to have more parameters ("+((ProcSymbol) Possibleproc).getNumberOfparameters()+"Required )");
                    return false;
                }
            }
            VarSymbol var=analyse_variable(node);
            if(var!=null){
                if (var.getTypevariable()==BASICTYPE.BOOLEAN){
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Variable "+var.getName()+" can't be Boolean");
                    return false;
                }else{
                    return true;
                }
            }else{
                Symbol nodeaparam=this.symbolTables.get(tableIndex).identifySymbol(node.getText(),true);
                if(nodeaparam != null) {
                    if (!(nodeaparam.getSymboltype() == SymbolType.PARAMETER)) {
                        System.out.println(" \n Semantic Error: Line " + node.getLine() + ": Variable " + node.getText() + " is Undefined/Undeclared");
                    }
                }else{
                    System.out.println(" \n Semantic Error: Line " + node.getLine() + ": Variable " + node.getText() + " is Undefined/Undeclared");
                }
                return false;
            }
        }

        if(type==FUNCTION_CALL){
            ProcSymbol proc=analyse_FunctionCall(node);
            if(proc!=null){
                if(proc.getReturnType()==BASICTYPE.BOOLEAN){
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Procedure "+proc.getName()+" can't have a boolean return");
                    return false;
                }else{
                    return true;
                }
            }else{
                System.out.println(" \n Semantic Error: Line "+node.getLine()+": Function "+node.getChild(0).getText()+" is Undefined/Undeclared");
                return false;
            }

        }
        if(type==ARRAY_ACCESS){
            ArraySymbol arr=analyseArrayAccess(node);
            if(arr!=null){
                if(arr.getArrayType()==BASICTYPE.BOOLEAN){
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array "+arr.getName()+" can't have a boolean return");
                    return false;
                }else{

                    return true;
                }
            }else{
                System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array"+node.getChild(0).getText()+" is Undefined/Undeclared");
                return false;

            }
        }
        if(isArithmeticOperation(node,true)){
            if(node.getType()==IF){
                if(!isCorrectBooleanExpression(node.getChild(0))){
                    System.out.println(" \n Semantic Error: Line "+ node.getLine()+": Not a Correct Boolean Expression");
                }
                return isCorrectArithmeticExpression(node.getChild(1).getChild(0))  & isCorrectArithmeticExpression(node.getChild(2).getChild(0));
            }
            if(node.getChildCount()==2) {
                return isCorrectArithmeticExpression(node.getChild(0)) & isCorrectArithmeticExpression(node.getChild(1));
            }else{
                return isCorrectArithmeticExpression(node.getChild(0));
            }

        }
        return false;
    }


    public boolean isCorrectBooleanExpression(Tree node){
        int type=node.getType();
        if(type==Number){
            System.out.println(" \n Semantic Error: Line "+node.getLine()+": Incorrect boolean expression (Problem:"+node.getText()+")");
            return false;
        }
        if(type == T__101 || type ==T__88){ //true or false
            return true;
        }
        if(type==Identifier){
            Symbol Possibleproc=this.symbolTables.get(tableIndex).identifySymbol(node.getText(),true);
            if(Possibleproc instanceof ProcSymbol){
                if(((ProcSymbol) Possibleproc).getNumberOfparameters() ==0){
                    BASICTYPE returnvalue=((ProcSymbol) Possibleproc).getReturnType();
                    if(returnvalue==BASICTYPE.BOOLEAN){
                        return true;
                    }else{
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": Procedure "+Possibleproc.getName()+" can't be real/integer");

                        return false;
                    }
                }else{
                    System.out.println(" \n Semantic Error: Line"+node.getLine()+" : Found a procedure but it needs to have more parameters ("+((ProcSymbol) Possibleproc).getNumberOfparameters()+"Required )");
                    return false;
                }
            }
            VarSymbol var=analyse_variable(node);
            if(var!=null){
                if (var.getTypevariable()==BASICTYPE.BOOLEAN){
                    return true;
                }else{
                    System.out.println(" \n Semantic Error: Line " + node.getLine() + " : Variable " + var.getName() + " must be Boolean ");
                    return false;
                }
            }else{
                System.out.println(" \n Semantic Error: Line " + node.getLine()+ " : Variable " + node.getText() + " is Undefined/Undeclared ");
                return false;
            }
        }

        if(type==FUNCTION_CALL){
            ProcSymbol proc=analyse_FunctionCall(node);
            if(proc!=null){
                if(proc.getReturnType()==BASICTYPE.BOOLEAN){
                    return true;
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Procedure "+proc.getName()+" must have a boolean return");
                    return false;
                }
            }else{
                System.out.println(" \n Semantic Error: Line "+node.getLine()+": Function "+node.getChild(0).getText()+" is Undefined/Undeclared");
                return false;
            }

        }
        if(type==ARRAY_ACCESS){
            ArraySymbol arr=analyseArrayAccess(node);
            if(arr!=null){
                if(arr.getArrayType()==BASICTYPE.BOOLEAN){
                    return true;
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array "+arr.getName()+" must have a boolean return");

                    return false;
                }
            }else{
                System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array "+node.getChild(0).getText()+" is Undefined/Undeclared ");

                return false;

            }
        }
        if(isBooleanOperation(node)) {
            int nodetype=node.getType();
            if((nodetype>=T__70 && nodetype <= T__77) && (nodetype !=T__72 &&nodetype!=T__75)){
                // cas = <= >=
                return isCorrectArithmeticExpression(node.getChild(0))&isCorrectArithmeticExpression(node.getChild(1));
            }
            if (node.getType() == T__105) {// NOT
                return isCorrectBooleanExpression(node.getChild(0));
            }
            if(node.getType()==IF){
                if(!isCorrectBooleanExpression(node.getChild(0))){
                    System.out.println(" \n Semantic Error: Line "+ node.getLine()+": Not a Correct Boolean Expression");
                }
                return isCorrectBooleanExpression(node.getChild(1).getChild(0))  & isCorrectBooleanExpression(node.getChild(2).getChild(0));
            }
            return isCorrectBooleanExpression(node.getChild(0)) & isCorrectBooleanExpression(node.getChild(1));


        }
        return false;
    }
    public boolean isBooleanOperation(Tree node){
        int type=node.getType();
        if (type >= T__70 && type <=T__79 || type==T__105 || type==IF){
            return true;
        }else{
            return false;
        }

    }
    public void CheckAssignmentCompatibility(BASICTYPE type,Tree withnode){
        BASICTYPE withType=BASICTYPE.UNDEFINED;
        int line=withnode.getLine();
        if(type==BASICTYPE.INTEGER || type== BASICTYPE.REAL || type== BASICTYPE.UNDEFINED){
            withType=findType(withnode,true);
        }else{
            withType=findType(withnode,false);
        }
        if(withType==BASICTYPE.UNDEFINED || type==BASICTYPE.UNDEFINED){
            System.out.println(" \n Semantic Error:Line "+line+": FATAL: CANT CHECK COMPTATIBILITY:");
        }
        switch(type){

            case BOOLEAN:
                switch (withType){
                    case INTEGER:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign an integer to a Boolean");
                        break;
                    case REAL:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign real to a Boolean");
                        break;
                    case ARITHMETIC_EXPRESSION:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign a Number(arithmetic expression) to a Boolean");
                        break;
                    case BOOLEAN_EXPRESSION:
                        break;

                }
                break;
            case REAL:
                switch (withType){
                    case INTEGER:
                        System.out.println("Assigning integer to a real variable(Compatible)");
                        break;

                    case BOOLEAN_EXPRESSION:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign a boolean(Boolean expression) to a real variable");
                        break;
                    case BOOLEAN:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign a boolean to a real variable");
                        break;

                }
                break;
            case INTEGER:
                switch (withType){
                    case REAL:
                        System.out.println("Line"+line+": Assigning a real to an integer variable(will call a cast function)");
                        break;

                    case BOOLEAN_EXPRESSION:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign a boolean(Boolean expression) to an integer variable");
                        break;
                    case BOOLEAN:
                        System.out.println(" \n Semantic Error:Line "+line+": Can't assign a boolean to an integer variable");
                        break;
                    case ARITHMETIC_EXPRESSION:
                        System.out.println("Verifying the arithmetic expression(Line:"+line+") later to check Compatibility");
                        break;
                }
        }

    }
    public ArraySymbol analyseArrayAccess(Tree arrayAcessNode) {
        String arrayID = arrayAcessNode.getChild(0).getText();
        Symbol arr = this.symbolTables.get(tableIndex).identifySymbol(arrayID, true);
        if (arr == null) {
            System.out.println(" \n Semantic Error: Line " + arrayAcessNode.getChild(0).getLine() + ": " + arrayID + " is undefined/undeclared");
            System.out.println(" \n Semantic Error: Line " + arrayAcessNode.getChild(0).getLine() + ": Can't access index since " + arrayID + " is undefined");
            return null;
        } else {
            if(arr.getSymboltype()!=SymbolType.ARRAY){
                System.out.println(" \n Semantic Error: Line " + arrayAcessNode.getChild(0).getLine() + ": " + arrayID + " is not an Array");
                return null;
            }else {
                ArraySymbol array = (ArraySymbol) arr;
                analyseIndex_Arrayaccess(arrayAcessNode.getChild(1), array);
                return array;
            }
        }

    }
    //compare the returntype (or type if variable|array) with equalsto
    public boolean verifyReturnType(Symbol studiedSymbol,BASICTYPE equalsto){
        if(studiedSymbol instanceof  ProcSymbol){
            return ((ProcSymbol) studiedSymbol).getReturnType()==equalsto;
        }
        if(studiedSymbol instanceof ArraySymbol){
            return ((ArraySymbol) studiedSymbol).getArrayType()==equalsto;
        }
        if(studiedSymbol instanceof VarSymbol){
            return ((VarSymbol) studiedSymbol).getTypevariable()==equalsto;
        }
        return false;
    }

    public boolean isArithmeticOperation(Tree relatedNode,boolean IFarithmetic){
        int type=relatedNode.getType();
        return (type>=T__60 && type<=T__62) ||(type>=T__64 &&type<=T__66)|| (type==IF && IFarithmetic); //IF IS INCLUDED TOO
    }
    public VarSymbol analyse_variable(Tree node){
        int nodeLine=node.getLine();
        String nodeText=node.getText();
        Symbol var=this.symbolTables.get(tableIndex).identifySymbol(nodeText,true);
        if(var==null){
            System.out.println(" \n Semantic Error: Line " + nodeLine+ ": variable "+nodeText+" is undefined");
            return null;
        }else{
            //System.out.println(var);



            if (!(var instanceof VarSymbol) || (var.getSymboltype() == SymbolType.PARAMETER)) {
                if(((var.getSymboltype() != SymbolType.PARAMETER)) ){
                    System.out.println(" \n Semantic Error: Line " + nodeLine + ": " + nodeText + " is not a variable  (Found:" + var.getSymboltype() + ")");
                }
                return null;
            } else {
                return (VarSymbol) var;
            }


        }
    }

    public void analyseIndex_Arrayaccess(Tree indexNode,ArraySymbol relatedArray){
        //dimension verification
        if(indexNode.getChildCount()!=relatedArray.getBoundaries().size()){
            System.out.println(" \n Semantic Error: Line "+ indexNode.getLine()+": Array "+relatedArray.getName()+" has "+relatedArray.getBoundaries().size()+" dimension(s) not "+indexNode.getChildCount());
        }

        //Index verification
        //Index must be Integers | array_access(Integers) |functioncall(Integers)


        //still tests on the minimum information, we dispose of
        for (int i = 0; i < Math.min(indexNode.getChildCount(),relatedArray.getBoundaries().size()); i++) {

            Tree indexChild = indexNode.getChild(i);
            String childText=indexChild.getText();
            int indexChildType=indexChild.getType();
            int childLine=indexChild.getLine();
            switch(indexChildType){
                case Number:
                    try {
                        int indexValue = Integer.parseInt(childText);
                        Bounds relatedBounds = relatedArray.getBoundaries().get(i);
                        if (indexValue > relatedBounds.getMaxBoundary() || indexValue < relatedBounds.getMinBoundary()) {
                            System.out.println(" \n Semantic Error: Line " + childLine + ": Index n°" + (i + 1) + " must be between " + relatedBounds.getMinBoundary() + " and " + relatedBounds.getMaxBoundary());
                        }
                    }catch(NumberFormatException e){
                        System.out.println(" \n Semantic Error: Line "+childLine+": Index must be Integer (Found:"+childText+")");
                    }
                    break;
                case Identifier:
                    VarSymbol var=analyse_variable(indexChild);
                    if(var!=null){
                        if(!verifyReturnType((var),BASICTYPE.INTEGER)){
                            System.out.println(" \n Semantic Error: Line " + childLine + ": Variable "+childText+"must be Integer (Found:"+var.getTypevariable()+")");

                        }
                    }else{
                        System.out.println(" \n Semantic Error: Line " + childLine+ ": variable "+indexChild+" is undeclared/undefined");

                    }
                    break;
                case ARRAY_ACCESS:
                    ArraySymbol arr=analyseArrayAccess(indexChild);
                    if(arr!=null) {
                        if (!verifyReturnType(arr, BASICTYPE.INTEGER)) {
                            System.out.println(" \n Semantic Error: Line " + childLine + ": Array " + childText + "must be Integer (Found:" + (arr.getArrayType() + ")"));

                        }
                    }else{
                        System.out.println(" \n Semantic Error: Line " + childLine+ ": array "+indexChild.getChild(0).getText()+" is undeclared/undefined");

                    }
                    break;
                case FUNCTION_CALL:
                    ProcSymbol proc=analyse_FunctionCall(indexChild);
                    if(proc!=null) {
                        if (!verifyReturnType(proc, BASICTYPE.INTEGER)) {
                            System.out.println(" \n Semantic Error: Line " + childLine + ": Procedure " + childText + "must be Integer (Found:" + (proc.getReturnType() + ")"));

                        }
                    }else{
                        System.out.println(" \n Semantic Error: Line " + childLine+ ": Procedure "+indexChild.getChild(0).getText()+" is undeclared/undefined");

                    }
                    break;
                default:
                    BASICTYPE typeFound=findType(indexChild,true);
                    if(typeFound!=BASICTYPE.ARITHMETIC_EXPRESSION && typeFound!=BASICTYPE.INTEGER){
                        System.out.println(" \n Semantic Error: Line " + childLine + ": Index n°"+(i+1)+" needs to be an integer/ arithmetic expression");
                    }
                    break;
            }

        }
    }


    public ProcSymbol analyse_FunctionCall(Tree FuncCallNode) {

        int FcallLine = FuncCallNode.getLine();

        String nomfunction  = FuncCallNode.getChild(0).getText();
        Symbol function = this.symbolTables.get(tableIndex).identifySymbol(nomfunction, true);
        if(function==null){
            System.out.println(" \n Semantic Error: Line " + FuncCallNode+ ": function "+nomfunction+" is undefined");
            return null;
        }else{
            if( ! (function instanceof ProcSymbol)){
                System.out.println(" \n Semantic Error: Line "+FcallLine+": "+nomfunction+" is not a defined (Found:"+function.getSymboltype()+")");
                return null;

            }else{
                ProcSymbol fonctionsymbol = (ProcSymbol)function ;
                BASICTYPE varretour =  ((ProcSymbol) function).getReturnType(); // à vérifier dans l'assignement lors de l'utilisation ailleurs
                ArrayList<ProcedureParameterSymbol> listeparam  = fonctionsymbol.getListparameters();

                if(listeparam != null) {
                    if (listeparam.size() < FuncCallNode.getChild(1).getChildCount()) {

                        System.out.println(" \n Semantic Error: Line " + FcallLine + ": la procédure " + nomfunction + " requiert moins d'arguements");
                    } else if (listeparam.size() > FuncCallNode.getChild(1).getChildCount()) {
                        System.out.println(" \n Semantic Error: Line " + FcallLine + ": la procédure " + nomfunction + " requiert plus d'arguements");
                    }
                }

                if (FuncCallNode.getChild(1).getChildCount()!=0){
                    verifyTypeExistenceParameters(FuncCallNode,listeparam);

                }


                return (ProcSymbol) function;
            }
        }
    }



    // verifying the type and existence of parameters
    public void verifyTypeExistenceParameters(Tree nodeCall, ArrayList<ProcedureParameterSymbol> listeparams ){
        //nodeCall == FUNCTION_CALL
        int  nodeCallLine = nodeCall.getLine();

        for(int i=0; i< nodeCall.getChild(1).getChildCount();i++){
            if (listeparams!=null){
                if (listeparams.size() > i){
                    String typeparams =listeparams.get(i).getType().toString();
                    if(nodeCall.getChild(1).getChild(i).getType()== IF){
                        PARAMETERTYPE evalauted =  EvaluateTypeParams(nodeCall.getChild(1).getChild(i),true);
                        if(!typeparams.equals(evalauted.toString())){
                            System.out.println(" \n Semantic Error: Line "+nodeCallLine+": dans la procédure "+nodeCall.getChild(0).getText()+ " " +nodeCall.getChild(1).getChild(i).getText()
                                    + "n'est pas de type" + typeparams);
                        }

                    }else{
                        PARAMETERTYPE evalauted =  EvaluateTypeParams(nodeCall.getChild(1).getChild(i), false);
                        if(!typeparams.equals(evalauted.toString())){
                            System.out.println(" \n Semantic Error: Line "+nodeCallLine+": dans la procédure "+nodeCall.getChild(0).getText()+ " " +nodeCall.getChild(1).getChild(i).getText()
                                    + "n'est pas de type" + typeparams);
                        }

                    }

                }
            }

        }

    }



    public PARAMETERTYPE TypesCorrespondance(BASICTYPE type, boolean isarray, boolean isprocedure){
        switch(type){
            case REAL:

                if ((isarray ==false)&& (isprocedure ==false)){
                    return PARAMETERTYPE.REAL;

                }else if((isarray == true)&& (isprocedure == false)){
                    return PARAMETERTYPE.REAL_ARRAY;
                }else if((isarray == false)&& (isprocedure == true)){
                    return PARAMETERTYPE.REAL_PROCEDURE;
                }
                return PARAMETERTYPE.UNDEFINED;

            case INTEGER:
                if ((isarray ==false)&& (isprocedure ==false)){
                    return PARAMETERTYPE.INTEGER;

                }else if((isarray == true)&& (isprocedure == false)){
                    return PARAMETERTYPE.INTEGER_ARRAY;
                }else if((isarray == false)&& (isprocedure == true)){
                    return PARAMETERTYPE.INTEGER_PROCEDURE;
                }
                return PARAMETERTYPE.UNDEFINED;
            case STRING:
                return PARAMETERTYPE.STRING;


            case BOOLEAN:
                return PARAMETERTYPE.BOOLEAN;
            case UNDEFINED:
                return PARAMETERTYPE.UNDEFINED;
            default :
                return PARAMETERTYPE.UNDEFINED; //unnecesary case


        }
    }




    public PARAMETERTYPE EvaluateTypeParams(Tree node,boolean IFarithmetic){ // used to evaluate the corresponding between
        //actual parameters and formel parameters.


        String nodeText=node.getText();
        switch(node.getType()){
            case STRING:
                return  PARAMETERTYPE.STRING;
            case Number:
                try{
                    int toNumber=Integer.parseInt(nodeText);
                    return PARAMETERTYPE.INTEGER;
                }catch(NumberFormatException e){
                    return PARAMETERTYPE.REAL;
                }

            case Identifier:
                // cas d'une variable, tableau, switch, procedure ou un label

                int nodeLine=node.getLine();
                String nodeText12=node.getText();


                Symbol symbolnode=this.symbolTables.get(tableIndex).identifySymbol(nodeText12,true);


                if(symbolnode==null){
                    System.out.println(" \n Semantic Error: Line " + nodeLine+ "Symbol "+nodeText12+" is undefined");
                    return PARAMETERTYPE.UNDEFINED;
                }else{
                    if((symbolnode instanceof VarSymbol)){
                        return TypesCorrespondance(((VarSymbol) symbolnode).getTypevariable(),false, false);

                    }else if(symbolnode instanceof SwitchSymbol){
                        return PARAMETERTYPE.SWITCH;

                    }else if(symbolnode instanceof ArraySymbol){
                        return  TypesCorrespondance(((ArraySymbol) symbolnode).getArrayType(),true, false);

                    }else if(symbolnode instanceof  ProcSymbol){
                        return  TypesCorrespondance(((ProcSymbol) symbolnode).getReturnType(),false ,true);


                    }else if(symbolnode instanceof  LabelSymbol){
                        return PARAMETERTYPE.LABEL;

                    }
                }
                break;


            case ARRAY_ACCESS:
                ArraySymbol arr=analyseArrayAccess(node);
                if(arr!=null){
                    return  TypesCorrespondance(arr.getArrayType(),true,false);
                }else{
                    String nodename = node.getText();
                    Symbol arrnode = this.symbolTables.get(tableIndex).identifySymbol(nodename,true);
                    if(!(arrnode instanceof ParameterSymbol)){
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": Array "+node.getChild(0).getText()+" is Undefined/Undeclared");
                    }

                    return PARAMETERTYPE.UNDEFINED;
                }


            case FUNCTION_CALL:
                ProcSymbol proc=analyse_FunctionCall(node);
                if(proc!=null){
                    return TypesCorrespondance(proc.getReturnType(),false,true);
                }else{
                    System.out.println(" \n Semantic Error: Line "+node.getLine()+": Function "+node.getChild(0).getText()+" is Undefined/Undeclared");

                    return PARAMETERTYPE.UNDEFINED;
                }


            case T__101://true
                return PARAMETERTYPE.BOOLEAN;
            case T__88: // false
                return PARAMETERTYPE.BOOLEAN;
            default:

                if(isArithmeticOperation(node,IFarithmetic)) {

                    if (isCorrectArithmeticExpression(node)) {
                        BASICTYPE typefound=isIntegerOrReal(node);
                        if(typefound==BASICTYPE.INTEGER){
                            return PARAMETERTYPE.INTEGER;
                        }
                        return PARAMETERTYPE.REAL;
                    }else{
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": not a correct Arithmetic Expression");
                        return PARAMETERTYPE.UNDEFINED;

                    }
                }else {

                    if (isCorrectBooleanExpression(node)) {
                        return PARAMETERTYPE.BOOLEAN;
                    } else {
                        System.out.println(" \n Semantic Error: Line "+node.getLine()+": not a correct Boolean Expression");

                        return PARAMETERTYPE.UNDEFINED;

                    }
                }

        }
        return PARAMETERTYPE.UNDEFINED;
    }




    public void analyse_if(Tree ifNode) {
        for (int i = 0; i < ifNode.getChildCount(); i++) {
            Tree child = ifNode.getChild(i);
            switch (child.getType()) {

                case ALGOL60.grammar.Algol60Parser.THEN:
                    analyse_THEN(child);
                    break;
                //Jaber shuf If
                case ALGOL60.grammar.Algol60Parser.ELSE:
                    analyse_ELSE(child);
                    break;

            }


        }

    }

    private void analyse_THEN(Tree thenNode) {
        analyse_statement(thenNode.getChild(0));

    }

    private void analyse_ELSE(Tree ElseNode) {
        analyse_statement(ElseNode.getChild(0));

    }





    private void analyse_FOR(Tree forNode) {
        //  analyse_forlist(forlistNode);


        for (int i = 0; i < forNode.getChildCount(); i++) {
            Tree forItem = forNode.getChild(i);
            switch (forItem.getType()) {
                case Identifier:
                    if (!this.symbolTables.get(this.tableIndex).checkSymbolExist(forItem.getText(), true)) {
                        System.out.println(" \n Semantic Error: Line " + forItem.getLine() + ": variable " + forItem.getText() + " is Undefined/Undeclared");
                    }
                    Symbol symbol = this.symbolTables.get(this.tableIndex).getSymbols().get(forItem.getText());
                    if (symbol instanceof VarSymbol) {
                        VarSymbol type = (VarSymbol) symbol;
                        if (type.getTypevariable() != BASICTYPE.INTEGER && type.getTypevariable() != BASICTYPE.REAL) {
                            System.out.println("Integer expected in for expression " + " Line : " + forItem.getLine());
                        }


                    }


                    break;
                case FOR_LIST:
                    analyse_forlist(forItem);
                    break;
                case DO:
                    analyse_do_for(forItem);
                    break;

                default:
                    System.out.print(" \n Semantic Invalid");

            }


        }


        // il faut analyser l'iterrateur

        // analyse_statement(forNode.getChild(1).getChild(0)); //DoNode.getChild(0) => statement
    }

    private void analyse_do_for(Tree forlistNode) {

        analyse_statement(forlistNode.getChild(0));
    }

    private void analyse_forlist(Tree forlistNode) {
        //semantique seulement

        int cpt = 0;
        for (int i = 0; i < forlistNode.getChildCount(); i++) {
            Tree node = forlistNode.getChild(i);
            for (int j = 0; j < node.getChildCount(); j++) {
                Tree childlist = node.getChild(j);
                switch (childlist.getType()) {
                    case Identifier:
                        if (!this.symbolTables.get(this.tableIndex).checkSymbolExist(forlistNode.getText(), true)) {

                            System.out.println(" \n Semantic Error: Line " + childlist.getLine() + ": variable " + childlist.getText() + " is Undefined/Undeclared");
                        }

                        Symbol symbol = this.symbolTables.get(this.tableIndex).getSymbols().get(childlist.getText());

                        if (symbol instanceof VarSymbol) {

                            VarSymbol type = (VarSymbol) symbol;
                            if (type.getTypevariable() != BASICTYPE.INTEGER && type.getTypevariable() != BASICTYPE.REAL) {

                                System.out.println("Integer expected in for expression " + " Line : " + childlist.getLine());
                            }
                        }
                        break;
                    case Number:
                        //if (cpt == 1) {
                        //   System.out.println(" \n Semantic :Too many initializers in for in line " + " " + forlistNode.getLine());
                        //}
                        if (childlist.getText().matches(("-?\\d+(\\.\\d+)?"))) {//number of initialazor
                            cpt++;

                        } else {
                            System.out.println("Expected a Number" + " Line : " + childlist.getLine());
                        }


                        break;


                    case STEP:

                        for (int p = 0; p < childlist.getChildCount(); p++) {
                            Tree step = childlist.getChild(p);

                            if (!step.getText().matches("-?\\d+(\\.\\d+)?") && !isArithmeticOperation(step, false) && !this.symbolTables.get(this.tableIndex).checkSymbolExist(step.getText(), true)) {
                                System.out.println("Valeur undefined  " + "  Line " + step.getLine() + " : " + step);
                            } else if (!this.symbolTables.get(this.tableIndex).checkSymbolExist(step.getText(), true) && !isArithmeticOperation(step, false) && !(step.getText().matches("-?\\d+(\\.\\d+)?"))) {

                                System.out.println("Variable is Undefined or Undeclared expression " + " Line : " + step.getLine());

                            } else if (isArithmeticOperation(step, false)) {

                                if (!isCorrectArithmeticExpression(step)) {

                                    System.out.println("Operation for expression is not correct" + " Line : " + step.getLine());
                                }


                            } else if ((this.symbolTables.get(this.tableIndex).getSymbols().get(step.getText())) instanceof VarSymbol) {

                                VarSymbol type1 = (VarSymbol) this.symbolTables.get(this.tableIndex).getSymbols().get(step.getText());
                                BASICTYPE type = type1.getTypevariable();

                                if (!type.equals(BASICTYPE.INTEGER) && !type.equals(BASICTYPE.REAL)) {


                                    System.out.println("Integer expected in for expression " + " Line : " + step.getLine());
                                }


                            }
                        }

                        if (childlist.getChild(1).getText().matches("-?\\d+(\\.\\d+)?") && childlist.getChild(0).getText().matches("-?\\d+(\\.\\d+)?")) {

                            //if (Integer.parseInt(childlist.getChild(0).getText()) > Integer.parseInt(childlist.getChild(1).getText())) {

                            //System.out.println(childlist.getChild(0).getText() + " " + "should be less than  " + childlist.getChild(1).getText() + " Line : " + childlist.getChild(1).getLine());

                            // }
                        }
                        break;

                    case WHILE:

                        if (!isCorrectBooleanExpression(childlist.getChild(0))) {
                            System.out.printf(" \n Semantic Error: line " + childlist.getLine() + "operation is not valid");
                            break;

                        }
                        break;
                    default:
                        if (isArithmeticOperation(childlist, false)) {
                            if (!isCorrectArithmeticExpression(childlist)) {
                                System.out.printf(" \n Semantic Error !;: line " +   childlist.getText()+ "   not operation valide");
                            }

                            // System.out.printf(" \n Semantic Error !;: line " +   childlist.getText()+ "   not operation valide");
                            //  System.out.println(childlist);
                        }

                }

            }

        }


    }

    private void analyse_goto(Tree gotoNode) {

        //semantique seulement
        //C:\Users\ilham\Desktop\test.txt
        switch (gotoNode.getChild(0).getType()){
            case SWITCH_CALL :

                analyse_SwitchCall(gotoNode.getChild(0));
                break;
            case Identifier:
                if (!isLabel(gotoNode.getChild(0))){
                    System.out.println("Faute ce n'est pas un label Line: "+gotoNode.getLine());
                }
                //Souhail
                break;
            case Number:
                if (!isLabel(gotoNode.getChild(0))){
                    System.out.println("Faute ce n'est pas un label Line: "+gotoNode.getLine());
                }
                //Souhail
                break;
        }

    }
    public void analyse_SwitchCall(Tree switchCallNode) {
        for (int i =0 ; i<switchCallNode.getChildCount();i++){
            Tree indexElementSwitch = switchCallNode.getChild(i);
            int switchCallLine=switchCallNode.getLine();
            int typeElement = indexElementSwitch.getType();
            switch (typeElement) {
                case Identifier:
                    //Souhail
                    break;
                case SWITCH_CASE:
                    if (!analyse_switchCase(indexElementSwitch,switchCallNode.getChild(0))) {
                        System.out.println(" \n Semantic Error: line " + switchCallLine + " Index of the label is not correct");
                    }

                    break;
                case Number:
                    //Souhail
                    break;
                default:
                    System.out.println(" \n Semantic Error: line " + switchCallLine + " Index of the label is not an integer");
                    break;
            }
        }
    }

    public boolean analyse_switchCase(Tree switchCase,Tree switchIdentifier){
        String switchId = switchIdentifier.getText();
        Symbol symbol =  this.symbolTables.get(tableIndex).identifySymbol(switchId, true);
        if (symbol==null){
            System.out.println("Semantic Error: Line " + switchIdentifier.getLine()+ ": variable "+switchId+" is undefined");
            return false;
        }
        SwitchSymbol switchSymbol = (SwitchSymbol) symbol;
        switch (switchCase.getChild(0).getType()){
            case Number:
                int indexElement = Integer.parseInt(switchCase.getChild(0).getText());
                if (switchSymbol.getNombreDeCas()<=indexElement || indexElement<0){
                    return false;
                }
                break;
            case Identifier:
                Symbol index = this.symbolTables.get(tableIndex).identifySymbol(switchCase.getChild(0).getText(),true);
                int nodeLine=switchCase.getChild(0).getLine();
                String nodeText=switchCase.getChild(0).getText();
                Symbol var=this.symbolTables.get(tableIndex).identifySymbol(nodeText,true);
                if(var==null){
                    System.out.println("Semantic Error: Line " + nodeLine+ ": variable "+nodeText+" is undefined");
                    return false;
                }
                break;
        }
        return true;



    }


    public void analyse_THEN_designational(Tree thenNode){
        for (int i = 0;i < thenNode.getChildCount();i++){
            Tree child = thenNode.getChild(i);
            int switchCallLine=thenNode.getLine();
            switch (child.getType()){
                case SWITCH_CALL:
                    analyse_SwitchCall(child);
                    break;
                case Number:
                    isLabel(child);
                    break;
                case Identifier:
                    isLabel(child);
                    break;
                case IF:
                    analyse_if_designational(child);
                    break;
                default:
                    System.out.printf(" \n Semantic Error: line " + switchCallLine + " The if statement should give a label as a result");
                    break;
            }
        }
    }
    public void analyse_ELSE_designational(Tree elseNode){
        analyse_THEN_designational(elseNode);//ils ont les mêmes fonction
    }

    public void analyse_if_designational(Tree ifDesignationalNode){
        for (int i = 0; i < ifDesignationalNode.getChildCount(); i++) {
            Tree child = ifDesignationalNode.getChild(i);
            switch (child.getType()) {
                case ALGOL60.grammar.Algol60Parser.THEN:
                    analyse_THEN_designational(child);
                    break;
                case ALGOL60.grammar.Algol60Parser.ELSE:
                    analyse_ELSE_designational(child);
                    break;
                default:
                    isCorrectBooleanExpression(child);
                    break;
            }


        }
    }
    public void analyse_Switch_List(Tree switchListNode){
        for (int i =0; i < switchListNode.getChildCount();i++){
            Tree child = switchListNode.getChild(i);
            switch (child.getType()){
                case SWITCH_CALL:
                    analyse_SwitchCall(child);
                    break;
                case IF:
                    analyse_if_designational(child);
                    break;
                case Identifier:
                    isLabel(child);
                    //recherche du label
                    // pas forcement vu qu'on ne declare pas de label dans notre code
                    break;
                case Number:
                    isLabel(child);
                    //recherche du label
                    // pas forcement vu qu'on ne declare pas de label dans notre code
                    break;

            }

        }

    }


    public boolean isLabel(Tree labelNode){
        String labelId = labelNode.getText(); // je pense qu'il faut enlever le .getchild
        Symbol label = this.symbolTables.get(tableIndex).identifySymbol(labelId, true);
        if (label==null){
            System.out.printf(" \n Semantic Error: line " + labelNode.getLine() + " this should be a label call\n");
            return false;
        }
        switch (label.getSymboltype()){
            case LABEl:
                return true;
            default:
                System.out.printf(" \n Semantic Error: line " + labelNode.getLine() + "this should be a label call and not a "+label.getSymboltype().toString());
                return false;
        }
    }

    public boolean isSwitch(Tree switchNode){
        // recherche si c'est un switch ou pas
        Tree switchIdNode = switchNode.getChild(0);
        String switchId = switchIdNode.getChild(0).getText();
        Symbol switchSymbol = this.symbolTables.get(tableIndex).identifySymbol(switchId, true);

        switch (switchSymbol.getSymboltype()){
            case SWITCH:
                return true;
            default:
                System.out.printf(" \n Semantic Error: line " + switchNode.getLine() + "this should be a label call and not a "+switchSymbol.getSymboltype().toString());
                return false;
        }
    }
    public void analyse_Switch(Tree switchNode){
        Tree child = switchNode.getChild(1);
        int switchLine=switchNode.getLine();
        // est ce qu'il faut verifier que ce n'est pas declaré avant dans une table avant
        /*
         * le probleme c'est qu'il peut trouver lui meme et c'est vraiment pas cool
         *
         * */
        switch (child.getType()){
            case SWITCH_LIST:
                analyse_Switch_List(child);
                break;
            default:
                System.out.printf(" \n Semantic Error: line " + switchLine + " faute au niveau de la déclaration du switch");
                break;
            //je ne sais pas s'il y a une erreur au niveau de l'id du switch normalement je ne pense pas
        }
    }

}



