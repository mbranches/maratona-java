package academy.devdojo.maratona.paths;

import javax.sound.sampled.Control;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\marcu\\OneDrive\\Documentos\\dev\\java\\Maratona\\file.txt");
        Path p2 = Paths.get("C:\\Users\\marcu\\OneDrive\\Documentos\\dev\\java\\Maratona", "file.txt");

        System.out.println(p1.getFileName());
    }
}
