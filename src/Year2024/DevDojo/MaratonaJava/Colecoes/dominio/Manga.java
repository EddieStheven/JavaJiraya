package Year2024.DevDojo.MaratonaJava.Colecoes.dominio;

import java.util.Comparator;
import java.util.Objects;

public class Manga implements Comparable<Manga> {
   private Long id;
   private String nome;
   private double preco;
   private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"ID não pode ser Null!");
        Objects.requireNonNull(nome,"Nome não pode ser Null!");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {


        return this.nome.compareTo(outroManga.getNome());

        /*
        return this.id.compareTo(outroManga.getId()); // vai ser ordenado pelo id
        return this.nome.compareTo(outroManga.getnome()); // vai ser ordenado pelo nome
        return Double.compare(preco, outroManga.getPreco()); // vai ser ordenado pelo preço
        */


    }
}
