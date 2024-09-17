package DevDojo.Exception.Treino.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws  IOException{

        File file = new File("arquivo\\teste.txt");
        try {

           boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);

        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo.");
        }

    }

}
