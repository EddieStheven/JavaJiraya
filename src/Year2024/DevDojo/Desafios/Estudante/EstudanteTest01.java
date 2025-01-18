package Year2024.DevDojo.Desafios.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();

        estudante.nome = "Monkey D' Luffy";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante01.nome = "Robin";
        estudante01.idade = 29;
        estudante01.sexo = 'F';

        estudante.imprime();
        estudante01.imprime();


    }
}
