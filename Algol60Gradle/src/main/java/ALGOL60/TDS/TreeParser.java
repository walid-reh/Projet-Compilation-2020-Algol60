package ALGOL60.TDS;

import ALGOL60.TDSPrinter.TDSPrinter;
import ALGOL60.grammar.Algol60Parser;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

import static ALGOL60.grammar.Algol60Lexer.LABELLED_BLOCK;
import static ALGOL60.grammar.Algol60Parser.Number;
import static ALGOL60.grammar.Algol60Parser.*;


public class TreeParser {
    private Tree root;
    private RegionStack TDSStack=new RegionStack();

    private int region=1;
    private int nesting=0;
    public TreeParser(Tree root){
        this.root=root;
    }


    public void StartParser() {
        if (root.getChildCount() == 0) {
            System.out.println("The file cannot be parsed");
        } else {
            Tree child = root.getChild(0);//The first begin
            TDSStack.BuildnewTable(EnumTypeTDS.PROG,null,region,nesting);
            ProcSymbol bases_functions = new ProcSymbol("outinteger",0, Scope.OWN,root.getChild(0),BASICTYPE.UNDEFINED,TDSStack.peek());
            TDSStack.peek().addProcSymbol(bases_functions);
            ProcSymbol bases_functions2 = new ProcSymbol("outstring",0, Scope.OWN,root.getChild(0),BASICTYPE.UNDEFINED,TDSStack.peek());
            TDSStack.peek().addProcSymbol(bases_functions2);
            region++;
            nesting++;
            switch (child.getType()) {
                case LABELLED_BLOCK:
                    ArrayList<String> Labels=new ArrayList<>();

                    Tree beginblock =travel_LABELLED_BLOCK(child,Labels);
                    for (String label: Labels){

                        LabelSymbol element=new LabelSymbol(SymbolType.LABEl,label,Integer.MIN_VALUE,Scope.OWN,beginblock);
                        //Fills all labels in the SymbolTable
                        TDSStack.peek().addSymbol(element);
                    }

                    travel_BEGIN(beginblock);
                    nesting--;
                    break;



                case BEGIN:
                    travel_BEGIN(child);
                    nesting--;
                    break;
                default:
                    System.out.println("(StartParser:a child didnt get traveled "+child.getType()+",line: "+child.getLine());
                    break;
            }

            System.out.println("Printing the constructed symbolTables");
            TDSPrinter myprinter=new TDSPrinter(20);
            for(SymbolTable TDS:TDSStack.getVisitedSymbolTable()){
                myprinter.printTable(TDS);
            }


        }
    }
    public RegionStack getTDSStack() {
        return TDSStack;
    }


