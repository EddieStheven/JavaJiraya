package Year2024.DevDojo.MaratonaJava.Generics.test;

import Year2024.DevDojo.MaratonaJava.Generics.service.CarroRentavelService;
import Year2024.DevDojo.MaratonaJava.Generics.dominio.Carro;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
