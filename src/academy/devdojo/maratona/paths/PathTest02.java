package academy.devdojo.maratona.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("pasta"); // == new File("pasta") -> ou seja, na raíz do projeto

        if (Files.notExists(pasta)) {
            Files.createDirectory(pasta);
        }

        Path subPastaPath = Paths.get("pasta/subpasta");
        Files.createDirectories(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        //renomear:

        Path fileCopiedPath = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(filePath, fileCopiedPath, StandardCopyOption.REPLACE_EXISTING);
    }
}
