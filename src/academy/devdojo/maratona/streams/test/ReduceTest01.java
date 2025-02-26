package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

//reduce é como se fosse um interator com um acumulador
public class ReduceTest01 {
    private static List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

    public static void main(String[] args) {
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

                                                // init value
        System.out.println(integers.stream().reduce(1, Integer::sum));
        integers.stream().reduce((x, y) -> x *y).ifPresent(System.out::println);

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
