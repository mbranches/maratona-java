package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ReduceTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Boruto", 5.99),
            new LightNovel("Dragon Ball", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Shippuden", 1.99),
            new LightNovel("Boku no Hero", 4)
    ));

    //some todos os preços acima de 3
    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        DoubleStream doubleStream = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice);  //para evitar que o java fique fazendo wraper e unwrapper dos tipos (doube <-> Double)

        double sum = doubleStream.filter((lnp -> lnp > 3))
//                .reduce(Double::sum).ifPresent(System.out::println);
                .sum();
        System.out.println(sum);
    }
}
