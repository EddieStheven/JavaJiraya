package javacore.ONE.Desafio1.Back;

public class Músicas extends Áudio {
    // Atributos da classe música
    private String album;
    private String cantor;
    private String genero;

    // Método para imprimir músicas
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("     ");
        System.out.println("Álbum: " +this.getAlbum());
        System.out.println("Cantor: " +this.getCantor());
        System.out.println("Gênero Músical: " +this.getGenero());
        System.out.println("     ");
    }

    // Métodos construtor da classe
    public Músicas(String album, String cantor, String genero) {
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    // Encapsulamento
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
