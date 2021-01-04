package ALGOL60.CodeGenerator;

import ALGOL60.TDS.*;
import ALGOL60.main.Main;
import org.antlr.runtime.tree.Tree;

import java.io.IOException;
import java.util.ArrayList;

import static ALGOL60.TDS.BASICTYPE.BOOLEAN;
import static ALGOL60.TDS.BASICTYPE.INTEGER;
import static ALGOL60.grammar.Algol60Parser.Number;
import static ALGOL60.grammar.Algol60Parser.*;

public class Generator {
    public Tree root;
    public FileBuilderHandler builder;
    public ArrayList<SymbolTable> path;
    public EnvironmentHandler envManager;
    private int tableIndex = 0;


    public ReaderSource readerSource = new ReaderSource(Main.sourcefile);


    public Generator(FileBuilderHandler builder, EnvironmentHandler envManager, Tree root, ArrayList<SymbolTable> path) {
        this.builder = builder;
        this.root = root;
        this.envManager = envManager;
        this.path = path;
    }

    public void generate_ALLFUNCDEC(Tree firstBegin) throws Exception {
        for (int i = 0; i < firstBegin.getChildCount(); i++) {
            Tree child = firstBegin.getChild(i);
            if (child.getType() == BEGIN) {
                this.tableIndex++;
                generate_ALLFUNCDEC(child);
                this.tableIndex++;
            }

            if (child.getType() == LOCAL_DECLARATION) {
                generate_LOCALDECLARATION(child);
            } else {
                if(child.getType()==PROC_DECLARATION){
                    generate_PROCDEC(child);
                }else {
                    generate_ALLFUNCDEC(child);
                }
            }
        }
        this.tableIndex = 0;
    }

    public void StartGeneration() throws Exception {
        builder.write("//Définitions des registres usuels")
                .write("SP EQU R15 //SP => StackPointer")
                .write("FR EQU R0// FR => FunctionResult")
                .write("WA EQU R11")   // utile dans le for ???
                .write("WR EQU R14 //WR=> Work Register")//Work register
                .write("BP EQU R13 // BP=> Base Pointer")//Base Pointer
                .write("SC EQU R12") //static chain
                .write("EXIT_EXC EQU 64 // EXIT EXCEPTION")
                .write("READ_EXC EQU 65 // READ EXCEPTION")
                .write("WRITE_EXC EQU 66 // WRITE EXCEPTION")
                .write("NUL EQU 0")  // definition of the null variables
                .write("NULL EQU 0")
                .write("NIL EQU 0")
                .write("STACK_ADRS EQU 0x1000")//the Stack : L'addresse début de la pile
                .write("LOAD_ADRS EQU 0xF000") // L'adresse debut du programme
                .write("\n")
                .write("ORG LOAD_ADRS")
                .write("START main_");


        //We add the assembly code of basic functions
        generate_Basic_print();
        generate_Basic_printi();
        generate_Basic_ITOA();


        if (root.getChildCount() != 0) {
            Tree child = root.getChild(0);
            switch (child.getType()) {
                case LABELLED_BLOCK:
                    Tree beginblock = generate_LABELLED_BLOCK(child);
                    generate_ALLFUNCDEC(beginblock);

                    builder.write("//FUNC DEC END");
                    envManager.createMainEnv();

                    generate_BEGIN(beginblock);
                    break;
                case BEGIN:
                    generate_ALLFUNCDEC(child);
                    builder.write("//FUNC DEC END");
                    envManager.createMainEnv();

                    generate_BEGIN(child);
                    break;
                default:
                    break;
            }
        }


        //envManager.unlink();
        builder.write("TRP #EXIT_EXC");
        builder.write("JEA @main_");


        builder.close();
    }


    public Tree generate_LABELLED_BLOCK(Tree LABELLEDBLOCK) {
        Tree secChild = LABELLEDBLOCK.getChild(1);
        if (secChild.getType() != BEGIN) {
            return generate_LABELLED_BLOCK(secChild);
        } else {
            return secChild;
        }
    }

    public void generate_BEGIN(Tree begin) throws Exception {
        for (int i = 0; i < begin.getChildCount(); i++) {
            Tree child = begin.getChild(i);
            switch (child.getType()) {
                case DECLARATIONS:
                    envManager.createBlockVariables(this.path.get(tableIndex).getOffset());
                    generate_DECLARATION(child);
                    break;
                case BLOCK:
                    generate_BLOCK(child);
                    break;
            }
        }
    }

