package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

public abstract class Symbol{
    private SymbolType symboltype;
    private String name;
    private int Offset;

    private Scope scope;
    private Tree node;

    protected Symbol(SymbolType symboltype,String name, int offset, Scope scope, Tree node) {
        this.symboltype = symboltype;
        this.name = name;
        Offset = offset;
        this.scope = scope;
        this.node = node;
    }

    public SymbolType getSymboltype() {
        return symboltype;
    }

    public void setSymboltype(SymbolType symboltype) {
        this.symboltype = symboltype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffset() {
        return Offset;
    }

    public void setOffset(int offset) {
        Offset = offset;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Tree getNode() {
        return node;
    }

    public void setNode(Tree node) {
        this.node = node;
    }
}