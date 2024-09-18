package DevDojo.MaratonaJava.Exception.AtvCalculadora;

public class Exceptions {

    public static void InputMismatchException() {

        System.out.println("Entrada inválida. Por favor, insira um número inteiro.");

    }

    public static void ArithmeticException(ArithmeticException e){

        System.out.println("Erro: " + e.getMessage());

    }

    public static void GenericException(Exception e){

        System.out.println("Erro inesperado: " + e.getMessage());

    }

}
