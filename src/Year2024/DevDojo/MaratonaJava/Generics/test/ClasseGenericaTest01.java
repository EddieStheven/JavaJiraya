package Year2024.DevDojo.MaratonaJava.Generics.test;

import Year2024.DevDojo.MaratonaJava.Generics.dominio.Barco;
import Year2024.DevDojo.MaratonaJava.Generics.dominio.Carro;
import Year2024.DevDojo.MaratonaJava.Generics.service.BarcoRentavelService;
import Year2024.DevDojo.MaratonaJava.Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("usando carro por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
