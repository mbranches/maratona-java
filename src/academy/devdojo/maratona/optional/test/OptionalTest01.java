package academy.devdojo.maratona.optional.test;

import java.util.List;
import java.util.Optional;

//Ajuda a prevenir NullPointerExceptions
public class OptionalTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Marcus", "Vinicius", "Lindo");
        Optional<String> o1 = Optional.of("alalala");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println();

        Optional<String> nameOptional = findName(names, "Marcus");

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase())); //não faz nada se nao tiver presente
        System.out.println(nameOptional.orElse("Empty"));
    }

    private static Optional<String> findName(List<String> names, String name) {
        int index = names.indexOf(name);

        if (index >= 0) return Optional.of(names.get(index));

        return Optional.empty();
    }
}
