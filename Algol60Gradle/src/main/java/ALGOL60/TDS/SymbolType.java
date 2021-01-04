package ALGOL60.TDS;

public enum SymbolType {
    VARIABLE("VAR"),
    PROCEDURE("PROC"),
    SWITCH("SWITCH"),
    LABEl("LABEL"),
    PARAMETER("PARAM"),
    ARRAY("ARRAY"),
    ARRAYPARAMETER("ARRAYPARAM");
    private String suffix="";
    SymbolType(String suffix){
        this.suffix=suffix;
    }
    public String toString(){
        return this.suffix;
    }
}