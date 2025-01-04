package Outros.Treino.SalaDeAula.Service;

import Outros.Treino.SalaDeAula.Back.Aluno;
import Outros.Treino.SalaDeAula.Back.SalaDeAula;


import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        SalaDeAula salaDeAula = new SalaDeAula();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno por ID");
            System.out.println("4. Atualizar a nota do Aluno");
            System.out.println("5. Remover Aluno");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:

                    System.out.println("Digite o ID do aluno: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    int nota = scanner.nextInt();

                    Aluno novoAluno = new Aluno(id, nome, nota);
                    salaDeAula.adicionarAluno(novoAluno, id);
                    break;

                case 2:

                    salaDeAula.listarAlunos();
                    break;

                case 3:

                    System.out.println("Digite o id do aluno que deseja encontrar: ");
                    int idbusca = scanner.nextInt();
                    Aluno alunoEncontrado = salaDeAula.buscarAlunosPorId(idbusca);


                    if (alunoEncontrado != null){
                        System.out.println("O aluno foi encontrado: " +alunoEncontrado);
                        break;
                    } else {
                        System.out.println("O aluno de " + idbusca+ "não foi encontrado!");
                    }

                case 4:

                    System.out.println("Digite o id do aluno para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    Aluno alunoAtualizado = salaDeAula.buscarAlunosPorId(idAtualizar);


                    if (alunoAtualizado != null){

                        System.out.println("Digite a nova nota: ");
                        int novaNota = scanner.nextInt();
                        salaDeAula.atualizarNota(idAtualizar,novaNota);

                    } else {

                        System.out.println("O aluno com id de " + idAtualizar + " não foi encontrado!");

                    }

                case 5:

                    System.out.println("Qual aluno você quer remover do sistema ? ");
                    int idRemover = scanner.nextInt();

                    Aluno alunoRemover = salaDeAula.buscarAlunosPorId(idRemover);

                    if (alunoRemover != null) {
                    System.out.print("Tem certeza que deseja remover o aluno " + alunoRemover.getNome() + "? (s/n): ");
                    char confirmacao = scanner.next().toLowerCase().charAt(0);

                    if (confirmacao == 's') {
                        salaDeAula.removerAluno(idRemover);
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                } else {
                    System.out.println("O aluno com ID " + idRemover + " não encontrado.");
                }
                break;

                case 6: // Sair
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");



            }






        }
    }
}
