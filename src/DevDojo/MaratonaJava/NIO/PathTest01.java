package DevDojo.MaratonaJava.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Eddie\\Desktop\\Códigos\\Java Nextage\\file.txt");
        Path p2 = Paths.get("C:\\Users\\Eddie\\Desktop\\Códigos\\Java Nextage\\file.txt","file.txt");
        
        System.out.println(p1.getFileName());
    }
}
