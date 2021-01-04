package ALGOL60.TDS;

public enum PARAMETERTYPE {
    REAL("Real"),
    INTEGER("Integer"),
    BOOLEAN("Boolean"),
    STRING("String"),
    SWITCH("Switch"),
    LABEL("Label"),
    PROCEDURE("Procedure"),
    ARRAY("Array"),

    REAL_PROCEDURE("Real Procedure"),
    REAL_ARRAY("Real Array"),
    INTEGER_PROCEDURE("Integer Procedure"),
    INTEGER_ARRAY("Integer Array"),
    BOOLEAN_ARRAY("Boolean Array"),
    BOOLEAN_PROCEDURE("Boolean Procedure"),
    UNDEFINED("Undefined"),
    ARITHMETIC_EXPRESSION("Arithmetic expression"),
    BOOLEAN_EXPRESSION("Boolean expression");

    private String suffix="";

    PARAMETERTYPE(String suffix){
        this.suffix=suffix;
    }
    public String toString(){
        return this.suffix;
    }
}