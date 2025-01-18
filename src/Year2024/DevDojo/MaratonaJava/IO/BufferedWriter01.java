package Year2024.DevDojo.MaratonaJava.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriter01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)){

            bw.write("O Year2024.DevDojo é massa, melhor curso do Brasil");
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
