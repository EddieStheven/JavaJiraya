package DevDojo.MaratonaJava.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter01 {
    // File = Arquivos
    // FileWriter =  Escrever arquivos (LOW-LEVEL)
    // FileReader = Leitura de arquivos
    // BufferedWriter Escrever arquivos (Mais otimizada)
    // BufferedReader Leitura de arquivos (Mais Otimizada)

    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file)){

            fw.write("O DevDojo é massa, melhor curso do Brasil");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
