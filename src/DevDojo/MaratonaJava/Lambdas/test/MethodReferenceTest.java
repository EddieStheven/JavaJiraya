package DevDojo.MaratonaJava.Lambdas.test;

import DevDojo.MaratonaJava.Lambdas.dominio.Anime;
import DevDojo.MaratonaJava.Lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 1200),
                new Anime("Dragon Ball", 550),
                new Anime("HunterxHunter", 200)));

/*
        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
*/
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
    }
}
