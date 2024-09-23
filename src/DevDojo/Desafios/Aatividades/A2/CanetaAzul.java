package DevDojo.Desafios.Aatividades.A2;

public class CanetaAzul {
    public static void main(String[] args) {
        AzulCaneta MG = new AzulCaneta("BIC", "Azul",1.0F, 69, true);
        AzulCaneta MG1 = new AzulCaneta();
        MG.setModelo("BIC");
        MG.setCor("Azul");
        MG.setPonta(1.0F);
        MG.tampada = true;
        MG.setCarga(69);

        MG1.setModelo("BIC");
        MG1.setCor("Preta");
        MG1.setPonta(0.5F);
        MG1.tampada = false;
        MG1.setCarga(27);

        MG.imprimir();
        MG1.imprimir();





    }
}
