package DevDojo.MaratonaJava.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {
    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpsata");
        Path subPastaDirectory = Files.createDirectory(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");
        Path filePathCreated = Files.createFile(filePath);

        if (Files.notExists(filePath)){
            Path pastaDirectory = Files.createDirectory(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);



    }
}
