package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan",19.9,0));
        mangas.add(new Manga(1L,"Dragon Ball",9.9,5));
        mangas.add(new Manga(4L,"Bleach",20.9,0));
        mangas.add(new Manga(2L,"Berserk",4.5,2));
        mangas.add(new Manga(3L,"Vagabond",94.5,0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

    }
}
