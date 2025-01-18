package Year2024.DevDojo.Desafios.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,20);
        int result = (int) calculadora.divideDoisNumeros(20,5);
        int[] numeros = {1,2,3,4,5};
        int[] numeros1 = {1,2,3,10};

        calculadora.somarVarArgs(numeros1);


        calculadora.somaArray(numeros);
        System.out.println("Finalizando Calculadora");
        System.out.println(result);


    }
}
