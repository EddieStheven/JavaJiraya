<<<<<<<< HEAD:src/Outros/Treino/Gerenciamento/Back/Produto.java
package Outros.Treino.Gerenciamento.Back;
========
package Year2024.Outros.Treino.Gerenciamento.Back;
>>>>>>>> 4f8810912339f6e528d08493b54fe21b09eb37dd:src/Year2024/Outros/Treino/Gerenciamento/Back/Produto.java

public class Produto {

    public int id;
    public String name;
    public int quantidade;

    public Produto(int id, String name, int quantidade) {
        this.id = id;
        this.name = name;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
