package Year2024.Outros.ONE.ScreenMatch2;

public class Titulo {

    private String NomeFilme;
    private String diretorFilme;
    private int anoDeLancamento;
    private float notaFilme;
    private boolean plano;

    public Titulo(String nomeFilme, String diretorFilme, int anoDeLancamento, float notaFilme, boolean plano) {
        NomeFilme = nomeFilme;
        this.diretorFilme = diretorFilme;
        this.anoDeLancamento = anoDeLancamento;
        this.notaFilme = notaFilme;
        this.plano = plano;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.NomeFilme = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());

    }

    @Override
    public String toString() {
        return "Titulo{" +
                "NomeFilme='" + NomeFilme + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                '}';
    }

    public String getNomeFilme() {
        return NomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        NomeFilme = nomeFilme;
    }
    public String getDiretorFilme() {
        return diretorFilme;
    }
    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public float getNotaFilme() {
        return notaFilme;
    }
    public void setNotaFilme(float notaFilme) {
        this.notaFilme = notaFilme;
    }
    public boolean isPlano() {
        return plano;
    }
    public void setPlano(boolean plano) {
        this.plano = plano;
    }
}
