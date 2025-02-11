package academy.devdojo.maratona.introducao;

public class Arrays {
    public static void main(String[] args) {
        //byte, shot, int, long, float e double, padrão é 0
        //char, padrão é ''
        //bool -> false
        //String -> null

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Marcus";
        nomes[3] = "Inácio";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
