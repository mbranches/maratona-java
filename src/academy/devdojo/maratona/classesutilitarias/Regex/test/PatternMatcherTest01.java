package academy.devdojo.maratona.classesutilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
//        String regex = "ab";
//        String texto = "abaab";
        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas:");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }

}
