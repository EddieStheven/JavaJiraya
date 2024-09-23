package DevDojo.MaratonaJava.Regex;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Misaka";
        String[] nomes = texto.split(",");
        for (String nome : nomes){
            System.out.println(nome.trim());
        }
    }

    public static void Scanner(){
        String texto = "Levi, Eren, Mikasa";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNext()){
                int i = scanner.nextInt();
                System.out.println("int " +i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " +b);
            } else {
                System.out.println(scanner.next());
            }

        }
    }


}
