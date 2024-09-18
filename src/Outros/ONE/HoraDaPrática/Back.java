package Outros.ONE.HoraDaPrática;

import java.util.Scanner;

public class Back {

    public void pratica1() {
        Scanner p1 = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é positivo ou negativo: ");
        int numDigitados = p1.nextInt();

        if (numDigitados > 1) {
            System.out.println("Esse número é positivo!");
        } else if (numDigitados == 0) {
            System.out.println("Esse número é nulo!");
        } else {
            System.out.println("Esse número é negativo!");
        }


    }
    public void pratica2() {
        Scanner p2 = new Scanner(System.in);

        System.out.println("Digite seu primeiro número: ");
        int num1 = p2.nextInt();
        System.out.println("Digite seu segundo número: ");
        int num2 = p2.nextInt();

        if (num1 == num2) {
            System.out.println("Esse números são iguais!");
        } else {
            System.out.println("São diferentes!");
        }

        if (num1 > num2) {
            System.out.println("O primeiro número é maior!");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior!");
        }


    }
    public void pratica3() {
        Scanner p3 = new Scanner(System.in);

        String menu;
        // Menu para escolha
        menu = "Bem vindo ao menu!\n" +
                "Vamos te dar duas opções:" +
                "\n[1] - Calcular área do quadrado!" +
                "\n[2] - Calcular área do círculo!" +
                "\n Escolha uma opção:   ";
        System.out.println(menu);
        int men = p3.nextInt();

        switch (men) { // Vai imprimir os calculos
            case 1: // Calculo da área do quadrado
                System.out.println("Digite o lado do quadrado:");
                double lado = p3.nextDouble();
                double areaDoQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaDoQuadrado);
                break;
            case 2: // Calculo da área do círculo
                System.out.println("Digite o raio do circulo: ");
                double raio = p3.nextDouble();
                double areaDoCirculo = 3.14 * raio * raio;
                System.out.println("Área do circulo: " + areaDoCirculo);
                break;
            default:  // Inseriu um número inválido
                System.out.println("Opção Inválida!");
                break;
        }
    }
    public void pratica4() {
        Scanner p4 = new Scanner(System.in);

        System.out.println("Escreva um número para saber sua tabuada: ");
        int num = p4.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Tabuada de " +num +" é " + (i * num));
        }

    }
    public void pratica5(){
        Scanner p5 = new Scanner(System.in);
        System.out.println("Digite um número para descobrir se é par ou impar: ");
          int num = p5.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        }  else {
            System.out.println("O número é impar");
        }


    }
    public void pratica6(){
        Scanner p6 = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial: ");
        int num = p6.nextInt();

        int fatorial = 1;

        for (int i = 1; i < num; i++) {
            fatorial *= i;

            System.out.println("O fatorial do número " +num + " é " +fatorial);
        }

    }


}





