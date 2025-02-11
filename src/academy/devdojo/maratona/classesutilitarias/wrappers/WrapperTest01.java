package academy.devdojo.maratona.classesutilitarias.wrappers;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        Double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        //autoboxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer w2 = Integer.parseInt("8"); //tem esse metodos em todo wraper

        System.out.println(Character.isDigit('9')); //são metodos de classes(static)
        System.out.println(Character.isDigit('a'));
    }
}
