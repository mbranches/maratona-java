package academy.devdojo.maratona.colecoes.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nomeManga;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nomeManga, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nomeManga, "Nome não pode ser null");
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    public Manga(Long id, String nomeManga, double preco, int quantidade) {
        this(id, nomeManga, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(@NotNull Manga o) {
        //negativo -> se o this < outro objeto, 0 -> se forem iguais, positivo -> se this for maior

//        if (this.id < o.getId()) return -1;
//
//        if (this.id.equals(o.getId())) return 0;
//
//        return 1;

        return this.id.compareTo(o.getId());
    }
}
