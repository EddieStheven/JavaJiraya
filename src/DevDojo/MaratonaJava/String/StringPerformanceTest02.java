package DevDojo.MaratonaJava.String;

public class StringPerformanceTest02 {
    public static void main(String[] args) {

        String nome = "William Suane";
        nome.concat("DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane ");
        sb.append("DevDojo");
        sb.reverse();
        sb.delete(0,3);
        sb.reverse();
        System.out.println(sb);


    }
}
