package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println("Name: " + this.name);
        if (time != null) {
            System.out.println("Time: " + this.time.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
