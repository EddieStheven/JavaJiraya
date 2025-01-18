package Year2024.DevDojo.MaratonaJava.Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
    public static void main(String[] args) {

        List<String> nomes = new ArrayList();

        nomes.add("William");
        nomes.add("Eddie Java");
        nomes.remove("William");
        nomes.add("Jack Chan");


        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-----------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            nomes.add("Stheven");
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }

}