    private void incrementTableIndex(Tree PROCDEC) {
        for (int i = 0; i < PROCDEC.getChildCount(); i++) {
            Tree child = PROCDEC.getChild(i);
            if (PROCDEC.getType() == BEGIN) {
                this.tableIndex++;//Entree
                incrementTableIndex(child);
                this.tableIndex++; //Sortie
            } else {
                incrementTableIndex(child);

            }
        }

    }
    private void generate_ARRAYCALL_ADDR(Tree arraycall,String ResultRegister) throws Exception {
        //0 array name
        String arrName=arraycall.getChild(0).getText();
        //1 array Index
        Tree indexes=arraycall.getChild(1);
        String registerBP="BP";
        int type=2;
        boolean statique=true;
        int staticoffset=2;

        if(statique){

            ArraySymbol arrsymbol=(ArraySymbol) this.path.get(this.tableIndex).identifySymbol(arrName,false);

            if(arrsymbol==null){
                //LEAP
                SymbolTable currentTable=this.path.get(this.tableIndex);
                ArraySymbol leapArrsymbol=(ArraySymbol) currentTable.identifySymbol(arrName,true);
                int NestingY = currentTable.getImbricationLevel(arrName, true);
                int n=currentTable.getNestingLevel()-NestingY;
                this.builder.write("LDW R2,BP");
                for(int i=0;i<n;i++) {
                    this.builder.write("ADQ -2,R2 //R2 holds a Static Chain");
                    this.builder.write("LDW R2,(R2) //LEAP to change environment");
                }
                registerBP="R2";
                arrsymbol=leapArrsymbol;

            }
            ArrayList<Integer> enjambes = getStaticArrayInfo(arrsymbol);
            ArrayList<Integer> borneInfs = getMinBounds(arrsymbol);
            int subToVirtualOrigin = substractToVO(enjambes, borneInfs);
            int offset = arrsymbol.getOffset() + staticoffset + 2;//impl;
            //i*e1+j*e2+k*e3
            //constant case
            int indexoffset = 0;
            this.builder.write("LDW R3,#0");
            for (int i = 0; i < indexes.getChildCount(); i++) {
                generate_EXPRESSION(indexes.getChild(i),"R6",true);
                this.builder.write("LDW R7, #"+enjambes.get(i)+"\n")
                        .write("MUL R6, R7, R6 // multiplication avec l'enjambés\n")
                        .write("ADD R3, R6, R3 // sommer les termes\n");

            }

            //
            this.builder.write("LDW R5,"+registerBP)
                    .write("LDW R4,#" + offset)
                    .write("SUB R5,R4,R5//@impl ")
                    .write("LDW R4,#" + subToVirtualOrigin)
                    .write("ADD R5,R4,R5 //(@Impl - v)")
                    .write("LDW R4,R3")
                    .write("SUB R5,R4," + ResultRegister); //Result register contient @T[i,j] pour accéder au contenu ajouter ()
        }

    }
    private int substractToVO(ArrayList<Integer> enjambes,ArrayList<Integer> BIs){
        int res=0;
        for(int i=0;i<enjambes.size();i++){
            res+=enjambes.get(i)*BIs.get(i);
        }
        return res;
    }
    private ArrayList<Integer> getMinBounds(ArraySymbol symbol){
        ArrayList<Integer> borneInf=new ArrayList();
        for(int i=0;i<symbol.getDimension();i++){
            borneInf.add(symbol.getBoundaries().get(i).getMinBoundary());

        }
        return borneInf;
    }
    private ArrayList<Integer> getStaticArrayInfo(ArraySymbol symbol){
        BASICTYPE type=symbol.getArrayType();
        int t=(type==INTEGER ||type==BOOLEAN)?2:4;
        //calcul des enjambés
        int ei=t;
        ArrayList<Integer> res=new ArrayList();
        res.add(0,ei);
        int dim=symbol.getDimension();
        for(int i=dim-2;i>=0;i--){
            Bounds bound=symbol.getBoundaries().get(i+1);
            int size=bound.getMaxBoundary() - bound.getMinBoundary() +1;
            ei=ei*size;
            res.add(0,ei);
        }

        return res;


    }
    private void generate_DECLARATION(Tree child) throws Exception {
        for (int i = 0; i < child.getChildCount(); i++) {
            Tree dec = child.getChild(i);
            switch (dec.getType()) {

                case SWITCH_DECLARATION:

                    generate_Switch(dec);
                    break;
                case LOCAL_DECLARATION:
                    //already generated at first //generate ALLFUNCDEC
                    //increment table index cas fonction (sans retour)
                    if (dec.getChildCount() == 2) {
                        if (dec.getChild(1).getType() == PROC_DECLARATION) {
                            incrementTableIndex(dec.getChild(1));
                        }
                    }
                    break;
                case PROC_DECLARATION:
                    incrementTableIndex(dec);
                    break;
                default:
                    break;
            }

        }


    }


    private void generate_LOCALDECLARATION(Tree localNode) throws Exception {
        if (localNode.getChildCount() == 2) {
            if (localNode.getChild(1).getType() == PROC_DECLARATION) {
                generate_PROCDEC(localNode.getChild(1));
            }
        }
    }

    private void generate_PROCDEC(Tree procNode) throws Exception {
        ProcSymbol proc = (ProcSymbol) this.path.get(this.tableIndex).identifySymbol(procNode.getChild(0).getText(), false);
        int procHashcode = procNode.getChild(0).hashCode();
        String procLabel = proc.getName();
        //linking environment
        this.envManager.link(procLabel, true);
        //proc begin
        this.tableIndex++;
        this.builder.write("//function bloc");
        generate_BEGIN(procNode.getChild(procNode.getChildCount() - 1));
        this.envManager.unlink();
        this.builder.write("RTS" + " // end of " + procLabel);
    }


    public String offsetString(int offset) {
        if (offset > 0) {
            return "-" + offset;
        } else {
            return (-offset) + "";
        }
    }

