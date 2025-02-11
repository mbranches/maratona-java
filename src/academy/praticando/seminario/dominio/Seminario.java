package academy.praticando.seminario.dominio;

public class Seminario {
    private String titulo;
    private Professor[] professores;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Professor[] professores, Local local) {
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
        for (Professor professor : this.professores) {
            System.out.println(professor.getEspecialidade() + ": " + professor.getNome());
        }

        System.out.println();

        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getIdade() + " anos");
        }

        System.out.println();

        System.out.println("Endereço: " + local.getEndereco());

        System.out.println("-----------------------");
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
