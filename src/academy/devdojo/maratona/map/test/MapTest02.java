package academy.devdojo.maratona.map.test;

import academy.devdojo.maratona.colecoes.domain.Manga;
import academy.devdojo.maratona.map.domain.Consumidor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Marcus");
        Consumidor consumidor2 = new Consumidor("Willian");

        Manga attackOnTitan = new Manga(5L, "Attack on titan", 19.9, 0);
        Manga naruto = new Manga(1L, "Naruto", 21.5, 5);
        Manga boruto = new Manga(4L, "Boruto", 15.9, 0);
        Manga bokuNoHero = new Manga(6L, "Boku no hero", 19.7, 2);
        Manga dragonBall = new Manga(2L, "Dragon ball", 14, 0);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, attackOnTitan);
        consumidorManga.put(consumidor2, bokuNoHero);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNomeManga());
        }
    }
}
