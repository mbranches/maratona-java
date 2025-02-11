package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jogadores) {
        this(name);
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Time: " + this.name);

        if (jogadores == null) return;

        System.out.println("Jogadores: ");

        int contador = 1;
        for(Jogador jogador : jogadores) {
            System.out.println(contador + "- " + jogador.getName());
            contador++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
