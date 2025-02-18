package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on titan",19.9));
        mangas.add(new Manga(1L, "Naruto",21.5));
        mangas.add(new Manga(4L, "Boruto",15.9));
        mangas.add(new Manga(6L, "Boku no hero",19.7));
        mangas.add(new Manga(2L, "Dragon ball",14));

        System.out.println(mangas);

        Collections.sort(mangas);

        System.out.println(mangas);
    }
}
