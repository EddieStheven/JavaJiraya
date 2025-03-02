package Year2024.DevDojo.MaratonaJava.Exception.AtvCalculadora;

public class Calculator {


    public static int somar(int a, int b) throws ArithmeticException{

        return a+b;

    }

    public static int subtrair(int a, int b) throws ArithmeticException{

        return a-b;

    }

    public static int multi(int a, int b) throws ArithmeticException{

        return a*b;

    }

    public static int divide(int numerador, int denominador) throws ArithmeticException{

        if(denominador == 0){
            throw new ArithmeticException("Não é possível dividir por 0!");
        }

        return numerador / denominador ;

    }

}
