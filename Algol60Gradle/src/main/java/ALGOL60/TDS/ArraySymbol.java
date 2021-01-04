package ALGOL60.TDS;


import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class ArraySymbol extends Symbol {

    private int dimension;
    private ArrayList<Bounds> boundaries;
    private BASICTYPE arrayType;

    public int  getSize(){
        int size=0;
        for(Bounds b:boundaries){
            size+=b.getMaxBoundary() -b.getMinBoundary()+1;
        }
        return size;
    }


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public ArrayList<Bounds> getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(ArrayList<Bounds> boundaries) {
        this.boundaries = boundaries;
    }

    public BASICTYPE getArrayType() {
        return arrayType;
    }

    public void setArrayType(BASICTYPE arrayType) {
        this.arrayType = arrayType;
    }




    public ArraySymbol(Tree node, String name, Scope scope, int offset,BASICTYPE arrayType,int dimension,ArrayList<Bounds> bounds) {
        super(SymbolType.ARRAY, name, offset, scope, node);
        this.arrayType=arrayType;
        this.dimension=dimension;
        this.boundaries=bounds;

    }

    public String boundsString() {
        StringBuilder bounds=new StringBuilder("array");
        for (Bounds bound:this.boundaries){
            bounds.append("["+bound.getMinBoundary()+":"+bound.getMaxBoundary()+"]");
        }
        return bounds.toString();
    }
}