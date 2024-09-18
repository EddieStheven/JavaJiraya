package DevDojo.MaratonaJava.APrimeira;

import java.util.Scanner;

public class EstouDoido {
    public static void main(String[] args) {

        int wage = 2000;
        int date = 2024;
        var name = "Eddie Stheven";
        var address = "Salvador";
        var relatorio = ("I " + name + " living at the address in " + address + "! I confirm that I received the salary for " + wage + ", on the date " + date + "!");

        System.out.println("I " + name + " living at the address in " + address + "!");
        System.out.println("I confirm that I received the salary for " + wage + ", on the date " + date + "!");
        System.out.println(relatorio);

        int n1 = 10;
        int n2 = 20;
        double resultado = n1 / (double) n2;

        System.out.println(resultado);

        // > < >= <= &&(Adição(AND))
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 2412;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("IsDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        //  ||(OU)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorTotalContaPoupanca || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += *= -= /= %+ ++
        int bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus++; // Acrescenta 1
        bonus--; // Diminui 1
        bonus /= 2; // Dividi por 2 = 1800
        System.out.println(bonus);

        // if(Se)  else(ou)
        int idade1 = 24;
        boolean categoriaInfantil = idade1 < 15;
        boolean categoriaJuvenil = idade1 >= 15 && idade1 < 18;


        if (categoriaInfantil) {
            System.out.println("Categoria Infantil");
        } else if (categoriaJuvenil) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulta");
        }

        // uma maneira maís fácil de fazer e usando mais de um else if

        int idade2 = 45;

        if (idade2 < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade2 >= 15 && idade2 < 18) {
            System.out.println("Categoria Juvenil");
        } else if (idade2 >= 40) {
            System.out.println("Vá descansar");
        } else {
            System.out.println("Categoria Adulta");
        }

        // Operador Ternário (Ele SIMPLIFICA e otimiza seu código sem precisar do if else, mas depende do objetivo)
        double salario1 = 9000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        // (condição) ? verdadeiro : falso
        String resultado1 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado1);

        // usando o exemplo da categoria
        int idade3 = 15;
        String categoria;
        categoria = idade3 < 15 ? "Categoria Infantil" : idade3 >= 15 && idade3 < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

        byte dia = 8;

        switch (dia) {
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

        byte dia2 = 7;

        switch (dia2) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de Semana");
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
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        byte dia3 = 3;
        switch (dia3) {
            case 1:
            case 2:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        // While, for, do while
        int count = 0;
        while (count <= 10)
            System.out.println(++count);


        count = 0;
        do {
            System.out.println("Dentro do do-while" + count);
            ++count;
        } while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For" + i);
        }

       /* for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        } */

        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        int carro = 50000;
        for (int parcela = 1; parcela <= carro; parcela++) {
            int valorParcela = carro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela  " + parcela + " R$" + valorParcela);
            } else {
                break;
            }
        }

        // Arrays

        int[] idade6 = new int[3];
        // byte, short, int, long, float e double 0
        // boolean false
        // DevDojo.MaratonaJava.String = null
        // Basicamente se vc usar essas variáveis e sem declarar o valor, elas vão ser iniciada dessa maneira, 0, false e etc..
        idade6[0] = 21;
        idade6[1] = 11;
        idade6[2] = 34;
        System.out.println(idade6[0]);

        String[] nome1 = new String[5];
        nome1[0] = "Eddie";
        nome1[1] = "Elicles";
        nome1[2] = "Edisandra";
        nome1[3] = "Edjan";
        nome1[4] = "Eu sou Incrível";

        for (int i = 0; i < nome1.length; i++) {
            System.out.println(nome1[i]);
        }

        int[] numeros2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }


        int[] numeros3 = {6, 7, 8, 9, 10};

        for (int num : numeros3) {
            System.out.println(num);
        }

        String[] frase = {"Eddie", "Edjan", "Elicles", "Edisandra"};

        for (String fra : frase) {
            System.out.println(fra);
        }


        // Arrays Multidimensionais
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 1;
        dias[1][1] = 34;
        dias[1][2] = 23;

        dias[2][0] = 5;
        dias[2][1] = 25;
        dias[2][2] = 50;

        /*for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }*/

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{10, 11, 12, 13, 14};


        for (int[] arrayBase1 : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase1) {
                System.out.print(num + "  ");
            }
        }

        System.out.println("\n--------------------------------------------------------");

        String[] estados = {"AC", "BA", "CE", "DF", "AM", "AP", "PB", "RN", "MS", "SP"};
        for (String CEP : estados) {
            System.out.println(CEP);
        }

        /* Para o leitor inserir informação tem que importar a biblioteca Scanner - import java.util.Scanner; - e fazer os passos a seguir: */

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de Estado você quer buscar ?");

        String siglaBuscar = leitor.nextLine();

        // Busca Linear

        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if (elemento.equals(siglaBuscar)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }

    }

}
