package academy.devdojo.maratona.classesutilitarias.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        String seila = "           a                ";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('f', 'l'));

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 5));

        System.out.println(seila.trim());
    }
}
