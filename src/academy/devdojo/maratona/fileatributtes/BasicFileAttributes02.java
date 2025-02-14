package academy.devdojo.maratona.fileatributtes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributes02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta", "new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime creationTime = basicFileAttributes.creationTime();

        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("creationTime: " + creationTime);

        System.out.println();

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime now = FileTime.fromMillis(System.currentTimeMillis());

        fileAttributeView.setTimes(lastModifiedTime, now, creationTime);

        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        creationTime = fileAttributeView.readAttributes().creationTime();

        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("creationTime: " + creationTime);
    }
}
