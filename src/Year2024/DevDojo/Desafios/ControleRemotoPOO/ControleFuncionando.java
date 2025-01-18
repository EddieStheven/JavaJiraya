package Year2024.DevDojo.Desafios.ControleRemotoPOO;


public class ControleFuncionando {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto(50,true,true);
        c1.ligar();
        c1.abrirMenu();
        c1.maisVolume();
        c1.play();
        c1.maisVolume();
    }
}
