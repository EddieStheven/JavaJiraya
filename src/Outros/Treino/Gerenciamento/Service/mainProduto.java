package Outros.Treino.Gerenciamento.Service;

import Outros.Treino.Gerenciamento.Back.Estoque;
import Outros.Treino.Gerenciamento.Back.Produto;

import java.util.Scanner;

public class mainProduto {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Quantidade de Produto");
            System.out.println("5. Remover Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // adicionar produto

                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();


                    Produto novoProduto = new Produto(id, nome, quantidade);
                    estoque.adicionarProduto(novoProduto);
                    break;


                case 2:

                    estoque.listarProduto();
                    break;

                case 3: // Busca por ID

                    System.out.println("Digite o ID do produto que deseja encontrar: ");
                    int idBusca = scanner.nextInt();
                    Produto produtoEncontrado = estoque.buscarProdutoID(idBusca);

                    if (produtoEncontrado != null) {
                        System.out.println("Produto foi encontrado: " + produtoEncontrado);
                        break;
                    } else {
                        System.out.println("Produto de id " + idBusca + " não foi encontrado!");
                    }

                    break;


                case 4:

                    System.out.println("Digite o ID do produto para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    Produto produtoAtualizar = estoque.buscarProdutoID(idAtualizar);

                    if (produtoAtualizar != null) {
                        System.out.println("Digite a nova quantidade: ");
                        int novaQuantidade = scanner.nextInt();
                        estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    } else {
                        System.out.println("Produto com id " + idAtualizar + " Não foi encontrado!");
                    }

                    break;


                case 5:

                    System.out.println("Deseja remover qual produto ? ");
                    int idRemover = scanner.nextInt();

                    Produto produtosRemover = estoque.buscarProdutoID(idRemover);


                    if (produtosRemover != null) {
                        System.out.print("Tem certeza que deseja remover o produto " + produtosRemover.getName() + "? (s/n): ");
                        char confirmacao = scanner.next().toLowerCase().charAt(0);

                        if (confirmacao == 's') {
                            estoque.removerProduto(idRemover);
                        } else {
                            System.out.println("Operação cancelada.");
                        }
                    } else {
                        System.out.println("Produto com ID " + idRemover + " não encontrado.");
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
