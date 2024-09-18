package DevDojo.Desafios.Professor;

public class Professor {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);


    }

    public void imprime(Professor professor){

        System.out.println("-------------------------------------");
        System.out.println("\nNome:"+ professor.nome + " \n Idade: " + professor.idade + " \n Sexo: " + professor.sexo);
    }


}
