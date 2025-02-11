package academy.devdojo.maratona.classesutilitarias.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

        String pattern = "'Amsterdam,' dd 'de' MMMM 'de' Y 'as' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));
    }
}