    public void putVarValueToRegister(String register, String name, boolean callbyvalue) throws IOException {
        //not done mazal khassek getVarTypeOffset
        SymbolTable currentTable = this.path.get(tableIndex);
        Symbol var = currentTable.identifySymbol(name, false);
        int staticoffset = 2;
        int retoffset = 4;
        if (var != null) {
            if (var instanceof VarSymbol) {
                int offset = var.getOffset() + staticoffset + getVarTypeOffset((VarSymbol) var);
                String offSt = offsetString(offset);
                //already exist in the current table
                if (callbyvalue) {
                    this.builder.write("LDW " + register + ",(BP)" + offSt + " // CHARGING VARIABLE TO " + register);
                } else {
                    //for the moment its not clear
                }
            } else {
                if (var instanceof ProcedureParameterSymbol) {
                    ProcedureParameterSymbol param = (ProcedureParameterSymbol) var;
                    int offset = param.getOffset() - retoffset + getParTypeOffset(param);
                    String offSt = offsetString(offset);
                    if (callbyvalue) {
                        this.builder.write(("LDW " + register + ",(BP)" + offSt + "// CHARGING PARAM TO " + register));
                    } else {
                        //not clear for now
                    }
                }
            }
        } else {
            var = currentTable.identifySymbol(name, true);
            int offset=0;
            if(var instanceof VarSymbol) {
                offset = var.getOffset() + staticoffset + getVarTypeOffset((VarSymbol) var);
            }else {
                if (var instanceof ProcedureParameterSymbol) {
                    offset = var.getOffset() - retoffset + getParTypeOffset((ProcedureParameterSymbol) var);
                }
            }
            String offSt = offsetString(offset);
            //variable non locale
            if (callbyvalue) {
                int NestingY = currentTable.getImbricationLevel(name, true);
                int n = currentTable.getNestingLevel() - NestingY;
                this.builder.write("LDW R2,BP");
                for (int i = 0; i < n; i++) {
                    this.builder.write("ADQ -2,R2 //R2 holds a Static Chain");
                    this.builder.write("LDW R2,(R2) //LEAP to change environment");
                }
                this.builder.write("LDW " + register + ",(R2)" + offSt + "// Found variable : " + name + "... loading it");
                //Not done
            }


        }
    }
    private void generate_BLOCK(Tree child) throws Exception {
        for (int i = 0; i < child.getChildCount(); i++) {
            Tree childStmt = child.getChild(i);
            generate_STATEMENT(childStmt);
        }
    }

    private int getVarTypeOffset(VarSymbol a) {
        switch (a.getTypevariable()) {
            case REAL:
                return 4;
            case INTEGER:
                return 2;
            case BOOLEAN:
                return 2;

        }
        return 99;
    }

    private int getParTypeOffset(ProcedureParameterSymbol par) {
        switch (par.getType()) {
            case INTEGER:
                return 2;
            case BOOLEAN:
                return 2;
        }
        return 99;
    }


    private boolean generate_storeValToVar(String varName, String valRegister) throws IOException {
        SymbolTable currentTable = this.path.get(tableIndex);
        Symbol var = currentTable.identifySymbol(varName, false);
        int staticoffset = 2;
        int retaddr=4;
        if (var != null) {
            if (var instanceof VarSymbol) {
                int offset = var.getOffset() + staticoffset + getVarTypeOffset((VarSymbol) var);
                String offSt = offsetString(offset);
                this.builder.write("STW " + valRegister + ", (BP)" + offSt);
                return true;
            }else {
                if (var instanceof ProcedureParameterSymbol) {
                    ProcedureParameterSymbol param = (ProcedureParameterSymbol) var;
                    int offset = param.getOffset() - retaddr + getParTypeOffset(param);
                    String offSt = offsetString(offset);
                    this.builder.write("STW " + valRegister + ", (BP)" + offSt);
                    return true;

                }
            }
        } else {
            var = currentTable.identifySymbol(varName, true);
            int offset=0;
            if (var instanceof VarSymbol) {
                offset = var.getOffset() + staticoffset + getVarTypeOffset((VarSymbol) var);
            }else{
                if(var instanceof  ProcedureParameterSymbol){
                    offset=var.getOffset()-retaddr+getParTypeOffset((ProcedureParameterSymbol) var);
                }
            }
            String offSt = offsetString(offset);
            int NestingY = currentTable.getImbricationLevel(varName, true);
            //
            int n = currentTable.getNestingLevel() - NestingY;
            this.builder.write("LDW R2,BP");
            for (int i = 0; i < n; i++) {
                this.builder.write("ADQ -2,R2 //R2 holds a Static Chain");
                this.builder.write("LDW R2,(R2) //LEAP to change environment");
            }
            this.builder.write("STW " + valRegister + ",(R2)" + offSt + "// Found variable... Storing it");
            //
            return true;
        }
        return false;
        //Not variable but its a parameter
    }

    public boolean isBooleanOperation(Tree node) {
        int type = node.getType();
        if (type >= T__70 && type <= T__79 || type == T__105 || type == IF) {
            return true;
        } else {
            return false;
        }

    }


    public void pushParameters(Tree listParameters) throws Exception {
        //all parameters are integers
        for (int i = 0; i < listParameters.getChildCount(); i++) {
            generate_EXPRESSION(listParameters.getChild(i), "R5", true);
            this.builder.write("STW R5,-(SP) // pushing parameter ");
        }
    }

    public void popParameters(Tree listParameters) throws Exception {
        //all parameters are integers
        for (int i = 0; i < listParameters.getChildCount(); i++) {
            this.builder.write("ADQ 2,SP //popping parameters");
        }

    }

    public void saveRegisters() throws IOException {
        for (int i = 1; i <= 11; i++) {
            this.builder.write("STW R" + i + " ,-(SP) //saving registers");
        }
    }

    public void restoreRegisters() throws IOException {
        for (int i = 11; i >= 1; i--) {
            this.builder.write("LDW R" + i + " ,(SP)+ //reloading registers");
        }
    }

