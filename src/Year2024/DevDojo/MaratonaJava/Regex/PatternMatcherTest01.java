package Year2024.DevDojo.MaratonaJava.Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    // Expressão Irregular
    public static void main(String[] args) {
        /*
         \d = todos os dígitos
         \D = tudo o que não for dígito
         \s = Espaços em branco \t \n \f \r
         \S = Todos os caracters excluindo os brancos
          \w = a-ZA-Z, dígitos, -
          \W = Tudo o que não gor incluso no w
          []
          + uma ou mais
          {n,m} de n até m
          ()
          * zero ou mais

       */

        // Year2024.DevDojo.String regex = "a-zA-c";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-z])+\\.([a-zA-z])+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail.com";
        System.out.println("Email válido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice 0123456789");
        System.out.println("ragex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group()+"\n");
        }



    }
}
