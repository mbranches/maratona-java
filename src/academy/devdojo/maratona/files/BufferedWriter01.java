package academy.devdojo.maratona.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fwriter = new FileWriter(file, true);
             BufferedWriter bfWriter = new BufferedWriter(fwriter)
        ) {
            bfWriter.write("Utilizando Buffered Writer...");
            bfWriter.newLine();
            bfWriter.flush();  //esvazia o writer
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
