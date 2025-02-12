package academy.devdojo.maratona.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file);
             BufferedReader bfReader = new BufferedReader(reader)
        ){
            String linha;
            while ((linha = bfReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
