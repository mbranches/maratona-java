package academy.devdojo.maratona.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    //Ordem das classes:
    //  1° -> ALocado um espaço em memória para a instância.
    //  2° -> Os atributos são inicializados.
    //  3° -> O bloco de inicialização é executado.
    //  4° -> Os construtores são executados.


    private String nome;
    private int[] episodios;

    {
        //bloco de inicialização(executado imediatamente toda vez que uma nova instância dessa classe for criada
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
