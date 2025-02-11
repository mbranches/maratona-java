package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class ExercicioSeminario {
    private String titulo;
    private ExercicioProfessor[] professores;
    private ExercicioAluno[] alunos;
    private ExercicioLocal local;

    public ExercicioSeminario(String titulo, ExercicioAluno[] alunos, ExercicioProfessor[] professores, ExercicioLocal local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professores = professores;
        this.local = local;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println("Seminário " + this.titulo);
        System.out.println("-----------------------");
        System.out.println("Professores:");
        for (ExercicioProfessor professor : this.professores) {
            System.out.println(professor.getEspecialidade() + ": " + professor.getNome());
        }

        System.out.println();

        System.out.println("Alunos: ");
        for (ExercicioAluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getIdade() + " anos");
        }

        System.out.println();

        System.out.println("Endereço: " + local.getEndereco());

        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ExercicioProfessor[] getProfessores() {
        return professores;
    }

    public void setProfessores(ExercicioProfessor[] professores) {
        this.professores = professores;
    }

    public ExercicioAluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(ExercicioAluno[] alunos) {
        this.alunos = alunos;
    }

    public ExercicioLocal getLocal() {
        return local;
    }

    public void setLocal(ExercicioLocal local) {
        this.local = local;
    }
}
