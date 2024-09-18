package DevDojo.Desafios.Aatividades.A1;

public class D1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ();
        Funcionario funcionario1 = new Funcionario ();
        Funcionario funcionario2 = new Funcionario ();
        Funcionario funcionario3 = new Funcionario ();

        funcionario.setNome("Edjan");
        funcionario.setIdade(40);
        funcionario.setSexo('M');
        funcionario.setSalarios(new int [] { 9000, 8543, 12080 });
        funcionario.setCargo("Caldereiro");

        funcionario1.setNome("Caroline");
        funcionario1.setIdade(31);
        funcionario1.setSexo('F');
        funcionario1.setSalarios(new int [] { 15000, 28543, 16500 });
        funcionario1.setCargo("Perita Judicial");

        funcionario2.setNome("Elicles");
        funcionario2.setIdade(24);
        funcionario2.setSexo('M');
        funcionario2.setSalarios(new int[] { 6000, 7543, 6080 });
        funcionario2.setCargo("Psicologo - RH");

        funcionario3.setNome("Eddie");
        funcionario3.setIdade(28);
        funcionario3.setSexo('M');
        funcionario3.setSalarios( new int [] { 50000, 90870, 124080});
        funcionario3.setCargo("Engenheiro");

        funcionario.imprimeInforFuncionario();
        funcionario1.imprimeInforFuncionario();
        funcionario2.imprimeInforFuncionario();
        funcionario3.imprimeInforFuncionario();


    }


}
