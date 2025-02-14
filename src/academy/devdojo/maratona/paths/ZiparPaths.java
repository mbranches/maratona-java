package academy.devdojo.maratona.paths;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZiparPaths {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        Path zipPath = Paths.get(path.toString(), "arquivo.zip");
        Path pathForZip = Paths.get("pasta/subpasta1/subsubpasta1");
        Path fileOfPathForZip = Paths.get(pathForZip.toString(), "arquivo.txt");

        if (Files.notExists(path)) Files.createDirectory(path);
        if (Files.notExists(zipPath)) Files.createFile(zipPath);
        if (Files.notExists(pathForZip)) Files.createDirectories(pathForZip);
        if (Files.notExists(fileOfPathForZip)) {
            Files.createFile(fileOfPathForZip);
            try(Writer writer = new FileWriter(String.valueOf(fileOfPathForZip));
                BufferedWriter bf = new BufferedWriter(writer);) {
                bf.append("Olá Marcus");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        zip(zipPath, pathForZip);

    }

    public static void zip(Path zipPath, Path pathForZip) {
            try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipPath));
             DirectoryStream<Path> stream = Files.newDirectoryStream(pathForZip);
        ){
            for (Path file : stream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
