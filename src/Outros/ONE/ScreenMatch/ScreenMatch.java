package Outros.ONE.ScreenMatch;

public class ScreenMatch { // Atributos dos filmes
    private String NomeFilme;
    private String diretorFilme;
    private int ano = 2000;
    private float notaFilme;
    private boolean plano;
    private Transmissao transmissao;

    // Método Construtor
    public ScreenMatch(String nomeFilme, String diretorFilme, int ano, float notaFilme, boolean plano) {
        this.setNomeFilme(nomeFilme);
        this.setDiretorFilme(diretorFilme);
        this.setAno(ano);
        this.setNotaFilme(notaFilme);
        this.setPlano(plano);

    }


    public void Transmissao() { // Método de transmissão
        if (transmissao != null) { // Se transmissão possuir algum nome, ele vai imprimir
            System.out.println("Streaming: " + transmissao.getNome());
        }
    }

    public void imprimirInfor() { // Informações dos Filmes
        System.out.println("============================");
        System.out.println("Filme: " + this.getNomeFilme());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Nota do filme: " + this.getNotaFilme());
        System.out.println("Filmes disponível: " + this.plano);
        System.out.println("Diretor do Filme: " + this.getDiretorFilme());
        direitoNoPlano();
        lancamento();
        Transmissao();
    }

    public void direitoNoPlano() { // Se ele tiver direito ao plano ou não
        if (plano) {
            System.out.println("Você tem acesso a esse Filme!!");
        } else {
            System.out.println("Infelizmente, você não tem direito a esse filme!");
        }
    }

    public void lancamento() { // Vai declarar o estodo/tempo do lançamento com base de quanto foi lançado
        if (ano >= 2015 && ano <= 2022) {
            System.out.println("Filme é recente!");
        } else if (ano > 2022 && ano <= 2024) {
            System.out.println("Filme é lançamento!!");
        } else if (ano < 2015 && ano >= 2000) {
            System.out.println("Filme é antigo!");
        } else if (ano < 1990) {
            System.out.println("Filme não encontrado!");
        } else {
            System.out.println("Filme não existe!");

        }

        System.out.println("java");
    }

    // Encapsulamento dos atributos
    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        NomeFilme = nomeFilme;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getNotaFilme() {
        return notaFilme;
    }

    public void setNotaFilme(float notaFilme) {
        this.notaFilme = notaFilme;
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }
}
