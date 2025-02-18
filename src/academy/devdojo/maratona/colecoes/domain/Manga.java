package academy.devdojo.maratona.colecoes.domain;

import java.util.Objects;

public class Manga {
    private Long id;
    private String nomeManga;
    private double preco;

    public Manga(Long id, String nomeManga, double preco) {
        Objects.requireNonNull(id);
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
