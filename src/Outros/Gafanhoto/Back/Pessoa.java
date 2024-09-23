package Outros.Gafanhoto.Back;

public class Pessoa {

    // Atributos de uma Pessoa
    public String nome;
    public int idade;
    public float peso;
    public String nacionalidade;

    // Método para imprimir informações
    public void imprime (){
        System.out.println("  ");
        System.out.println("Informações da pessoa: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " +this.getPeso());
        System.out.println("Nacionalidade: " +this.getNacionalidade());

    }

    // Encapsulamento dos atributos
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        nacionalidade = nacionalidade;
    }
}