    public void generate_FUNCTION_CALL(Tree callNode, ProcSymbol procedure) throws Exception {
        builder.write("// " + readerSource.getLine(callNode.getLine()));


        if (callNode.getChild(0).getText().equals("outstring") || callNode.getChild(0).getText().equals("outinteger")) {
            this.generate_SystemFunctions(callNode.getChild(1).getChild(1));
        } else {
            if (callNode.getChildCount() == 2) {
                Tree listParameters = callNode.getChild(1);
                String funcName = callNode.getChild(0).getText();
                saveRegisters();
                pushParameters(listParameters);
                this.builder.write("//Computing Static chaining");
                this.builder.write("LDW SC,BP //puting BP in SC");
                SymbolTable parentTable = procedure.getAssociatedTable();
                int n = this.path.get(this.tableIndex).getNestingLevel() - parentTable.getNestingLevel();
                for (int i = 0; i < n; i++) {
                    this.builder.write("ADQ -2,SC //SC holds a Static Chain");
                    this.builder.write("LDW SC,(SC) //SC LEAP");
                }
                this.builder.write("JSR @" + funcName + "_" + " // function call");
                popParameters(listParameters);
                restoreRegisters();
                this.builder.write("//End of FunctionCall");
            }

        }

    }

    public void generate_EXPRESSION(Tree child, String ResultRegister, boolean IfArithmetic) throws Exception {
        switch (child.getType()) {
            case Number:
                try {
                    int value = Integer.parseInt(child.getText());
                    this.builder.write("LDW " + ResultRegister + ", #" + child.getText());
                } catch (NumberFormatException e) {
                    //real

                }
                break;
            case ARRAY_ACCESS:
                generate_ARRAYCALL_ADDR(child,"R5");
                //R5 contains @T[i,j,k];
                this.builder.write("LDW "+ResultRegister+", (R5) // "+ResultRegister+" Contains value of the array Call");
                break;
            case Identifier:
                putVarValueToRegister(ResultRegister, child.getText(), true);
                //Assignment stores the value in the variable (in the stack)
                break;
            case FUNCTION_CALL:
                //proceed to put result in resultRegister
                ProcSymbol procedure = (ProcSymbol) this.path.get(this.tableIndex).identifySymbol(child.getChild(0).getText(), true);
                generate_FUNCTION_CALL(child, procedure);
                this.builder.write("LDW " + ResultRegister + ", R0 // getting the result of " + child.getChild(0).getText() + "'s call");
                break;
            case T__101:
                this.builder.write("LDW " + ResultRegister + ", #1");
                this.builder.write("STW " + ResultRegister + ",-(SP)");
                break;
            case T__88:
                this.builder.write("LDW " + ResultRegister + ", #0");
                this.builder.write("STW " + ResultRegister + ",-(SP)");
                break;


            default:
                if (isArithmeticOperation(child, IfArithmetic)) {
                    Tree op = child;
                    if (op.getChildCount() == 2) {
                        Tree opLeft = op.getChild(0);
                        Tree opRight = op.getChild(1);
                        generate_EXPRESSION(opLeft, ResultRegister, IfArithmetic);
                        // SP contient opleft
                        this.builder.write("STW " + ResultRegister + ",-(SP)");
                        generate_EXPRESSION(opRight, ResultRegister, IfArithmetic);
                        switch (op.getType()) {
                            case T__62: //+
                                this.builder.write("LDW R2,(SP)+");
                                this.builder.write("ADD R2," + ResultRegister + "," + ResultRegister);
                                break;
                            case T__64: //-
                                this.builder.write("LDW R2,(SP)+");
                                this.builder.write("SUB R2," + ResultRegister + "," + ResultRegister);
                                break;
                            case T__60://*
                                this.builder.write("LDW R2,(SP)+");
                                this.builder.write("MUL R2," + ResultRegister + "," + ResultRegister);

                                break;
                            case T__66: // //

                                break;
                            case T__65: // /
                                this.builder.write("LDW R2,(SP)+");
                                this.builder.write("DIV R2," + ResultRegister + "," + ResultRegister);
                                break;
                        }

                    }
                    if(op.getChildCount()==1){
                        Tree minusChild=op.getChild(0);
                        generate_EXPRESSION(minusChild, ResultRegister, IfArithmetic);

                        switch(op.getType()){
                            case T__64:
                                this.builder.write("NEG "+ResultRegister+","+ResultRegister);
                                break;
                        }
                    }

                }

                if (isBooleanOperation(child)) {

                    Tree bool = child;
                    if (bool.getChildCount() == 2) {
                        Tree boolLeft = bool.getChild(0);
                        Tree boolRight = bool.getChild(1);

                        generate_EXPRESSION(boolLeft, "R1", IfArithmetic);

                        generate_EXPRESSION(boolRight, "R2", IfArithmetic);


                        switch (bool.getType()) {

                            case T__70://<


                                this.builder.write("CMP R2,R1");
                                this.builder.write("BLE 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");

                                break;

                            case T__71://<=


                                this.builder.write("CMP R2,R1");
                                this.builder.write("BLW 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");

                                break;

                            case T__77:// >=

                                this.builder.write("CMP R2,R1");
                                this.builder.write("BGT 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");


                                break;


                            case T__74:// =

                                this.builder.write("CMP R2,R1");
                                this.builder.write("BNE 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");

                                break;


                            case T__73:// !=


                                this.builder.write("CMP R2,R1");
                                this.builder.write("BEQ 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");


                                break;


                            case T__76://>

                                this.builder.write("CMP R2,R1");
                                this.builder.write("BGE 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");


                                break;

                            case T__78://AND

                                this.builder.write("LDW R1, (SP)+");
                                this.builder.write("LDW R2, (SP)+");
                                this.builder.write("AND R1 ,R1, R2");
                                this.builder.write("STW  R1 , -(SP)");


                                break;

                            case T__79://OR
                                this.builder.write("LDW R1, (SP)+");
                                this.builder.write("LDW R2, (SP)+");
                                this.builder.write("OR R2 ,R1, R1");
                                this.builder.write("STW  R1 , -(SP)");
                                break;


                            default:

                                this.builder.write("CMP R2, R1");
                                this.builder.write("BNE 4");
                                this.builder.write("LDQ  1," + ResultRegister);
                                this.builder.write("BMP 2");
                                this.builder.write("LDQ 0," + ResultRegister);
                                this.builder.write("STW  " + ResultRegister + " , -(SP)");


                        }


                    }


                }
        }
    }

