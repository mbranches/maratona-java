package academy.devdojo.maratona.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio) {
        this(nome, tipo, episodios, genero);
        this.studio = studio;
    }

    //fazendo sobrecarga de contrutores -> nesse caso posso posso passar os dados tanto no momento da construção da instancia quanto depois.
    public Anime() {

    }

//    public void init(String tipo, int episodios) {
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }
//
//    public void init(String tipo, int episodios, String genero) {
//        this.init(tipo, episodios);
//        this.genero = genero;
//    }

    public void impressora() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Studio: " + this.studio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
