package DevDojo.Desafios.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professor1 = new Professor();


        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        professor1.nome = "Rayleng";
        professor1.idade = 70;
        professor1.sexo = 'M';

        professor.imprime(professor);
        professor1.imprime(professor1);


    }
}
