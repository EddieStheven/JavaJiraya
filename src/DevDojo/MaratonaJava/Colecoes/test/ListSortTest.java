package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);

        mangas.add("Attack on titan");
        mangas.add("Dragon Ball");
        mangas.add("Bleach");
        mangas.add("One Piece");
        mangas.add("Pokemon");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(34.65);
        dinheiros.add(25.43);
        dinheiros.add(12.23);

        Collections.sort(dinheiros);


        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println(dinheiros);

    }

}