    public boolean isArithmeticOperation(Tree relatedNode, boolean IFarithmetic) {
        int type = relatedNode.getType();
        return (type >= T__60 && type <= T__62) || (type >= T__64 && type <= T__66) || (type == IF && IFarithmetic); //IF IS INCLUDED TOO
    }

    private void generate_ASSIGNMENT(Tree assignNode) throws Exception {
        builder.write("// " + readerSource.getLine(assignNode.getLine()));
        Tree leftPart=assignNode.getChild(0);
        String leftPartName=leftPart.getText();
        Tree rightPart=assignNode.getChild(1);
        if(leftPart.getType()==ARRAY_ACCESS){
            Symbol sym=this.path.get(tableIndex).identifySymbol(leftPart.getChild(0).getText(),true);
            if(sym instanceof ArraySymbol){

                ArraySymbol arr= (ArraySymbol) sym;
                generate_EXPRESSION(rightPart,"R1",true);
                generate_ARRAYCALL_ADDR(leftPart,"R5");
                this.builder.write("STW R1,(R5)//Storing in array");//Bkit hna
            }
        }
        if(leftPart.getType()==Identifier){
            //variable or parameter
            Symbol sym=this.path.get(tableIndex).identifySymbol(leftPartName,true);

            if(sym instanceof VarSymbol){
                //variable
                VarSymbol var=(VarSymbol) sym;
                if(var.getTypevariable()!=BOOLEAN){
                    //IFARITHMETIC
                    generate_EXPRESSION(rightPart,"R1",true);//result in R1
                    generate_storeValToVar(leftPart.getText(),"R1");//Takes from R1

                }else{
                    //BOOLEAN VAR
                    generate_EXPRESSION(rightPart,"R1",true);//result in R1
                    this.builder.write("LDW R3,(SP)+");
                    generate_storeValToVar(leftPart.getText(),"R1");//Ta
                }

            }else{
                //function name
                if(sym instanceof  ProcSymbol){
                    ProcSymbol funcReturn=(ProcSymbol) sym;
                    if(funcReturn.getReturnType()== BOOLEAN){
                        generate_EXPRESSION(rightPart,"FR",false);
                    }else{
                        generate_EXPRESSION(rightPart,"FR",true);
                    }
                }
                //parameter
                if(sym instanceof ProcedureParameterSymbol){
                    ProcedureParameterSymbol param=(ProcedureParameterSymbol) sym;
                    if(param.getType()!=PARAMETERTYPE.INTEGER){
                        //IFARITHMETIC
                        generate_EXPRESSION(rightPart,"R1",true);//result in R1
                        generate_storeValToVar(leftPart.getText(),"R1");//Takes from R1

                    }else{
                        //BOOLEAN VAR
                        generate_EXPRESSION(rightPart,"R1",true);//result in R1
                        this.builder.write("LDW R3,(SP)+");
                        generate_storeValToVar(leftPart.getText(),"R1");//Ta
                    }
                }
            }
        }
    }


    //ASSIGN multiple assignments isn't treated yet
    private void generate_STATEMENT(Tree child) throws Exception {
        switch (child.getType()) {
            case BEGIN:
                this.envManager.link(null, false);
                this.tableIndex++;
                this.builder.write("//NEW BLOCK " + this.path.get(this.tableIndex).getNestingLevel() + "," + this.path.get(this.tableIndex).getRegionNumber());
                this.generate_BEGIN(child);
                this.tableIndex++;

                this.envManager.unlink();
                break;
            case ASSIGNMENT:
                generate_ASSIGNMENT(child);
                break;
            case IF:
                generateIf(child);
                break;
            case FOR:
                generate_For(child);
                break;
            case FUNCTION_CALL:
                generate_FUNCTION_CALL(child, (ProcSymbol) this.path.get(this.tableIndex).identifySymbol(child.getChild(0).getText(), true));
                break;
            case GOTO:
                generate_Gotostatement(child);
                break;

            case LABELLED_STATEMENT:
                generate_Label(child);
                break;
            case LABELLED_EMPTY_STATEMENT :
                generate_Label(child);
                break;

            case EMPTY_STATEMENT:
                break;
            default:

                this.builder.write("JSR @" + child.getText() + "_");
                break;

        }
    }

    private void generateIf(Tree ifNode) throws Exception {

        String if_begin = "if" + ifNode.hashCode();
        String beginlabelIF = "condition_" + if_begin;
        String endconditionLabel = "end_condition_" + if_begin;
        String else_ = "else_begin_" + if_begin;
        String endif_block = "end_cond_if_" + if_begin;


        Tree condtion = ifNode;
        builder.write(beginlabelIF);


        for (int i = 0; i < ifNode.getChildCount(); i++) {
            Tree child = ifNode.getChild(i);
            switch (child.getType()) {
                case THEN:

                    generateThen(child);
                    this.builder.write("JMP  #" + endif_block + "-$-2");
                    this.builder.write(endconditionLabel);


                    break;

                case ELSE:
                    this.builder.write(else_);
                    generatElse(child);
                    break;

                default:

                    generate_EXPRESSION(ifNode.getChild(0), "R2", true);
                    this.builder.write("LDW R2, (SP)+");
                    this.builder.write("TST R2");
                    this.builder.write("JEQ #" + endconditionLabel + "-$-2");


            }
        }

        this.builder.write(endif_block);

    }


