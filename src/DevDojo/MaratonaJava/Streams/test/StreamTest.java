package DevDojo.MaratonaJava.Streams.test;


import DevDojo.MaratonaJava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Overlord",4.99),
            new LightNovel("Against the Gods",3.55),
            new LightNovel("Super Gene",8),
            new LightNovel("No game, No life",10.30),
            new LightNovel("Martial World",2.5)

    ));


    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getNovel));
        List<String> titles = new ArrayList<>();
        for(LightNovel lightNovel : lightNovels){
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getNovel());
            }
            if (titles.size() >= 3 ){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }




}
