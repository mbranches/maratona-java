package academy.devdojo.maratona.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Naruto");
        mangas.add("Boruto");

        Collections.sort(mangas);  //por padrao ordena por ordem crescente

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(122D);
        dinheiros.add(12.3);
        dinheiros.add(544.23);

        Collections.sort(dinheiros);


        System.out.println(mangas);
        System.out.println(dinheiros);

    }
}