    //Fill The arraylist Labels and returns the Tree element that has the type Begin;
    private Tree  travel_LABELLED_BLOCK(Tree tree, ArrayList<String> Labels){
        Tree parcours=tree;
        while(parcours.getChild(1).getType()== Algol60Parser.LABELLED_BLOCK) {
            Labels.add(Labels.size(), parcours.getChild(0).getText());
            parcours=parcours.getChild(1);

        }
        if(parcours.getChild(1).getType()==BEGIN){
            Labels.add(parcours.getChild(0).getText());

        }
        return parcours.getChild(1);
    }
    //Travels Begin node / Begin 's childrens are : Block? Declarations?
    private void travel_BEGIN(Tree begin){
        for(int i=0;i<begin.getChildCount();i++){
            Tree child=begin.getChild(i);
            switch(child.getType()){
                case DECLARATIONS:
                    travel_DECLARATIONS(child);
                    break;
                case BLOCK:
                    //A la fin d'un block il faut décrementer nesting
                    travel_block(child);
                    break;
                default:
                    System.out.println("(travel_BEGIN:a child didnt get traveled "+child.getText()+",line: "+child.getLine());
                    break;
            }

        }
    }
    private void travel_DECLARATIONS(Tree Declarations){
        for(int i=0;i<Declarations.getChildCount();i++){
            Tree child=Declarations.getChild(i);
            switch(child.getType()){
                case Algol60Parser.LOCAL_DECLARATION:
                    switch(child.getChild(1).getType()){
                        case Algol60Parser.VAR_ID: //local_declaration wwith var_id
                            //travel variables has varid as node and type as String
                            System.out.println("entered here");
                            travel_VARIABLES(child.getChild(1),child.getChild(0).getText(),false);
                            break;
                        //case array // proc
                        case Algol60Parser.ARRAY_DECLARATION:
                            travel_ARRAY_DECLARATION(child.getChild(1),child.getChild(0).getText(),false);
                            break;
                        case Algol60Parser.PROC_DECLARATION:
                            travel_PROC_DECLARATION(child.getChild(1),child.getChild(0).getText(),false);
                            break;
                        default:
                            System.out.println("(travel_DECLARATIONS:a child didnt get traveled "+child.getType()+",line: "+child.getLine());
                            break;
                    }
                    break;

                case Algol60Parser.PROC_DECLARATION:
                    travel_PROC_DECLARATION(child,"real",false);
                    break;
                case Algol60Parser.ARRAY_DECLARATION:
                    travel_ARRAY_DECLARATION(child,"real",false);
                    break;
                case Algol60Parser.SWITCH_DECLARATION:
                    //SWITCH TRAVEL STILL NOT DONE
                    travel_switch(child);
                    break;
                case Algol60Parser.OWN_DECLARATION:
                    Tree typeOrArrayChild=child.getChild(0);
                    if(typeOrArrayChild.getType()==Algol60Parser.ARRAY_DECLARATION){
                        travel_ARRAY_DECLARATION(typeOrArrayChild,"real",true);
                    }else{
                        Tree varOrArrChild=child.getChild(1);
                        if(varOrArrChild.getType()==Algol60Parser.VAR_ID) travel_VARIABLES(varOrArrChild,typeOrArrayChild.getText(),true);
                        else travel_ARRAY_DECLARATION(varOrArrChild,typeOrArrayChild.getText(),true);

                    }
                    break;


            }
        }
    }


    private void travel_procedure_statement(Tree statement,ArrayList<ProcedureParameterSymbol> parameters){
        this.TDSStack.BuildnewTable(EnumTypeTDS.PROCEDURE,this.TDSStack.peek(),region++,nesting++);
        this.TDSStack.peek().addProcParameters(parameters);
        switch(statement.getType()){
            case Algol60Parser.GOTO:
                travel_goto(statement);// control semantique
                break;
            case Algol60Parser.IF:
                travel_if(statement);
                break;
            //pas le meme if que designational expression
            case Algol60Parser.EMPTY_STATEMENT:
                break;
            case Algol60Parser.BEGIN:
                travel_BEGIN(statement);
                break;
            case Algol60Parser.LABELLED_STATEMENT:
                travel_labelled_statement(statement);
                break;
            case Algol60Parser.FOR:
                travel_FOR(statement);
                break;
            case LABELLED_EMPTY_STATEMENT:
                LabelSymbol element=new LabelSymbol(SymbolType.LABEl,statement.getChild(0).getText(),Integer.MIN_VALUE,Scope.OWN,statement);
                this.TDSStack.peek().addSymbol(element);
                break;
            //mazal partie li fiha assignment array precedure call etc
        }
        this.TDSStack.popTDSandSavePath();
        nesting--;
    }
    private void travel_statement(Tree statement){
        switch(statement.getType()){
            case Algol60Parser.LABELLED_EMPTY_STATEMENT:
                LabelSymbol element=new LabelSymbol(SymbolType.LABEl,statement.getChild(0).getText(),Integer.MIN_VALUE,Scope.OWN,statement);
                this.TDSStack.peek().addSymbol(element);
                break;
            case Algol60Parser.GOTO:
                travel_goto(statement);// control semantique
                break;
            case Algol60Parser.IF:
                travel_if(statement);
                break;
            //pas le meme if que designational expression
            case Algol60Parser.EMPTY_STATEMENT:
                break;
            case Algol60Parser.BEGIN:
                this.TDSStack.BuildnewTable(EnumTypeTDS.BLOCK,this.TDSStack.peek(),region++,nesting++);
                travel_BEGIN(statement);
                this.TDSStack.popTDSandSavePath();
                nesting--;
                break;
            case Algol60Parser.LABELLED_STATEMENT:
                travel_labelled_statement(statement);
                break;
            case Algol60Parser.FOR:
                travel_FOR(statement);
                break;
            //mazal partie li fiha assignment array precedure call etc
        }
    }

