package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

public class ParameterSymbol extends Symbol {

    private BASICTYPE typeparameter ;

    protected ParameterSymbol(String name, int offset, Scope scope, Tree node, BASICTYPE typeparam) {
        super(SymbolType.PARAMETER, name, offset, scope, node);
        typeparameter=typeparam ;
    }


    public BASICTYPE getTypeparameter() {
        return typeparameter;
    }

    public void setTypeparameter(BASICTYPE typeparameter) {
        this.typeparameter = typeparameter;
    }
}