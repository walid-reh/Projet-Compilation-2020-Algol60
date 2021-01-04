package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class ProcSymbol extends Symbol {
    private BASICTYPE returnValue;
    private int numberOfparameters=0;

    private ArrayList<ProcedureParameterSymbol> listparameters;
    private SymbolTable declarationSymbolTable;


    protected ProcSymbol(String name, int offset, Scope scope, Tree node,BASICTYPE returnValue,SymbolTable declarationTable) {
        super(SymbolType.PROCEDURE, name, offset, scope, node);
        this.returnValue=returnValue;
        this.declarationSymbolTable=declarationTable;
    }

    public SymbolTable getAssociatedTable(){
        return this.declarationSymbolTable;
    }
    public BASICTYPE getReturnType(){
        return this.returnValue;
    }

    public int getNumberOfparameters(){
        return this.numberOfparameters;
    }


    public void setReturnType(BASICTYPE returnValue) {
        this.returnValue = returnValue;
    }

    public ArrayList<ProcedureParameterSymbol> getListparameters(){
        return this.listparameters;
    }

    public void setListparameters(ArrayList<ProcedureParameterSymbol> listparameters) {
        this.listparameters = listparameters;
        this.numberOfparameters=listparameters.size();
    }

}