    public void travel_labelled_statement(Tree labelledStatement){
        if(labelledStatement.getType()==LABELLED_STATEMENT) {
            LabelSymbol element = new LabelSymbol(SymbolType.LABEl, labelledStatement.getChild(0).getText(), Integer.MIN_VALUE, Scope.OWN, labelledStatement.getChild(0));
            this.TDSStack.peek().addSymbol(element);
            travel_labelled_statement(labelledStatement.getChild(1));

        }else{
            travel_statement(labelledStatement);

        }

    }
    private void travel_block(Tree block){
        for(int i=0;i<block.getChildCount();i++){
            Tree child=block.getChild(i);
            travel_statement(child);
        }
    }
    private void travel_if(Tree ifNode){
        for(int i=0; i<ifNode.getChildCount();i++){
            Tree child=ifNode.getChild(i);
            switch(child.getType()){
                case Algol60Parser.THEN:
                    travel_THEN(child);
                    break;
                //Jaber shuf If
                case Algol60Parser.ELSE:
                    travel_ELSE(child);
                    break;
            }
        }
    }
    private void travel_THEN(Tree thenNode){
        travel_statement(thenNode.getChild(0));

    }
    private void travel_ELSE(Tree ElseNode){
        travel_statement(ElseNode.getChild(0));

    }
    private void travel_goto(Tree gotoNode){

        //semantique seulement
    }
    private void travel_FOR(Tree forNode){
        Tree forlistNode=forNode.getChild(1);
        travel_forlist(forlistNode);
        travel_statement(forNode.getChild(2).getChild(0));
    }
    private void travel_forlist(Tree forlistNode){
        //semantique seulement
    }

    private void travel_switch(Tree switchnode) {
        Tree child=switchnode.getChild(1);
        ArrayList<String> labelswitch=new ArrayList<String>();
        for(int i=0;i<child.getChildCount();i++){
            Tree type=child.getChild(i);
            System.out.println(type.getType());
            switch(type.getType()){
                case Identifier:
                    labelswitch.add(child.getChild(i).getText());
                    break;
                case Number:
                    labelswitch.add(child.getChild(i).getText());
                    break;
                case IF:
                    ArrayList<String> lab= traversal_switch_if(child.getChild(i));
                    for (String s:lab){
                        labelswitch.add(s);
                    }
                    break;
                default:
                    System.out.println("Error ");
                    break;
            }
        }

        SwitchSymbol switchSymbol=new SwitchSymbol(switchnode.getChild(0).getText(),Integer.MIN_VALUE,Scope.LOCAL,switchnode,labelswitch.size());
        switchSymbol.setNombreDeCas(labelswitch.size());
        switchSymbol.setPossibleValues(labelswitch);
        this.TDSStack.peek().addSymbol(switchSymbol);


    }









    private ArrayList<String> traversal_switch_if(Tree switchifnode) {
        Tree child_then = switchifnode.getChild(1);
        Tree child_else=switchifnode.getChild(2);
        ArrayList<String>  label=new ArrayList<>();
        for(int i=0 ;i<child_then.getChildCount();i++){

            Tree type=child_then.getChild(i);

            switch(type.getType()){

                case IF:

                    ArrayList<String> label_if =traversal_switch_if(child_then.getChild(i));
                    for (String s:label_if){

                        label.add(s);

                    }
                    break;

                case Identifier:
                    label.add(type.getText());

                    break;
                case Number:
                    label.add(type.getText());

                    break;


            }




        }

        for(int i=0 ;i<child_else.getChildCount();i++){

            Tree type_else=child_else.getChild(i);

            switch(type_else.getType()){

                case IF:

                    ArrayList<String> label_if =traversal_switch_if(child_else.getChild(i));
                    for (String s:label_if){

                        label.add(s);

                    }
                    break;



                case Identifier:
                    label.add(type_else.getText());

                    break;
                case Number:
                    label.add(type_else.getText());

                    break;


            }}
        return label;
    }


