package Year2024.DevDojo.Desafios.Amigos;

public class Amigos {
    public String nome;
    private int idade;
    public char sexo;
    private String nickname;

    public void imprime() {

        System.out.println("-----------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.nickname);
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Opção Inválida");
            return;
        }
        this.idade = idade;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}

