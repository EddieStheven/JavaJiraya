package Year2024.DevDojo.MaratonaJava.Lambdas.service;

import Year2024.DevDojo.MaratonaJava.Lambdas.dominio.Anime;

import java.util.ArrayList;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
