package DevDojo.Desafios.Carro;

public class CarroExe01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Relâmpagos Maquinhos";
        carro.modelo = "Veloz";
        carro.ano = 2000;

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Potente";
        carro1.ano = 1969;

        carro2.nome = "CeltaDeEscada";
        carro2.modelo = "VelocidadeDaLuz";
        carro2.ano = 3000;



       carro.imprime();
       carro1.imprime();
       carro2.imprime();
    }

}
