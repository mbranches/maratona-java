package academy.devdojo.maratona.classesutilitarias.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
//        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo");
        sb.substring(0, 3); //não modifica sb pois a função retorna string
        sb.reverse(); // modifica a string pois a func retorna StringBuilder
        System.out.println(sb);
    }
}
