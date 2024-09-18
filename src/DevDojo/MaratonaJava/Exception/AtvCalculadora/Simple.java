package DevDojo.MaratonaJava.Exception.AtvCalculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple extends Exceptions {

    public static void main(String[] args) {

        // Scanner + Associação de de Classes
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Exceptions exceptions = new Exceptions();

        try { // Interação com o Usuário
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            scanner.nextLine(); // Consumir a nova linha que ficou no buffer após nextInt()

            System.out.println("Digite a operação (soma, subtracao, multiplicacao, divisao): ");
            String operacao = scanner.nextLine().toLowerCase(); // Vai ler a linha completa do texto e além disso o toLowerCase vai substituir as letras MAIUSCULAS por minusculas

            int resultado = 0;

            switch (operacao) { // Switch para escolha das operações
                case "soma":
                    resultado = Calculator.somar(num1, num2);
                    break;
                case "subtracao":
                    resultado = Calculator.subtrair(num1, num2);
                    break;
                case "multiplicacao":
                    resultado = Calculator.multi(num1, num2);
                    break;
                case "divisao":
                    resultado = Calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }

            System.out.println("Resultado: " + resultado); // Vai exibir o resultado

        } catch (InputMismatchException e) { // Tratamentos dos erros para identificação

            e.printStackTrace();
            InputMismatchException();

        } catch (ArithmeticException e) {

            e.printStackTrace();
            ArithmeticException(e);

        } catch (Exception e) {

            e.printStackTrace();
            GenericException(e);

        } finally {

            scanner.close();

        }
    }
}