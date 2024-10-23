package DevDojo.MaratonaJava.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Alucard");
        List<Integer> integers = map(strings, String::length);
        List<String> map = map(strings, String::toUpperCase);
        System.out.println(integers);
        System.out.println(map);
    }

    private static <T, R > List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