    private void generatElse(Tree child) throws Exception {
        generate_STATEMENT(child.getChild(0));
    }

    private void generateThen(Tree child) throws Exception {
        generate_STATEMENT(child.getChild(0));
    }


// Here we generate the label .

    private void generate_Label(Tree labelNode) throws Exception {

        String nom = labelNode.getChild(0).getText();
        String label = nom + "_";
        builder.write(label);


        for (int i = 1; i < labelNode.getChildCount(); i++) {

            generate_STATEMENT(labelNode.getChild(i));
        }


    }


    public void generate_Switch(Tree child) throws Exception {

        for (int i = 0; i < child.getChildCount(); i++) {
            Tree switchnode = child.getChild(i);
            switch (switchnode.getType()) {
                case SWITCH_LIST:

                    generate_Switch_List(switchnode);
                    this.builder.write(switchnode.getParent().getChild(0).getText()+"_end");
                    break;

                default:

                    this.builder.write("JMP #"+switchnode.getText() + "_end-$-2");
                    this.builder.write(switchnode.getText()+"_");

            }
        }
    }

    private void generate_Switch_List(Tree switchListNode) throws Exception {


        for (int i = 0; i < switchListNode.getChildCount(); i++) {

            Tree child = switchListNode.getChild(i);
            switch (child.getType()) {


                case IF:
                    this.builder.write(switchListNode.getParent().getChild(0).getText()+"_"+i);
                    generateIf(child);
                    this.builder.write(switchListNode.getParent().getChild(0).getText()+"_"+i+"end");
                    break;

                default:
                    this.builder.write(switchListNode.getParent().getChild(0).getText()+"_"+i);
                    this.builder.write("JMP #" + child.getText() + "_-$-2");
                    // this.builder.write("RTS");
                    this.builder.write(switchListNode.getParent().getChild(0).getText()+"_"+i+"end");
                    break;

            }

        }


    }


    // Here we genrate a goto

    private void generate_Gotostatement(Tree gotoCallNode) throws Exception {

        String labelIdf = gotoCallNode.getChild(0).getText();

        switch(gotoCallNode.getChild(0).getType()) {

            case SWITCH_CALL:

                generate_Switch_Case(gotoCallNode.getChild(0));
                break;

            default:

                String label = labelIdf + "_";

                builder.write("//Appel du label : " + gotoCallNode.getChild(0).getText());
                builder.write("JMP #" + label + "-$-2" + "          //on appelle le label à l'aide de son adresse");  //c'est pas un JSR qu'il faut faire pour le goto je crois / Jaber

        }
    }

    private void generate_Switch_Case(Tree child) throws Exception {

        String nom=child.getChild(0).getText();
        String numero=child.getChild(1).getChild(0).getText();
        this.builder.write("JMP #"+nom+"_"+numero+"-$-2");



    }





    private void generate_SystemFunctions(Tree Node) throws Exception {

        switch (Node.getType()) {
            case STRING:
                generate_print(Node);
                break;


            case FUNCTION_CALL:
                generate_printi(Node);
                break;


            case Identifier:
                generate_printi(Node);
                break;


            case ARRAY_ACCESS:
                generate_printi(Node);
                break;
            case Number:
                generate_printi(Node);
                break;
            default:
                generate_printi(Node);
                break;
        }

    }


    private void generate_print(Tree Node) throws Exception {


        generateString(Node);


        int R = 1;

        builder.write("STW R" + R + ", -(SP)");
        builder.write("JSR @print_");
        builder.write("ADI SP, SP, #2");

    }


    private void generate_printi(Tree Node) throws Exception {
        if (Node.getType() == Number) {
            builder.write("LDW " + "R1" + ", #" + Node.getText());
            builder.write("STW R" + 1 + ", -(SP)");
        } else {
            generate_EXPRESSION(Node, "R1", true);
            int R = 1;
            builder.write("STW R" + R + ", -(SP)");
        }


        builder.write("JSR @printi_");
        builder.write("ADI SP, SP, #2");

    }


