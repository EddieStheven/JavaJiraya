package Year2024.DevDojo.Desafios.Aatividades.A1;

public class Funcionario {

    private String nome;
    private int idade;
    private int[] salarios;
    private int media;
    private char sexo;
    private String cargo;

    public Funcionario() {
        this.setNome("Funcionário");
        this.setIdade(00);
    }

    public void imprimeInforFuncionario() {

        System.out.println("-----------------");
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getSexo());
        System.out.println(this.getCargo());
        if (getSalarios() == null) {
            return;
        }
        for (int salario : salarios) {
            System.out.println(salario + "R$");
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (int salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média Salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}



