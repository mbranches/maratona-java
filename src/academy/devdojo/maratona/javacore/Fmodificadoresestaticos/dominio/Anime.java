package academy.devdojo.maratona.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    //Ordem das classes:
    //  0  -> bloco de inicialização static é executado quando JVM(JAVA MACHINE VIRTUAL) carrega a classe
    //  1° -> ALocado um espaço em memória para a instância.
    //  2° -> Os atributos são inicializados.
    //  3° -> O bloco de inicialização é executado.
    //  4° -> Os construtores são executados.


    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

    }

    public int[] getEpisodios() {
        return episodios;
    }
}
