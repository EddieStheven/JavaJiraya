package Year2024.DevDojo.MaratonaJava.IO;

import java.io.IOException;
import java.util.Date;

public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("file.txt");

        try {
            boolean isCreated = file.createNewFile();

            System.out.println("Created " +isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path absolute " +file.getAbsolutePath());
            System.out.println("is directory " +file.isDirectory());
            System.out.println("if file " +file.isFile());
            System.out.println("is hidden " +file.isHidden());
            System.out.println("last modified " + new Date(file.lastModified()));

            boolean existis = file.exists();
            if (existis){
                System.out.println("Deleted " +file.delete());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
