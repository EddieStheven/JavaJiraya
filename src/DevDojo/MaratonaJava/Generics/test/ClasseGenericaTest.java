package DevDojo.MaratonaJava.Generics.test;

import DevDojo.MaratonaJava.Generics.service.CarroRentavelService;
import DevDojo.MaratonaJava.Generics.dominio.Carro;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
