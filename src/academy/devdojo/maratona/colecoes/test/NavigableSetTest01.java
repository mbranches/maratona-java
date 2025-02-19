package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Manga;
import academy.devdojo.maratona.colecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneComparatorMarca implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaComparatorPreco implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        ////TreeSet: organiza pelo compareto
        NavigableSet<Smartphone> navigableSet = new TreeSet<>(new SmartphoneComparatorMarca());
        Smartphone smartphone = new Smartphone("123", "Iphone");
        navigableSet.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaComparatorPreco());
        mangas.add(new Manga(5L, "Attack on titan",19.9));
        mangas.add(new Manga(1L, "Naruto",21.5));
        mangas.add(new Manga(4L, "Boruto",15.9));
        mangas.add(new Manga(6L, "Boku no hero",19.7));
        mangas.add(new Manga(2L, "Dragon ball",14));
        mangas.add(new Manga(2L, "Dragon ball",14));
        mangas.add(new Manga(3L, "Dragon ball",14));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //lower -> o menor mais proximo dele
        //floor -> o igual a ele ou menor mais proximo
        //higher -> o maior mais proximo dele
        //ceiling -> o igual a ele ou maior mais proximo

        System.out.println();

        Manga yuyu = new Manga(21L, "yuyu", 19.8);
        System.out.println(mangas.floor(yuyu ));

    }
}
