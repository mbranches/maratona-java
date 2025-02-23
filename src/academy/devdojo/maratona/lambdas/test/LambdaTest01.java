package academy.devdojo.maratona.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        //Para usar lambda precisa: um interface funcional(1 metodo abstrato)
        //(parametro) -> <Expressão>

        List<String> names = List.of("Marcus", "William", "Vinicius");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

        forEach(names, n -> System.out.println(n));
        forEach(integers, num -> System.out.println(num));

    }
                                                //consumer retorna void
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
