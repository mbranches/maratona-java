package academy.devdojo.maratona.files;

import java.io.File;
import java.io.IOException;

public class FileDiretorios {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        fileDirectory.mkdir();

        File fileOnDirectory = new File(fileDirectory, "arquivo.txt");
        fileOnDirectory.createNewFile();

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        fileOnDirectory.renameTo(fileRenamed);

        File fileDirectoryRenamed = new File("pasta 2");
        fileDirectory.renameTo(fileDirectoryRenamed);
    }
}
