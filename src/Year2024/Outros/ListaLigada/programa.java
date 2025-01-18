package Year2024.Outros.ListaLigada;

public class programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adcionar("BA");
        lista.adcionar("DF");
        lista.adcionar("RJ");

        System.out.println("Tamanho: " +lista.getTamanho());
        System.out.println("Primeiro: " +lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " +lista.getUltimo().getValor());

        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());


    }
}
