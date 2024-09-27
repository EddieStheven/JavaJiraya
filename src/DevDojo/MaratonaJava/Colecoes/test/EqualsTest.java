package DevDojo.MaratonaJava.Colecoes.test;

import DevDojo.MaratonaJava.Colecoes.dominio.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = s1;

        System.out.println(s1.equals(s2));

    }
}