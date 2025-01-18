package Year2024.DevDojo.MaratonaJava.Exception.Treino.runtime.exception;

public class RuntimeExceptionTest01 {

    public static void main(String[] args) {

        System.out.println(divisao(10,0));
        System.out.println(divisao1(1,4));

    }

    public static int divisao(int a, int b) {

        try {
            return a/b;

        }catch (ArithmeticException e){
            e.printStackTrace();
        }


        return 0;
    }


    public static int divisao1(int a, int b) {

        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

        return a/b;
    }




}
