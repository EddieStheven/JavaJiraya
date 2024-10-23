package DevDojo.MaratonaJava.Lambdas.dominio;

public class Anime {
    private String title;
    private int episodios;


    public Anime(String title, int episodios) {
        this.title = title;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodios=" + episodios +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
