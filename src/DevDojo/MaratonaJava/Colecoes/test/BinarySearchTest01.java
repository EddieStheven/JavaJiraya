package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(1L,"Dragon Ball",9.9));
        mangas.add(new Manga(4L,"Bleach",20.9));
        mangas.add(new Manga(2L,"Berserk",4.5));
        mangas.add(new Manga(3L,"Vagabond",94.5));

        //Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Naruto", 2.99);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByIdComparator));


    }
}
