package javacore.Gafanhoto.Back;

public class Lutador extends Pessoa implements Comandos {

    public Pessoa pessoa;
    //Atributos de uma Lutador
    public String artesMarciais;
    public int vitoria;
    public int derrotas;
    public int empates;

    // Construtor da classe Lutador
    public Lutador(String artesMarciais, int derrotas, int empates, int idade, String nacionalidade, String nome, float peso, int vitoria) {
        this.artesMarciais = artesMarciais;
        this.derrotas = derrotas;
        this.empates = empates;
        this.idade = idade;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.peso = peso;
        this.vitoria = vitoria;

    }

    // Método para imprimir informações
    @Override
    public void imprime (){
        super.imprime();
        System.out.println("Artes Marciais: " + this.getArtesMarciais());
        categoriaPeso();
    }

    // Definição de categoria por peso
    public void categoriaPeso () {
        if( peso > 50 && peso < 60 ){
            System.out.println("Peso pena");
        } else if (peso > 61 && peso < 70){
            System.out.println("Peso médio");
        } else if (peso > 71 && peso < 80){
            System.out.println("Peso meio-cruzador");
        } else if (peso > 81 && peso < 90){
            System.out.println("Peso cruzador");
        } else if (peso > 91) {
            System.out.println("Peso Pesado");
        } else {
            System.out.println("Não é possível lutar");
        }
    }


  // Override dos comandos
    @Override
    public void status() {

        System.out.println("  ");
        System.out.println("Lutador de Hoje: " +getNome());
        System.out.println("Nosso Lutador " + getNome() + " estará lutando essa noite!");
        System.out.println("Atualmente com um total de " + getPeso() + "KG!");
        System.out.println("Na categoria: "); categoriaPeso();
        System.out.println("Nascido no " +getNacionalidade()+ "!");
        System.out.println("Atualmente com um total de " + getVitoria() + " vitorias! " +getDerrotas() + " derrotas! " + getEmpates() + " empates! ");
        System.out.println("Seja bem-vindooo " +getNome() + " !!!!!");


    }

    @Override
    public void entrouNoRingue() {

        System.out.println("  ");
        System.out.println("O lutador " +getNome() + " entrou no Ringue!");

    }

    @Override
    public void bater() {

        System.out.println("  ");
        System.out.println("O lutador " + getNome() + " acertou um jeb!");

    }

    @Override
    public void apanhou() {

        System.out.println("  ");
        System.out.println("O lutador " + getNome() + " tomou um murro!");
        System.out.println(" -1 hp");

    }

    @Override
    public void desistir() {

        System.out.println("  ");
        System.out.println("O lutador " +getNome() + " desistiu da partida!");

    }

    @Override
    public void tempo() {

    }

    @Override
    public void ganhou() {

        System.out.println("  ");
        System.out.println("O lutador " +getNome() + " ganhou a partida!");


    }

    @Override
    public void perdeu() {

        System.out.println("  ");
        System.out.println("O lutador " +getNome() + " perdeu a partida!");


    }

    @Override
    public void empatou() {

        System.out.println("  ");
        System.out.println("A partida foi um empate!!!");

    }


    // Encapsulamento dos atributos
    public String getArtesMarciais() {
        return artesMarciais;
    }
    public void setArtesMarciais(String artesMarciais) {
        this.artesMarciais = artesMarciais;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
}
