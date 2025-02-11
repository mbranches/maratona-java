package academy.devdojo.maratona.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratona.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Naruto");

        for (int ep : anime01.getEpisodios()) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }
}
