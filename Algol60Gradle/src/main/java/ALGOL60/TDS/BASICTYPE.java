package ALGOL60.TDS;

public enum BASICTYPE {
    REAL("Real"),
    INTEGER("Integer"),
    BOOLEAN("Boolean"),
    STRING("String"),

    UNDEFINED("UNDEFINED"),
    ARITHMETIC_EXPRESSION("ARITHMETIC_EXPRESSION"), // for semantic analysis in case we encounter a  x:= (4 +5) * 4 (the second type we dont know if its real or integer)
    BOOLEAN_EXPRESSION("BOOLEAN_EXPRESSION");




    /*remove it if you want*/
    private String suffix="";

    BASICTYPE(String suffix){
        this.suffix=suffix;
    }
    public String toString(){
        return this.suffix;
    }
}