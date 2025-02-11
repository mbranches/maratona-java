package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time);
        time.setJogadores(jogadores);
        time.imprime();
    }
}
