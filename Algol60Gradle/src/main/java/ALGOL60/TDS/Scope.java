package ALGOL60.TDS;

public enum Scope {
    OWN("OWN"),
    LOCAL("LOCAL");

    private String suffix;
    Scope(String suffix){
        this.suffix=suffix;
    }
    public String toString(){
        return this.suffix;

    }

}