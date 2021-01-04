package ALGOL60.TDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private String TableName;
    private EnumTypeTDS typeTDS;
    private int RegionNumber;
    private int NestingLevel;
    private SymbolTable parent;
    private Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    private int offset=0;

    public SymbolTable(EnumTypeTDS typeTDS, int regionNumber, int nestingLevel, SymbolTable parent) {
        this.typeTDS = typeTDS;
        RegionNumber = regionNumber;
        NestingLevel = nestingLevel;
        this.parent = parent;
        this.TableName = "TDS[Region=" + regionNumber + ",Nesting=" + nestingLevel + "]";

    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    public int getOffset() {
        return offset;
    }

    public void addVarSymbol(VarSymbol varsymbol){
        switch(varsymbol.getTypevariable()){
            case INTEGER:
                varsymbol.setOffset(offset);
                offset+=2;
                break;
            case BOOLEAN:
                varsymbol.setOffset(offset);
                offset+=2;

                //IN PROGRESS
                break;
            case REAL:
                varsymbol.setOffset(offset);
                offset+=4;
                break;
        }
        addSymbol(varsymbol);
        System.out.println("Adding to Table "+this.TableName+"Value:"+varsymbol.toString());
    }
    public void addArraySymbol(ArraySymbol arraySymbol){
        switch(arraySymbol.getArrayType()){
            case INTEGER:
                arraySymbol.setOffset(offset);
                offset+=arraySymbol.getSize()*2;
                break;
            case BOOLEAN:
                arraySymbol.setOffset(offset);
                offset+=arraySymbol.getSize()*2;

                //IN PROGRESS
                break;
            case REAL:
                arraySymbol.setOffset(offset);
                offset+=arraySymbol.getSize()*4;
                break;
        }
        addSymbol(arraySymbol);

    }
    public void addProcSymbol(ProcSymbol procsymbol){
        procsymbol.setOffset(offset);
        addSymbol(procsymbol);

    }
    public void addSymbol(Symbol symbol){
        //pour label
        if(symbol.getSymboltype()==SymbolType.LABEl) {
            symbol.setOffset(offset);
            offset += 2;
        }

        //switch add
        if(symbol.getSymboltype()==SymbolType.SWITCH) {

            System.out.println(symbol.getName());
            int nbrecas = ((SwitchSymbol) symbol).getNombreDeCas();
            System.out.println(nbrecas);
            symbol.setOffset(offset);
            offset += 2;

        }
        if(checkSymbolExist(symbol.getName(),false)){
            System.out.println("Semantic Error:Line "+symbol.getNode().getLine()+" Duplicate symbol "+symbol.getName());
        }else{
            if(checkSymbolExist(symbol.getName(),true)){
                System.out.println("Redefining "+symbol.getName()+"...");
            }
        }
        this.symbols.put(symbol.getName(),symbol);


    }



    private int findOffsetIncrement(ProcedureParameterSymbol procparameter){
        switch(procparameter.getType()){
            case REAL:
                return 4;
            case INTEGER:
                return 2;
            case BOOLEAN:
                return 2;
            case STRING:
                return 2;
            case SWITCH:
                return 2;
            case LABEL:
                return 2;
            case PROCEDURE:
                return 4;
            case ARRAY:
                return 4;
            case REAL_PROCEDURE:
                return 4;
            case REAL_ARRAY:
                return 4;
            case INTEGER_ARRAY:
                return 2;
            case INTEGER_PROCEDURE:
                return 2;

            case BOOLEAN_ARRAY:
                return 2;
            case BOOLEAN_PROCEDURE:
                return 2;
            case UNDEFINED:
                return 99;
        }
        return  99;
    }

    public void addProcParameters(ArrayList<ProcedureParameterSymbol> allparas){
        if(allparas!=null && allparas.size()>0) {
            for (int i = 0; i <allparas.size(); i++) {

                ProcedureParameterSymbol parameter = allparas.get(i);
                System.out.println("parameter found"+parameter.getName());
                offset -= findOffsetIncrement(parameter);
                this.symbols.put(parameter.getName(),parameter);

                parameter.setOffset(offset);
            }
            offset = 0;
        }
    }
    public EnumTypeTDS getTypeTDS() {
        return typeTDS;
    }

    public void setTypeTDS(EnumTypeTDS typeTDS) {
        this.typeTDS = typeTDS;
    }

    public int getRegionNumber() {
        return RegionNumber;
    }

    public void setRegionNumber(int regionNumber) {
        RegionNumber = regionNumber;
    }

    public int getNestingLevel() {
        return NestingLevel;
    }

    public void setNestingLevel(int nestingLevel) {
        NestingLevel = nestingLevel;
    }

    public SymbolTable getParent() {
        return parent;
    }

    public void setParent(SymbolTable parent) {
        this.parent = parent;
    }
    public boolean checkSymbolExist(String name,boolean checkParent){
        Symbol searchedSymbol=this.symbols.get(name);
        if(searchedSymbol==null){
            if(checkParent && this.parent!=null){
                return this.parent.checkSymbolExist(name,true);

            }else{
                return false;
            }
        }else{
            return true;
        }

    }
    public Symbol identifySymbol(String name,boolean checkParent){
        Symbol searchedSymbol=this.symbols.get(name);
        if(searchedSymbol==null){
            if(checkParent && this.parent!=null){
                return this.parent.identifySymbol(name,true);

            }else{
                return null;
            }
        }else{
            return searchedSymbol;
        }

    }

    public int getImbricationLevel(String name,boolean checkParent){

        Symbol searchedSymbol=this.symbols.get(name);
        if(searchedSymbol==null){
            if(checkParent && this.parent!=null){
                return this.parent.getImbricationLevel(name,true);

            }else{
                return -1;
            }
        }else{
            return this.getNestingLevel();
        }


    }




    public int getVariableSize(VarSymbol variableSymbol) {
        int size = 0;
        BASICTYPE type = variableSymbol.getTypevariable();

        //if(type.isRecord()) {
        //	size = this.getStructureSize(this.getStructureSymbol(type.getNom(), true));;
        //}
        //if(type.equals("ARRAY")) {
          //  size = this.getTableauxSymbolSize(this.getTableauxSymbol("ARRAY", true));
        //}
        if(type == BASICTYPE.INTEGER) {
            size += 2;
        }
        else if(type == BASICTYPE.REAL) {
            size += 4;
        }else if(type == BASICTYPE.BOOLEAN){
            size += 2;
        }

        return size;
    }





    public int getEnvironmentSize() {
        int size = 0;

        for(Symbol symbol: this.getSymbols().values()) {
            if(symbol instanceof VarSymbol) {
                size += this.getVariableSize((VarSymbol) symbol);
            }
            else if(symbol instanceof ProcedureParameterSymbol) {
                size += this.findOffsetIncrement((ProcedureParameterSymbol) symbol);
            }
        }

        return size;
    }


}
