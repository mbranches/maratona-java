package academy.devdojo.maratona.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizandoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path file = Paths.get("/home/william/devdojo/ola.java");//caminho somente de exemplo

//        System.out.println(dir.relativize(file));

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/william/devdojo/ola.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.1212123");

        System.out.println(absoluto1.relativize(absoluto3));
        System.out.println(absoluto3.relativize(absoluto1));
        System.out.println(absoluto1.relativize(absoluto2)); // resultado: ..\..\\user\local -> ele sabe que ab1 2 ab2 partem da raiz pela string passada
        System.out.println(relativo1.relativize(relativo2));
    }
}
