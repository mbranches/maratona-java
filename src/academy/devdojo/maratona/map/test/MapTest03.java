package academy.devdojo.maratona.map.test;

import academy.devdojo.maratona.colecoes.domain.Manga;
import academy.devdojo.maratona.map.domain.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Marcus");
        Consumidor consumidor2 = new Consumidor("Willian");

        Manga attackOnTitan = new Manga(5L, "Attack on titan", 19.9, 0);
        Manga naruto = new Manga(1L, "Naruto", 21.5, 5);
        Manga boruto = new Manga(4L, "Boruto", 15.9, 0);
        Manga bokuNoHero = new Manga(6L, "Boku no hero", 19.7, 2);
        Manga dragonBall = new Manga(2L, "Dragon ball", 14, 0);

        List<Manga> mangasConsumidor1 = List.of(attackOnTitan, naruto, boruto);
        List<Manga> mangasConsumidor2 = List.of(bokuNoHero, dragonBall);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangasConsumidor1);
        consumidorMangaMap.put(consumidor2, mangasConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + ": ");
            for (Manga manga : entry.getValue()) {
                if (manga != entry.getValue().get(entry.getValue().size() - 1)) {
                    System.out.print(manga.getNomeManga() + ", ");
                } else {
                    System.out.println(manga.getNomeManga() + ".");
                }
            }
        }
    }
}
