package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Manga;
import academy.devdojo.maratona.map.domain.Consumidor;

import java.util.*;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaComparatorPreco().reversed());
        mangas.add(new Manga(5L, "Attack on titan",19.9));
        mangas.add(new Manga(1L, "Naruto",21.5));
        mangas.add(new Manga(4L, "Boruto",15.9));
        mangas.add(new Manga(6L, "Boku no hero",19.7));
        mangas.add(new Manga(2L, "Dragon ball",14));
        mangas.add(new Manga(2L, "Dragon ball",14));
        mangas.add(new Manga(3L, "Dragon ball",14));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
