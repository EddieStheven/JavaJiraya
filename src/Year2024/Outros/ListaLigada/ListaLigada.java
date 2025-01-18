package Year2024.Outros.ListaLigada;

public class ListaLigada {
    private Node primeiro;
    private Node ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }


    public void adcionar(String novoValor){
        Node novoNode = new Node(novoValor);
      if(this.primeiro == null && this.ultimo == null){
          this.primeiro = novoNode;
          this.ultimo = novoNode;
      } else{
          this.ultimo.setProximo(novoNode);
          this.ultimo = novoNode;
      }
        this.tamanho++;
    }

    public void remover(String novoValor){

    }

    public Node get(int posicao){
        Node atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }









    public Node getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
