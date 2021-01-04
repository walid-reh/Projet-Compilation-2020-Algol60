package ALGOL60.CodeGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class ReaderSource {

    private File file;
    private BufferedReader reader;

    public ReaderSource(File file) {
        this.file = file;
    }

    public String getLine(int n) throws IOException {
        if(this.reader == null) {
            this.reader = new BufferedReader(
                    new FileReader(this.file)
            );
        }

        Optional<String> line = this.reader.lines().skip(n - 1).findFirst();
        this.reader.close();
        this.reader = null;

        return line.map(String::trim).orElse(null);
    }



}
