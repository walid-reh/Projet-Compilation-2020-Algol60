package ALGOL60.CodeGenerator;


import java.io.File;
import java.io.IOException;

public class Compiler {
    private  File file;

    public Compiler(File file) {
        this.file = file;
    }

    public void compile() throws IOException {
        Process process = Runtime.getRuntime().exec("java -jar microPIUP.jar -ass " + file.getAbsolutePath());

        System.out.println(file);



    }
}