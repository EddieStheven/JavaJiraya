package Year2024.Outros.ONE.ScreenMatch;

public class Transmissao {
    private String nome;
    private Transmissao transmissao;

    public Transmissao(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

}
