package DevDojo.MaratonaJava.Generics.service;

import DevDojo.MaratonaJava.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objetos: " +t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }


    public void retornarObjetosAlugado(T t){
        System.out.println("Devolvendo objetos " +t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
