package academy.devdojo.maratona.classesutilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + uma ou mais
        // {x,y} de x até y ocorrencias
        // o(c/v)o  -> ovo ou oco
        // $ fim da linha
        // . 1.3 1@3 1a3 133 123 -> QUALQUER COISA PODE TA NO MEIO

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.com";
        String texto = "marcus@gmail.com, 123jorato@hotmail.com, test@globo.com, sakura@mail";

        //metodo de string
        System.out.println("E-mail válido: " + "+marcusbranxxd@gmail.com".matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas:");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        //29.102.007
//        int numeroAcimaEmHexaDecimal = 0x1BC0FB7;
//        System.out.println(numeroAcimaEmHexaDecimal);
    }
}
