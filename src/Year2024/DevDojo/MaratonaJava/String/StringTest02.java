package Year2024.DevDojo.MaratonaJava.String;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "Luffy";
        String numeros = "12345";
        System.out.println(nome.charAt(0)); // Vai falar a primeira letra do nome
        System.out.println(nome.length()); // Vai falar o total de números que esse nome tem
        System.out.println(nome.replace("f","L")); // vai trocar o f por L
        System.out.println(nome.toLowerCase()); // vai deixar tudo minusculo
        System.out.println(nome.toUpperCase()); // vai deixar tudo maiusculo
        System.out.println(numeros.length()); // vai falar o total de números
        System.out.println(numeros.substring(0,2)); // vai contar de 0 a 2
        System.out.println(numeros.substring(3,numeros.length())); // vai contar a partir do 3 a todos
        System.out.println(nome.trim()); // Vai remover os espaços



    }
}
