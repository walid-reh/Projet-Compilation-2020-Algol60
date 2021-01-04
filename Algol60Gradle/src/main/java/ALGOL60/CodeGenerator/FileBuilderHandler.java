package ALGOL60.CodeGenerator;

import java.io.*;

public class FileBuilderHandler {
    private  FileWriter dest; // The FileWriter object
    private BufferedWriter writer; // The BufferdWriter object : gestion du flux tamponnés en écriture dans le fichier

    public FileBuilderHandler(String destPath) throws IOException {

        this.dest=new FileWriter(destPath,false);
        this.writer=new BufferedWriter(dest);
    }

    public FileBuilderHandler write(String line) throws IOException {
        this.writer.write(line);
        this.writer.newLine();
        return this;
    }

    public void close() throws IOException {
        this.writer.close();
    }
}
