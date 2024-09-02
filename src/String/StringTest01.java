package String;

public class StringTest01 {
    public static void main(String[] args) {

        // String são imutáveis, e precisa tomar cuidado a quando associar um novo valor a uma variável de referência

        String nome = "Eddie"; //String constant pool
        String nome2 = "Eddie";
        nome = nome.concat(" Stheven"); // nome += " Stheven "
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referência, 2 objeto do tipo String, 3 uma string no pool da string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());



    }
}
