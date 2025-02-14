package academy.vizualizardiretorios;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + dir.getFileName());

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());

        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitor02 {
    public static void main(String[] args) throws IOException {
//        Path path1 = Paths.get("pasta/subpasta1/subsubpasta1");
//        Path path2 = Paths.get(String.valueOf(path1.getParent().getParent()), "subpasta2");
//        Files.createDirectories(path1);
//        Files.createDirectories(path2);
//        Path file1 = Paths.get(String.valueOf(path1), "subarquivo1.txt");
//        Path file2 = Paths.get(String.valueOf(path2), "subarquivo2.txt");
//        Files.createFile(file1);
//        Files.createFile(file2);


        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
