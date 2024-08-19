package AOO.BombaInsulina;

import java.util.Scanner;

public class PessoaDoente extends Controlador {

    //Atributos de uma Pessoa
    public String nome;
    public Boolean tipoDiabete;
    public int idade;
    public NivelAcucar nivelAcucar;

    // Método Construtor para a Classe Pessoa
    public PessoaDoente(int idade, NivelAcucar nivelAcucar, String nome, Boolean tipoDiabete) {
        this.idade = idade;
        this.nivelAcucar = nivelAcucar;
        this.nome = nome;
        this.tipoDiabete = tipoDiabete;
    }

    public void imprime(){ // Vai imprimir as informações do Cadastrado
        System.out.println("Nome: " +this.getNome());
        System.out.println("Idade: " +this.getIdade());
        System.out.println("Nivél do açucar: " + this.getNivelAcucar());
        System.out.println("Tem Diabetes: " +this.getTipoDiabete());
        NivelDiabete();
    }

    // Método para checar e imprimir o nível de Diabetes
    public void NivelDiabete(){

       int resposta = 0; // A resposta está setado como null inicial

        if (this.getTipoDiabete() == true){ // Se for true vai perguntar o nível da diabete
            Scanner leitor = new Scanner(System.in);
            System.out.println("Qual nível da diabete: ");
            resposta = leitor.nextInt();

            if (resposta < 1 || resposta > 3) {

                throw new IllegalArgumentException("Argumento ilegal, não pode ser 0 ou maior que 3.");

            }

            System.out.println("Confirmado o nível " +resposta+ " de Diabete!");

        } else {// Se for falso vai imprimir um sout

            System.out.println("Não possuí Diabetes");

        }

    }

    // Encapsulamento dos Atributos da classe Pessoa
    public NivelAcucar getNivelAcucar() {
        return nivelAcucar;
    }
    public void setNivelAcucar(NivelAcucar nivelAcucar) {
        this.nivelAcucar = nivelAcucar;
    }
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
    public Boolean getTipoDiabete() {
        return tipoDiabete;
    }
    public void setTipoDiabete(Boolean tipoDiabete) {
        this.tipoDiabete = tipoDiabete;
    }




}
