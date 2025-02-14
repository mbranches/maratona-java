package academy.devdojo.maratona.vizualizardiretorios;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFile extends SimpleFileVisitor<Path> {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*[tT]est*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class ExercicioPathMatcherSimpleFileVisitor {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListAllFile());
    }

}
