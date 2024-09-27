package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(1L,"Dragon Ball",9.9));
        mangas.add(new Manga(4L,"Bleach",20.9));
        mangas.add(new Manga(2L,"Berserk",4.5));
        mangas.add(new Manga(3L,"Vagabond",94.5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("--------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("--------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
