package Outros.ONE.JogoDaAdvinhação;

import java.util.Random;
import java.util.Scanner;
public class Back {

    public void BackJogo(){
        Scanner leitor = new Scanner(System.in);
        int numGerado = new Random().nextInt(10);
        int tentativas = 0;
        int numDigitado = 0;

        System.out.println("=====================================");
        System.out.println("Bem-vindo ao jogo de advinhação!");
        System.out.println("Você possuí 5 tentativas para acertar o número :).\n ");

        while (tentativas < 5){
            System.out.println("Digite um número para jogar: ");
            int numDigitados = leitor.nextInt();
            tentativas++;

            if(numDigitado == numGerado){
                System.out.println("Parabéns, você conseguiu acertar! \n");
                break;
            } else if( numDigitado < numGerado){
                System.out.println("Número gerado é maior que o número digitado! \n ");
            } else{
                System.out.println("Número gerado é menor que o número digitado!  \n");
            }

        }

        if(tentativas == 5 && numDigitado != numGerado ){
            System.out.println(":( Infelizmente, você não conseguiu acertar!");
        }

    }





}
