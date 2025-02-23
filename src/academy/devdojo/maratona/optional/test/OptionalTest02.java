package academy.devdojo.maratona.optional.test;

import academy.devdojo.maratona.optional.domain.Manga;
import academy.devdojo.maratona.optional.repository.MangaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static academy.devdojo.maratona.optional.repository.MangaRepository.findMangaByTitle;

//Ajuda a prevenir NullPointerExceptions
public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> bokuNoHero = findMangaByTitle("Boku no Hero");

        bokuNoHero.ifPresent(
                m -> m.setTitle(m.getTitle().toUpperCase())
        );

        System.out.println(bokuNoHero);

        Manga dbz = findMangaByTitle("Dragon Ball Z")
                .orElse(new Manga(7, "Dragon Ball Z", 333));

        System.out.println(dbz);
    }
}
