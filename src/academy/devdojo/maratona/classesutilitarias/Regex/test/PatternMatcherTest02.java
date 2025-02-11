package academy.devdojo.maratona.classesutilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os numeros
        // \D = tudo que não é numero
        // \s = todos os espaços em brancos \t \n \f \r
        // \S = todos os caracteres excluindo espaço em branco
        // \w = todas as letras, numeros e _
        // \W = tudo que não for letras, numeros e _

        String regex = "\\W";
        String texto = "--hhj2)_@r0l7l+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas:");

        while (matcher.find()) {
            System.out.println("pos: " + matcher.start() + " " + matcher.group());
        }
    }
}
