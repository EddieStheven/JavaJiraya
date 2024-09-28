package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Manga;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball", 9.9, 5));
        mangas.add(new Manga(4L, "Bleach", 20.9, 0));
        mangas.add(new Manga(2L, "Berserk", 4.5, 2));
        mangas.add(new Manga(3L, "Vagabond", 94.5, 0));


        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
