package academy.devdojo.maratona.classesutilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // representar range: []

//        String regex = "[a-cA-C]";
//        String texto = "cafeBABE";
        String regex = "0[xX][0-9a-fA-F]";
        String textoCmNumerosHexas = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textoCmNumerosHexas);

        System.out.println("texto:  " + textoCmNumerosHexas);
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
