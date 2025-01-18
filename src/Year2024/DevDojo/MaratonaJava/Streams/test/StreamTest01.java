package Year2024.DevDojo.MaratonaJava.Streams.test;

import Year2024.DevDojo.MaratonaJava.Streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Overlord",4.99),
            new LightNovel("Against the Gods",3.55),
            new LightNovel("Super Gene",8),
            new LightNovel("No game, No life",10.30),
            new LightNovel("Martial World",2.5)

    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getNovel))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getNovel)
                .toList();

        System.out.println(titles);
    }
}
