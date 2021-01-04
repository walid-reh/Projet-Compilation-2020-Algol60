package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

public class LabelSymbol extends Symbol {

    public LabelSymbol(SymbolType symboltype, String name, int offset, Scope scope, Tree node) {
        super(symboltype, name, 0, scope, node);
    }
}