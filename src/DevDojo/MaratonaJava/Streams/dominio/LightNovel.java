package DevDojo.MaratonaJava.Streams.dominio;

public class LightNovel {
    public String novel;
    public double price;

    public LightNovel(String novel, double price) {
        this.novel = novel;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "novel='" + novel + '\'' +
                ", priece=" + price +
                '}';
    }

    public String getNovel() {
        return novel;
    }

    public void setNovel(String novel) {
        this.novel = novel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
