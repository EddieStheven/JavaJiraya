package DevDojo.MaratonaJava.Colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
