package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

public class VarSymbol extends Symbol {
    private BASICTYPE typevariable;
    protected VarSymbol(String name, int offset, Scope scope, Tree node,BASICTYPE a) {
        super(SymbolType.VARIABLE, name, offset, scope, node);
        this.typevariable=a;
    }

    public BASICTYPE getTypevariable() {
        return typevariable;
    }

    public void setTypevariable(BASICTYPE typevariable) {
        this.typevariable = typevariable;
    }
}