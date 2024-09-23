package DevDojo.Desafios.Aatividades.A3;


import java.util.Scanner;

public class ListaSh {

    public static void imprime2() {

        int num1;

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Escolha um número entre 12 a 20: ");
            num = scanner.nextInt();
            if (num < 12 || num > 20) {
                System.out.println("Entrada Inválida, digite novamente!");
            }
        } while (num < 12 || num > 20);

        System.out.println("Você digitou: " + num);

    }
    public static void imprime3(){

       int diaS;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o dia da semana: ");
        diaS = input.nextInt();

        switch (diaS) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção invalida");
                break;


        }
    }
    public static void imprime5(){

        int num, num1, num2;
        int soma;

        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] - Adição ... [2] Subtração ... [3] Multiplicação ... [4] Divisão");
        System.out.println("Escolha a Operação Básica:");
        num = scanner.nextInt();


        if (num == 1){
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextInt();

            soma = num1 + num2;

            System.out.println(soma);
        } else if (num == 2){
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextInt();

            soma = num1 - num2;

            System.out.println(soma);
        } else if (num == 3){
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextInt();

            soma = num1 * num2;

            System.out.println(soma);
        } else if (num == 4){
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextInt();

            soma = num1 / num2;

            System.out.println(soma);

        } else if (num > 4){
            System.out.println("Número Errado");
            return;
        }

    }
    public static void imprime8 (){
        int num;
        for (int i = 7; i <= 61; i++) {
            System.out.println(i);

        }

    }


}


