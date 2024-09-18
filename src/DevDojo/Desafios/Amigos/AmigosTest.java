package DevDojo.Desafios.Amigos;

public class AmigosTest {
    public static void main(String[] args) {
        Amigos amigos = new Amigos();
        Amigos amigos1 = new Amigos();
        Amigos amigos2 = new Amigos();

        amigos.nome = "Rafael";
        amigos.setIdade(28);
        amigos.sexo = 'M';
        amigos.setNickname("Fael");

        amigos1.nome = "Aruã";
        amigos1.setIdade(25);
        amigos1.sexo = 'M';
        amigos1.setNickname("AruaRicci");

        amigos2.nome = "Denilson";
        amigos2.setIdade(22);
        amigos2.sexo = 'M';
        amigos2.setNickname("Apolo");

        amigos.imprime();
        amigos1.imprime();
        amigos2.imprime();


    }
}