    private void generate_Basic_ITOA() throws IOException {
        this.builder
                .write("ITOA_I       equ 4      // offset du paramètre i\n" +
                        "ITOA_P      equ 6      // offset du paramètre p\n" +
                        "ITOA_B      equ 8      // offset du paramètre b\n" +
                        "ASCII_MINUS equ 45     // code ASCII de -\n" +
                        "ASCII_PLUS  equ 43     // code ASCII de +\n" +
                        "ASCII_SP    equ 32     // code ASCII d'eSPace SP\n" +
                        "ASCII_0     equ 48     // code ASCII de zéro (les autres chiffres jusqu'à 9 suivent dans l'ordre)\n" +
                        "ASCII_A     equ 65     // code ASCII de A (les autres lettres jusqu'à Z suivent dans l'ordre alphabétique)\n" +
                        "itoa_\n" +
                        "stw BP, -(SP)\n" +
                        "ldw BP, SP\n" +
                        "// récupération des paramètres depuis pile vers registres\n" +
                        "ldw r0, (BP)ITOA_I    // r0 = i    \n" +
                        "ldw r1, (BP)ITOA_B    // r1 = b\n" +
                        "// gère le signe: normalement itoa gère des int c'est à dire des entiers signés, \n" +
                        "// mais en fait seulement pour b=10;\n" +
                        "// dans ce cas calcule le signe dans r3 et charge r0 avec la valeur absolue de i\n" +
                        "ldq ASCII_SP, r3      // code ASCII de eSPace (SPace) -> r3\n" +
                        "ldq 10, WR            // 10 -> WR\n" +
                        "cmp r1, WR            // charge les indicateurs de b - 10\n" +
                        "bne NOSIGN-$-2        // si non égal (donc si b != 10) saute en NOSIGN, sinon calcule signe\n" +
                        "ldq ASCII_PLUS, r3    // charge le code ASCII du signe plus + dans r3\n" +
                        "tst r0                // charge les indicateurs de r0 et donc de i\n" +
                        "bge POSIT-$-2         // saute en POSIT si i >= 0\n" +
                        "neg r0, r0            // change le signe de r0\n" +
                        "ldq ASCII_MINUS, r3   // charge le code ASCII du signe moins - dans r3\n" +
                        "POSIT   NOP                   // r3 = code ASCII de signe: SP pour aucun, - ou +\n" +
                        "\n" +
                        "// convertit l'entier i en chiffres et les empile de droite à gauche\n" +
                        "NOSIGN  ldw r2, r0            // r2 <- r0\n" +
                        "CNVLOOP ldw r0, r2            // r0 <- r2\n" +
                        "// effectue \"créativement\" la division par b supposé pair (car l'instruction div est hélas signée ...)\n" +
                        "// d=2*d' , D = d * q + r  , D = 2*D'+r\" , D' = d' * q + r' => r = 2*r'+r\"\n" +
                        "// un bug apparaît avec SRL r0, r0 avec r0 = 2 : met CF à 1 !!\n" +
                        "srl r1, r1            // r1 = b/2\n" +
                        "ani r0, r4, #1        // ANd Immédiate entre r0 et 00...01 vers r4:\n" +
                        "\t\t\t\t  // bit n°0 de r0 -> r4; r4 = reste\" de r0/2\n" +
                        "srl r0, r0            // r0 / 2 -> r0\n" +
                        "div r0, r1, r2        // quotient = r0 / r1 -> r2, reste' = r0 % r1 -> r0\n" +
                        "shl r0, r0            // r0 = 2 * reste'\n" +
                        "add r0, r4, r0        // r0 = reste = 2 * reste' + reste\" => r0 = chiffre\n" +
                        "shl r1, r1            // r1 = b\n" +
                        "\n" +
                        "adq -10, r0           // chiffre - 10 -> r0 \n" +
                        "bge LETTER-$-2        // saute en LETTER si chiffre >= 10\n" +
                        "adq 10+ASCII_0, r0    // ajoute 10 => r0 = chiffre, ajoute code ASCII de 0 \n" +
                        "\t\t\t\t  // => r0 = code ASCII de chiffre\n" +
                        "bmp STKCHR-$-2        // saute en STKCHR \n" +
                        "LETTER  adq ASCII_A, r0       // r0 = ASCII(A) pour chiffre = 10, ASCII(B) pour 11 ...\n" +
                        "\t\t\t\t  // ajoute code ASCII de A => r = code ASCII de chiffre\n" +
                        "STKCHR  stw r0, -(SP)         // empile code ASCII du chiffre \n" +
                        "\t\t\t\t  // (sur un mot complet pour pas désaligner pile)\n" +
                        "tst r2                // charge les indicateurs en fonction du quotient ds r2)\n" +
                        "bne CNVLOOP-$-2       // boucle si quotient non nul; sinon sort\n" +
                        "// les caractères sont maintenant empilés : gauche en haut et droit en bas\n" +
                        "// recopie les caractères dans le tampon dans le bon ordre: de gauche à droite\n" +
                        "ldw r1, (BP)ITOA_P    // r1 pointe sur le début du tampon déjà alloué \n" +
                        "stb r3, (r1)+         // copie le signe dans le tampon\n" +
                        "CPYLOOP ldw r0, (SP)+         // dépile code du chiffre gauche (sur un mot) dans r0\n" +
                        "stb r0, (r1)+         // copie code du chiffre dans un Byte du tampon de gauche à droite\n" +
                        "cmp SP, BP            // compare SP et sa valeur avant empilement des caractères qui était BP\n" +
                        "bne CPYLOOP-$-2       // boucle s'il reste au moins un chiffre sur la pile\n" +
                        "ldq 10, r0\n" +
                        "stb r0, (r1)+\n" +
                        "ldq NUL, r0           // charge le code du caractère NUL dans r0\n" +
                        "stb r0, (r1)+         // sauve code NUL pour terminer la chaîne de caractères\n" +
                        "// termine\n" +
                        "ldw r0, (BP)ITOA_P    // retourne le pointeur sur la chaîne de caractères\n" +
                        "// UNLINK: fermeture de l'environnement de la fonction itoa\n" +
                        "ldw SP, BP            // SP <- BP : abandonne infos locales; SP pointe sur ancinne valeur de BP\n" +
                        "ldw BP, (SP)+         // dépile ancienne valeur de BP dans BP; SP pointe sur adresse de retour\n" +
                        "RTS                   // retourne au programme appelant");
    }


    private void generate_Basic_print() throws IOException {
        builder.write("print_     \n" +
                "LDQ 0, R1\n" +
                "STW BP, -(SP)\n" +
                "LDW BP, SP\n" +
                "SUB SP, R1, SP\n" +
                "LDW R0, (BP)4\n" +
                "TRP #WRITE_EXC\n" +
                "LDW SP, BP\n" +
                "LDW BP, (SP)+\n" +
                "RTS ");
    }

