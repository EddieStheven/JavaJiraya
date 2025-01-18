package Year2024.Outros.ONE.Banco;

import java.util.Scanner;

public class Back {

    public void bank() {
        Scanner bank = new Scanner(System.in);
        boolean veri;
        String name = "Eddie Stheven";
        String dados;
        int saldoInicial = 2300, opcao = 0;

        do {
            dados = "*****************************\n" +
                    "Dados iniciais do cliente:" +
                    "\nNome:" + name +
                    "\nTipo conta: Corrente" +
                    "\nSaldo inicial: R$" + saldoInicial +
                    "\n*****************************" +
                    "\nBem vindo ao menu!\n" +
                    "Operações:" +
                    "\n[1] - Consultar saldos" +
                    "\n[2] - Transferir valor" +
                    "\n[3] - Depositar valor" +
                    "\n Escolha uma opção:   ";

            System.out.println(dados);
            int men = bank.nextInt();

            if (men > 3) {
                System.out.println("Valor inserido errado!");
            }

// Estrutura do menu
            switch (men) {
                case 1: // Saldo Inicial [1]
                    System.out.println("Seu saldo inicial é:" + saldoInicial);
                    break;

                case 2: // Transferência [2]
                    System.out.println("Digite o quanto quer transferir:");
                    int valor = bank.nextInt();

                    if (valor > saldoInicial) { // Caso o valor de transferência seja maior que seu saldo!
                        System.out.println("Saldo insuficiênte para transferência!\n");
                        break;
                    } else {  // Transfência realizada
                        saldoInicial -= valor;
                        System.out.println("Transfência realizada!\n");
                        System.out.println("Novo saldo: \n" + saldoInicial);
                        break;
                    }

                case 3:
                    System.out.println("Valor depositado: ");
                    int valor1 = bank.nextInt();
                    saldoInicial += valor1;
                    System.out.println("Novo saldo" + saldoInicial);
                    break;
            }


            // Estrutura de repetição
            System.out.println("Digite 4 para cancelar ou qualquer outra tecla para continuar!");
            int veri1 = bank.nextInt();
            if (veri1 == 4 && true) { // Se o cabra digitar 1, vai quebrar o laço
                System.out.println("Processo Finalizado!");
                break;
            } else {
                continue; // vai continuar o laço com qualquer outra tecla
            }

        } while (true);

    }
}
