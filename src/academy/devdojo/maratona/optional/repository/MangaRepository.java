package academy.devdojo.maratona.optional.repository;

import academy.devdojo.maratona.optional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    public static List<Manga> mangas = List.of(
            new Manga(1, "Boku no Hero", 50),
            new Manga(2, "Naruto", 20),
            new Manga(3, "Boruto", 13)
    );

    public static Optional<Manga> findByCondition(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) found = manga;
        }

        return Optional.ofNullable(found);

    }

    public static Optional<Manga> findMangaByTitle(String title) {
        return findByCondition(m -> m.getTitle().equals(title));
    }
}
