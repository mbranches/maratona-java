package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        //o ideal para remoções (caso for utilizar muito) é linkedlist
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on titan",19.9, 0));
        mangas.add(new Manga(1L, "Naruto",21.5, 5));
        mangas.add(new Manga(4L, "Boruto",15.9, 0));
        mangas.add(new Manga(6L, "Boku no hero",19.7, 2));
        mangas.add(new Manga(2L, "Dragon ball",14, 0));

//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0) {
//                mangas.remove(manga);
//            }
//        } --------> não da certo

        Iterator<Manga> mangaIterator = mangas.iterator();

//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0) mangaIterator.remove();
//        } ---------------> correto

        mangas.removeIf(manga -> manga.getQuantidade() == 0); //-----------> correto

        System.out.println(mangas);

    }
}
