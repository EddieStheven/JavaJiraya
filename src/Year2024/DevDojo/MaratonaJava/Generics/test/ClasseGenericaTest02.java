package Year2024.DevDojo.MaratonaJava.Generics.test;

import Year2024.DevDojo.MaratonaJava.Generics.dominio.Barco;
import Year2024.DevDojo.MaratonaJava.Generics.dominio.Carro;
import Year2024.DevDojo.MaratonaJava.Generics.service.BarcoRentavelService;
import Year2024.DevDojo.MaratonaJava.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BWM"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("usando carro por um mes...");
        rentalService.retornarObjetosAlugado(carro);

        System.out.println("-------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("usando carro por um mes...");
        rentalServiceBarco.retornarObjetosAlugado(barco);


    }
}
