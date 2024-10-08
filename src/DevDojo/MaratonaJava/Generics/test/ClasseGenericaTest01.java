package DevDojo.MaratonaJava.Generics.test;

import DevDojo.MaratonaJava.Generics.dominio.Barco;
import DevDojo.MaratonaJava.Generics.dominio.Carro;
import DevDojo.MaratonaJava.Generics.service.BarcoRentavelService;
import DevDojo.MaratonaJava.Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("usando carro por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
