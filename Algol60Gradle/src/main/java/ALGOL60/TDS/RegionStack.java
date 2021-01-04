package ALGOL60.TDS;

import java.util.ArrayList;
import java.util.Stack;

public class RegionStack extends Stack<SymbolTable> {
    private ArrayList<SymbolTable> visitedSymbolTable=new ArrayList<>();
    private ArrayList<SymbolTable> semanticPath=new ArrayList();
    public RegionStack(){
        super();

    }

    public ArrayList<SymbolTable> getSemanticPath() {
        return semanticPath;
    }

    public boolean BuildnewTable(EnumTypeTDS tabletype, SymbolTable parent, int region, int nesting){
        SymbolTable table=new SymbolTable(tabletype,region,nesting,parent);
        this.push(table);
        this.visitedSymbolTable.add(table);
        this.semanticPath.add(table);
        System.out.println("Pushing a new table...");
        return true;
    }
    public void popTDSandSavePath(){
        SymbolTable mytable=this.pop();
        this.semanticPath.add(mytable.getParent());
    }

    public ArrayList<SymbolTable> getVisitedSymbolTable() {
        return visitedSymbolTable;
    }
}