package ALGOL60.TDS;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class SwitchSymbol extends Symbol {
    private int NombreDeCas;
    private ArrayList<String> PossibleValues=new ArrayList<String>();


    protected SwitchSymbol(String name, int offset, Scope scope, Tree node, int nombreDeCas) {
        super(SymbolType.SWITCH, name, offset, scope, node);
        NombreDeCas = nombreDeCas;
    }

    public int getNombreDeCas() {
        return NombreDeCas;
    }

    public void setNombreDeCas(int nombreDeCas) {
        NombreDeCas = nombreDeCas;
    }

    public ArrayList<String> getPossibleValues() {
        return PossibleValues;
    }

    public void setPossibleValues(ArrayList<String> possibleValues) {
        PossibleValues = possibleValues;
    }
}