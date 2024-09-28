package DevDojo.MaratonaJava.Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] ListToArray = numeros.toArray(numeros.toArray(new Integer[0]));
        System.out.println(Arrays.toString(ListToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("------------");
        List<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArray));
        numeroList.add(15);
        System.out.println(numeroList);


    }
}
