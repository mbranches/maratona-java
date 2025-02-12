package academy.devdojo.maratona.files;

import java.io.File;
import java.io.IOException;

public class FileDiretorios {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        System.out.println("Directory is created: " + fileDirectory.mkdir());

        File fileOnDirectory = new File(fileDirectory, "arquivo.txt");
        System.out.println("arquivo.txt is created: " + fileOnDirectory.createNewFile());

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        System.out.println("file is renamed: " + fileOnDirectory.renameTo(fileRenamed));

        File fileDirectoryRenamed = new File("pasta 2");
        System.out.println("directory is renamed: " + fileDirectory.renameTo(fileDirectoryRenamed));
    }
}