    private void travel_PROC_DECLARATION(Tree proc_dec, String typeretour, boolean isOwn){



        ArrayList<String> paramsControle = new ArrayList<String>();
        ArrayList<String> specifiedarguments = new ArrayList<String>();

        int count=0;
        String name=proc_dec.getChild(count).getText();
        count++;
        //INFOS ABOUT PARAMETERS
        ArrayList<ProcedureParameterSymbol> listpara=new ArrayList<>();
        if(proc_dec.getChild(count).getType()!=Algol60Parser.LISTPARAMETER){

        }else {
            Tree LISTParameter = proc_dec.getChild(1);
            for (int i = 0; i < LISTParameter.getChildCount(); i++){
                Tree child=LISTParameter.getChild(i);
                //ProcedureParameterSymbol elt=new ProcedureParameterSymbol(child.getText(),PARAMETERTYPE.UNDEFINED,false);
                ProcedureParameterSymbol elt=new ProcedureParameterSymbol(child.getText(),PARAMETERTYPE.UNDEFINED,false,child);
                listpara.add(elt);
            }
            count++;
        }
        if(proc_dec.getChild(count).getType()==Algol60Parser.VALUE) {
            Tree Value = proc_dec.getChild(count);
            for (int i = 0; i < Value.getChildCount(); i++) {
                String childText = Value.getChild(i).getText();
                paramsControle.add(childText);
                for (ProcedureParameterSymbol para : listpara) {
                    if (para.getName().equals(childText)) {
                        para.setCallByValue(true); //Call by Value enabled
                    }
                }
            }
            count++;
        }

        for(int i=count;i<proc_dec.getChildCount()-1;i++){
            Tree specification=proc_dec.getChild(i);
            PARAMETERTYPE parametertype=getCorrespondingParameterType(specification);

            Tree specifiedID=specification.getChild(specification.getChildCount()-1);

            for (int j = 0; j < specifiedID.getChildCount(); j++) {
                String varname=specifiedID.getChild(j).getText();
                specifiedarguments.add(varname);
                boolean found=false;
                for (ProcedureParameterSymbol para : listpara) {
                    if(para.getName().equals(varname)){
                        para.setType(parametertype);//SETTING PARAMETER TYPE FOR THE FOUND IDS
                        found=true;
                    }
                }
                if(!found )
                    System.out.println("(Line:" + "(" + specifiedID.getChild(j).getLine() + ")" + "A specified entity doesn't seem to be a parameter: " + varname);

            }
            count++; // hadi bsh nduz lblock awla assignment


        }

        //controle sémantique sur les parametres called by value :
        if (!paramsControle.isEmpty()){
            for (int kk=0;kk<specifiedarguments.size();kk++){
                if(!paramsControle.contains(specifiedarguments.get(kk))){
                    System.out.println("(Line:" + proc_dec.getChild(0).getLine()+ "(" + proc_dec.getChild(2).getLine() + ")" + "The type of a parameter, called by value, not specified: ");
                }

            }
        }



        //count++; // hadi bsh nduz lblock awla assignment
        ProcSymbol procsymbol=new ProcSymbol(name, Integer.MIN_VALUE,Scope.LOCAL,proc_dec,BASICTYPE.UNDEFINED,TDSStack.peek());

        //la valeur de retour
        procsymbol.setReturnType(getCorrespondingType(typeretour));

        if(isOwn){
            procsymbol.setScope(Scope.OWN);
        }
        procsymbol.setListparameters(listpara);
        this.TDSStack.peek().addProcSymbol(procsymbol);

        travel_procedure_statement(proc_dec.getChild(count),listpara); // we ll create a bloc either way
        //travel_statement(proc_dec.getChild(count));


        //IN PROGRESS
        //DARORI KAYNA SHI HAJA SOIT BLOCK / STATEMENT AWLA EMPTY STATEMENT !! WALID GALLEK KHASSA CONTROLE SEMANTIQUE ANA MAGALT WALO

    }

