package ALGOL60.CodeGenerator;

import java.io.IOException;

public class EnvironmentHandler{

    private FileBuilderHandler builder;
    public EnvironmentHandler(FileBuilderHandler builder){
        this.builder=builder;

    }
    //before that adr and par must be implemented
    public void link(String envName,boolean toggleSC) throws IOException {
        //toggleSC disabled if not a function
        //apply
        if(envName==null) {
            builder.write("STW BP,-(SP) //save BP content in the stack LINKING");

        }else{
            builder.write(envName+"_ STW BP,-(SP) //save BP content in the stack LINKING");
        }
        if(!toggleSC){
            builder.write("LDW R8,BP // saves BP for SC");
        }
        builder.write("LDW BP, SP // update of current BP");
        if(toggleSC){
            this.builder.write("STW SC,-(SP) //STATIC CHAIN");
        }else{
            this.builder.write("STW R8,-(SP)// STATIC CHAIN");
        }
    }
    public void createBlockVariables(int size) throws IOException {
        builder.write(String.format("ADQ -%d,SP",size));

    }

    public void createMainEnv() throws IOException{
        this.builder.write("main_ LDW SP,#STACK_ADRS //initialising Stack Pointer")
                .write("LDQ NIL, BP //BP loaded with 0" )
                .write("STW BP, -(SP) // Enqueue BP value")
                .write("LDW BP, SP //BP points at the same adresse as SP")
                .write("LDQ NIL, R7")
                .write("STW R1, -(SP)");
    }
    public void unlink() throws IOException {
        builder
                .write("LDW SP, BP //UNLINKING")
                .write("LDW BP, (SP)")
                .write("ADQ 2, SP");

    }




    public void openEnvironement(int environmentSize) throws IOException {

                builder.write("// Ouverture de l'environnement")
                .write("STW BP, -(SP)")
                .write("LDW BP, SP")
                .write("// Reservation sur la pile des variables")
                .write("LDQ " + environmentSize + ", R0")
                .write("SUB SP, R0, SP");

    }

}
