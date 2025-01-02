package Outros.Treino.Gerenciamento.Back;

import java.util.ArrayList;

public class Estoque {

    public ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Adicionar uma forma de não ter ID dos produtos iguais

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto foi adicionado!");
    }

    public void listarProduto() {
        if (produtos.isEmpty()) {
            System.out.println("Lista está vazia");
        } else {
            System.out.println("Produto no estoque:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public Produto buscarProdutoID(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Produto produto = buscarProdutoID(id);

        if (produto != null) {
            if (novaQuantidade >= 0) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada!");
            } else {
                System.out.println("ERRO: a nova quantidade não pode ser negativa.");
            }
        } else {
            System.out.println("Produto com ID " + id + "não encontrado!");
        }
    }

    public void removerProduto(int id) {
        Produto produto = buscarProdutoID(id);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado! ");
        }


    }

}




