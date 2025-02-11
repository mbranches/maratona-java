package academy.devdojo.maratona.javacore.Csobrecargametodos.test;

import academy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        //anime01.setNome("Naruto");
        //anime01.setTipo("TV");
        //anime01.setEpisodios(20);
        anime01.init("Naruto", "TV", 20);
        anime01.init("Naruto", "TV", 20, "Ação");
        anime01.impressora();
    }
}
