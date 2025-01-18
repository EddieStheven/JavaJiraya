/*package Year2024.Outros.ONE.ScreenMatch2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Para buscar o filme
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para buscar: ");
        String busca = leitura.nextLine();

        String endereço = "https://www.omdbapi.com/?t=" + busca + "&apikey=bafdfbcf";
        try {
        // API Screen Match
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereço))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Erro de Argumento.");
        }

        System.out.println("Programa finalizou corretamente!");



    }


}


 */