    private PARAMETERTYPE getCorrespondingParameterType(Tree specificationNode){
        String type1=specificationNode.getChild(0).getText();
        if(specificationNode.getChildCount()==3){
            String type2=specificationNode.getChild(1).getText();
            if(type1.equals("real")){
                switch(type2){
                    case "procedure":
                        return PARAMETERTYPE.REAL_PROCEDURE;
                    case "array":
                        return  PARAMETERTYPE.REAL_ARRAY;

                }
            }
            if(type1.equals("integer")){
                switch(type2){
                    case "procedure":
                        return PARAMETERTYPE.INTEGER_PROCEDURE;
                    case "array":
                        return  PARAMETERTYPE.INTEGER_ARRAY;

                }
            }
            if(type1.equals("boolean")){
                switch(type2){
                    case "procedure":
                        return PARAMETERTYPE.BOOLEAN_PROCEDURE;
                    case "array":
                        return  PARAMETERTYPE.BOOLEAN_ARRAY;

                }
            }
        }
        if(specificationNode.getChildCount()==2){

            switch(type1){
                case "real":
                    return PARAMETERTYPE.REAL;
                case "integer":
                    return PARAMETERTYPE.INTEGER;
                case "boolean":
                    return PARAMETERTYPE.BOOLEAN;
                case "string":
                    return PARAMETERTYPE.STRING;
                case "switch":
                    return PARAMETERTYPE.SWITCH;
                case "label":
                    return PARAMETERTYPE.LABEL;
                case "procedure":
                    return PARAMETERTYPE.PROCEDURE;
                case "array":
                    return PARAMETERTYPE.ARRAY;
            }
        }
        return PARAMETERTYPE.UNDEFINED;

    }
    private void travel_VARIABLES(Tree varid, String typeVar, boolean isOwn){
        BASICTYPE type=getCorrespondingType(typeVar);
        for(int i=0;i<varid.getChildCount();i++){
            Tree Child=varid.getChild(i);
            VarSymbol varSymbol=new VarSymbol(Child.getText(),-1,Scope.LOCAL,Child,type);
            if(isOwn) varSymbol.setScope(Scope.OWN);
            this.TDSStack.peek().addVarSymbol(varSymbol);
        }


    }

    private BASICTYPE getCorrespondingType(String type) {
        switch (type) {
            case "real":
                return BASICTYPE.REAL;
            case "integer":
                return BASICTYPE.INTEGER;
            case "boolean":
                return BASICTYPE.BOOLEAN;
            case "string":
                return BASICTYPE.STRING;
        }
        return BASICTYPE.STRING;
    }
    private void travel_ARRAY_DECLARATION(Tree arraydec, String type, boolean isown){
        for(int i=0;i<arraydec.getChildCount();i++){
            travel_array_segment(arraydec.getChild(i),type,isown);

        }

    }
    private void travel_array_segment(Tree arrayseg,String type,boolean isown){
        BASICTYPE basictype;
        if (type.equals("")){
            basictype=BASICTYPE.REAL;
        }else {
            basictype = getCorrespondingType(type);
        }
        Tree ArrayIds=arrayseg.getChild(0);
        Tree ArrayDimension=arrayseg.getChild(1);
        ArrayList<Bounds> listbounds=new ArrayList<>();
        //Filling the dimensions;
        for (int i=0;i<ArrayDimension.getChildCount();i++){
            listbounds.add(createBounds(ArrayDimension.getChild(i)));
        }
        //Dimensions Done;
        for(int i=0;i<ArrayIds.getChildCount();i++){
            Tree child=ArrayIds.getChild(i);
            ArraySymbol elt=new ArraySymbol(child,child.getText(),Scope.LOCAL, Integer.MIN_VALUE,basictype,listbounds.size(),listbounds);
            if(isown){
                elt.setScope(Scope.OWN);
            }
            this.TDSStack.peek().addArraySymbol(elt);
        }
        //DONE
    }
    private Bounds createBounds(Tree BoundNode){
        if(BoundNode.getType()== BOUNDS) {

            int minbound = 0;
            int maxbound = 0;
            try {
                minbound = Integer.parseInt(BoundNode.getChild(0).getText());
                maxbound = Integer.parseInt(BoundNode.getChild(1).getText());
                if (maxbound < minbound) {
                    System.out.println("Semantic Error : " + "Line " + BoundNode.getLine() + " : minbound must be less than or equal to the maxbound");
                }

            } catch (NumberFormatException e) {
                System.out.println("Semantic Error : " + "Line " + BoundNode.getLine() + " : Bounds of an array must be integers");


            }

            return new Bounds(minbound, maxbound);

        }
        return null;
    }


}
