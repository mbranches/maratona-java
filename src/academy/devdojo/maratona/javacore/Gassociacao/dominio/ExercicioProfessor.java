package academy.devdojo.maratona.javacore.Gassociacao.dominio;

import academy.devdojo.maratona.javacore.Gassociacao.test.SeminariosExercicio;

public class ExercicioProfessor {
    private String nome;
    private String especialidade;

    public ExercicioProfessor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
