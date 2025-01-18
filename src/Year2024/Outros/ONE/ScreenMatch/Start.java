package Year2024.Outros.ONE.ScreenMatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Objetos ( ScreenMatch ) instanciados
        ScreenMatch Filme = new ScreenMatch("Shrek", "Andrew Adamson", 2001, 10.0F, true);
        ScreenMatch Filme1 = new ScreenMatch("Kung Fu Panda", "Mark Osborne", 2008, 10.0F, false);

        // Objeto ( Transmissão ) instanciados
        Transmissao t1 = new Transmissao("Netflix");
        Transmissao t2 = new Transmissao("Amazon Play");

        // Associando a classe ScreenMatch e a classe Transmissão
        Filme.setTransmissao(t1);
        Filme1.setTransmissao(t2);

        // Imprimindo as informações
        Filme.imprimirInfor();
        Filme1.imprimirInfor();




    }
}


