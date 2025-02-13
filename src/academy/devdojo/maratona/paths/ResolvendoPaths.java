package academy.devdojo.maratona.paths;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        /// /home/willian quer dizer a partir da raiz -> caminho absoluto (C:\home\willian)
        Path dir = Paths.get("home/willian");
        Path file = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(file);

        System.out.println(resolve);
    }
}
