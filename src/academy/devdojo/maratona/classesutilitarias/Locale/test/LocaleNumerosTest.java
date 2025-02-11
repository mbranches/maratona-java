package academy.devdojo.maratona.classesutilitarias.Locale.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleNumerosTest {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN; //nem todos tem isso
        NumberFormat[] nbf = new NumberFormat[3];

        nbf[0] = NumberFormat.getInstance();
        nbf[1] = NumberFormat.getInstance(localeIT);
        nbf[2] = NumberFormat.getInstance(localeJP);

        double valor = 10_000.44;
        for (NumberFormat numberFormat : nbf) {
//            numberFormat.setMinimumFractionDigits(10);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1,000.2130";
        try {
            System.out.println(nbf[0].parse(valorString)); //o parse é interrompido caso no meio da string tenha algo não numero
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
