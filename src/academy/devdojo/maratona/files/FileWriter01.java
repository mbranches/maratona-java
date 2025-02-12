package academy.devdojo.maratona.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);) {
            fileWriter.write("Olá, Marcus\nSEILAAAAA\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
