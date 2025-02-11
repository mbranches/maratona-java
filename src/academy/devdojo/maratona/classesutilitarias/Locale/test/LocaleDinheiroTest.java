package academy.devdojo.maratona.classesutilitarias.Locale.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleDinheiroTest {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeEN = Locale.ENGLISH; //nem todos tem isso
        NumberFormat[] nbf = new NumberFormat[3];

        nbf[0] = NumberFormat.getCurrencyInstance()  ;
        nbf[1] = NumberFormat.getCurrencyInstance(localeEN);
        nbf[2] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 10_000.44;
        for (NumberFormat numberFormat : nbf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥10,000";

        try {
            System.out.println(nbf[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
