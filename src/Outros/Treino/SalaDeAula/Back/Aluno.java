package Outros.Treino.SalaDeAula.Back;

public class Aluno {

    public int id;
    public String nome;
    public double nota;

    public Aluno(int id, String nome, double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

}
