package DevDojo.MaratonaJava.Lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> strings = List.of("Eddie", "Stheven", "Luffy", "Zoro");
        List<String> eddie = List.of("Eddie", "Fael", "Luffy", "Zoro");
        List<Integer> integers = List.of(1,2,3,4,5);

        forEach(strings, System.out::println);
        forEach(eddie, System.out::println);
        forEach(integers, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }

}
