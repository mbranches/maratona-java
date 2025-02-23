package academy.devdojo.maratona.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Alucard");

        List<Integer> stringsLengths = map(strings, (s) -> s.length());

        List<String> stringsUpperCase = map(strings, s -> s.toUpperCase());
        System.out.println(stringsLengths);
        System.out.println(stringsUpperCase);
    }
    //geralmente quando se transforma uma coisa em outra totalmente diferente se chama map
    //T -> Type, R -> Return   Function não necessariamente precisa retorna um tipo diferente
    public static <T,R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result ;
    }
}
