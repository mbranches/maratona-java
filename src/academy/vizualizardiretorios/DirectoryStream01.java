package academy.vizualizardiretorios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStream01 {
    public static void main(String[] args) {
        Path dir = Paths.get("./");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path : stream) {
                DirectoryStream<Path> stream2 = Files.newDirectoryStream(path);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
