package academy.devdojo.maratona.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class GerandoStream02 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(10); //limite de itens

        //fibonacci: 0,1,1,2,3,5,8,13,21,34,55

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(array -> System.out.println(Arrays.toString(array)));

        System.out.println();

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(n -> System.out.print(n + " "));

        ThreadLocalRandom random = ThreadLocalRandom.current();

        Stream.generate(() -> random.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
