package Year2024.DevDojo.MaratonaJava.Colecoes.test;

import Year2024.DevDojo.MaratonaJava.Colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTestList {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11111","Iphone");
        Smartphone s2 = new Smartphone("22222","Xiaomi");
        Smartphone s3 = new Smartphone("33333","Samsung");


        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);

        }

        Smartphone s4 = new Smartphone("33333","Samsung");
        smartphones.add(0,s4);

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));

    }

}