    private void generate_Basic_printi() throws IOException {
        builder.write("printi_\n" +
                "STW BP, -(SP)\n" +
                "LDW BP, SP\n" +
                "ADI SP, SP, #-8\n" +
                "ADI SP, SP, #-2\n" +
                "LDW R0, (BP)4\n" +
                "STW R0, (BP)-10\n" +
                "LDW R0, #10\n" +
                "STW R0, -(SP)\n" +
                "ADI BP, R0, #-8\n" +
                "STW R0, -(SP)\n" +
                "LDW R0, (BP)-10\n" +
                "STW R0, -(SP)\n" +
                "JSR @itoa_\n" +
                "ADI SP, SP, #6\n" +
                "ADI BP, R0, #-8\n" +
                "STW R0, -(SP)\n" +
                "JSR @print_\n" +
                "ADI SP, SP, #2\n" +
                "LDW SP, BP\n" +
                "LDW BP, (SP)+\n" +
                "RTS");
    }


    public void generateString(Tree node) throws Exception {

      builder.write("STRING" + node.hashCode() + " string " + node.getText())
               .write("LDW R" + 1 + ",#" + "STRING" + node.hashCode());

    }


    private void generate_For(Tree forNode) throws Exception {


        builder.write("// " + readerSource.getLine(forNode.getLine()));

        Tree condition = null;

        // les éléments de la condition
        Tree variable_iteration = forNode.getChild(0);
        Tree assignationvaleur = forNode.getChild(1).getChild(0).getChild(0);


        String label = "For" + forNode.hashCode();
        String beginLabel = "begin_cond" + "_" + label;
        String endLabel = "end_cond_" + "_" + label;

        generate_AssignmentFor(variable_iteration, assignationvaleur);

        Tree bloc_do = forNode.getChild(forNode.getChildCount() - 1);

        builder.write(beginLabel);


        for (int i = 0; i < forNode.getChild(1).getChildCount(); i++) {
            Tree actualNode = forNode.getChild(1).getChild(i); // la liste des for_elements


            if (actualNode.getChildCount() == 1) {   // on a une seule itération

                generate_AssignmentFor(variable_iteration, actualNode.getChild(0));
                generate_storeValToVar(forNode.getChild(0).getText(),"R1");

                builder.write("// " + readerSource.getLine(bloc_do.getChild(0).getLine()) + " Test1");
                generate_STATEMENT(bloc_do.getChild(0));


            } else {


                if (actualNode.getChild(1).getType() == STEP) {

                    generate_EXPRESSION(forNode.getChild(0), "R1", true);


                    condition = actualNode.getChild(1).getChild(1);


                    generate_EXPRESSION(condition, "R2", true);


                    builder.write("CMP R" + "1" + ", R" + "2")
                            .write("JGT #" + endLabel + "-$-2");


                    builder.write("// " + readerSource.getLine(bloc_do.getLine()) + " Test2");
                    generate_STATEMENT(bloc_do.getChild(0));


                    generate_EXPRESSION(forNode.getChild(0), "R1", true);


                    builder.write("// " + forNode.getChild(0).getText());

                    generate_EXPRESSION(actualNode.getChild(1).getChild(0),"R3",true);

                    builder.write("ADD R3,R1,R1");


                    generate_storeValToVar(forNode.getChild(0).getText(),"R1");
                    builder.write("JMP #" + beginLabel + "-$-2");



                }else if(actualNode.getChild(1).getType() == WHILE){

                    String label_while = "while" + actualNode.getChild(1).hashCode();
                    String beginLabelwhile = "begin_cond_" + label_while;
                    String endLabelwhile = "end_cond_" + label_while;

                    Tree condition_while = actualNode.getChild(1).getChild(0);

                    builder.write(beginLabelwhile);
                    generate_EXPRESSION(condition_while, "R2", false);

                    int r0 = 2;
                    builder.write("//  La condition");
                    builder.write("TST R" + r0);
                    builder.write("JEQ #" + endLabelwhile + "-$-2");

                    generate_BLOCK(bloc_do);

                    builder.write("JMP #" + beginLabelwhile + "-$-2");
                    builder.write(endLabelwhile);


                }
            }


        }
        builder.write(endLabel);


    }




    private void generate_AssignmentFor(Tree leftPart, Tree rightPart) throws Exception {

        String leftPartName=leftPart.getText();
        if(leftPart.getType()==Identifier){
            //variable or parameter
            Symbol sym=this.path.get(tableIndex).identifySymbol(leftPartName,true);
            if(sym instanceof VarSymbol){
                //variable
                VarSymbol var=(VarSymbol) sym;
                if(var.getTypevariable()!=BOOLEAN){
                    //IFARITHMETIC
                    generate_EXPRESSION(rightPart,"R1",true);//result in R1
                    generate_storeValToVar(leftPart.getText(),"R1");//Takes from R1

                }else{
                    //BOOLEAN VAR
                    generate_EXPRESSION(rightPart,"R1",true);//result in R1
                    this.builder.write("LDW R3,(SP)+");
                    generate_storeValToVar(leftPart.getText(),"R1");//Ta
                }

            }else{
                //function name
                if(sym instanceof  ProcSymbol){
                    ProcSymbol funcReturn=(ProcSymbol) sym;
                    if(funcReturn.getReturnType()== BOOLEAN){
                        generate_EXPRESSION(rightPart,"FR",false);
                    }else{
                        generate_EXPRESSION(rightPart,"FR",true);
                    }
                }
                //parameter
            }
        }
    }



}