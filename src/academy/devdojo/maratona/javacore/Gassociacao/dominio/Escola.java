package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Escola {
    private String name;
    private Professor[] professores;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professores) {
        this(name);
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.name);

        if (professores == null) {
            return;
        }

        System.out.println("Professores:");

        for (Professor professor : professores) {;
            System.out.println(" " + professor.getName());
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return professores;
    }
}
