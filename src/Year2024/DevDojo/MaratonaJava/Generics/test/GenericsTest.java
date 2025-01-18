package Year2024.DevDojo.MaratonaJava.Generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Luffy");
        lista.add("Zoro");
        lista.add("Sanji");

        for (String o : lista){
            System.out.println(o);
        }

    }
}
