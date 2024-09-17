package DevDojo.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
            char[] in = new char[1];

            int i;
            while((i=fr.read()) != -1){
                System.out.println((char) i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
