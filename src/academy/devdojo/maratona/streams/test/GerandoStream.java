package academy.devdojo.maratona.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GerandoStream {
    public static void main(String[] args) {
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " ")); //conta ate 49
        System.out.println();
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " ")); //conta ate 50

        System.out.println();

        Stream.of("Criando", "Stream" , "de", "String")
                .filter(s -> s.length() > 2)
                .forEach(System.out::println);

        int[] ints = {1, 2, 4, 5};

        IntStream stream = Arrays.stream(ints);

        System.out.println();

        try (Stream<String> linesStream = Files.lines(Paths.get("file.txt"))){
            linesStream
                    .filter(ln -> ln.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
