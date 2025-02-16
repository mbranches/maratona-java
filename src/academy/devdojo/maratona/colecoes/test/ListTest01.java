package academy.devdojo.maratona.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Marcus");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
