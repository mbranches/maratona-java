package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class ExercicioAluno {
    private String nome;
    private int idade;

    public ExercicioAluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
