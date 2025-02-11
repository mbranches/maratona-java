package academy.devdojo.maratona.javacore.Dconstrutores.test;

import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Naruto", "TV", 20, "Ação");
        anime01.impressora();

        System.out.println();

        Anime anime02 = new Anime();
        anime02.impressora();

        System.out.println();

        Anime anime03 = new Anime("Dragon Ball", "Mangá", 23, "Ação", "pixar");
        anime03.impressora();
    }
}
