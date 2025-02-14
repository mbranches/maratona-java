package academy.devdojo.maratona.fileatributtes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributes01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes
        //DosFileAttributes
        //PosixFileAttributes

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/arquivo.txt");

        file.createNewFile();
        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta", "novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        Files.isWritable(path);
        Files.isReadable(path);
        Files.isExecutable(path);
    }
}
