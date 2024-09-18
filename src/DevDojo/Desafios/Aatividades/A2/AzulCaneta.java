package DevDojo.Desafios.Aatividades.A2;

public class AzulCaneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    boolean tampada;

    public AzulCaneta(String modelo, String cor, float ponta, int carga, boolean tampada){   //Método Construtor
        this();
        this.tampar();
        this.setCor("Incolor");
        this.setModelo("FabreCastell");
        this.setPonta(0.5F);

    }
    public AzulCaneta(){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }


    public void imprimir() {

        System.out.println("------------------==================-----------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga()+"%");
        System.out.println("Tamapada ? : " + this.tampada);
        rabiscar();
    }

    public void rabiscar() {
        if (tampada == false) {
            System.out.println("Está com a tampa, não pode rabiscar!");
        } else {
            System.out.println("Caneta Azull, Azull Caneta!");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
}
