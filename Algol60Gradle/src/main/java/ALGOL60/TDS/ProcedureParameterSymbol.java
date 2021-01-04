package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

public class ProcedureParameterSymbol extends Symbol {
    private PARAMETERTYPE Type;
    private boolean isValue;

    public ProcedureParameterSymbol(String name, PARAMETERTYPE type, boolean isValue, Tree associated) {
        super(SymbolType.PARAMETER,name,-999,Scope.LOCAL,associated);
        this.Type=type;
        this.isValue=isValue;

    }



    public void setCallByValue(boolean value) {
        isValue = value;
    }

    public boolean isValue() {
        return isValue;
    }

    public PARAMETERTYPE getType() {
        return Type;
    }

    public void setType(PARAMETERTYPE type) {
        Type = type;
    }
}