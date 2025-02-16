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

        System.out.println();

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);

        System.out.println();

        List<String> nomes2 = new ArrayList<>();
        nomes2.addAll(nomes);
        System.out.println(nomes2);
    }
}
