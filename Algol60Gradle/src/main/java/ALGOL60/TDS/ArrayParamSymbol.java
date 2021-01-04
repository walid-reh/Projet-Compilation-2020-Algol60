package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class ArrayParamSymbol extends  ArraySymbol {


    public ArrayParamSymbol(Tree node, String name, Scope scope, int offset, BASICTYPE Type, int dimension, ArrayList<Bounds> bounds) {
        super(node, name, scope, offset, Type, dimension,bounds);

    }
}