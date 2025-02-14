package academy.devdojo.maratona.paths;

import java.nio.file.*;

public class PathMatcher01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path2, "glob:*.bkp"); // considera diretórios
        matches(path2, "glob:**.bkp"); // não considera diretórios
        matches(path2, "glob:**.{bkp,java,txt}"); // pode terminar com qualquer uma das 3 extensões
        matches(path3, "glob:**.???"); // a extensão termina com 3 caractere
        matches(path3, "glob:**/file.{bkp,java,txt}"); // tem o nome file e tem qualquer uma das 3 extensões
    }

    public static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
