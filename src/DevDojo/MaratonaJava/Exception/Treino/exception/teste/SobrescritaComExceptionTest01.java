
package DevDojo.MaratonaJava.Exception.Treino.exception.teste;

import DevDojo.MaratonaJava.Exception.Treino.exception.dominio.Funcionario;
import DevDojo.MaratonaJava.Exception.Treino.exception.dominio.Pessoa;
import DevDojo.MaratonaJava.Exception.Treino.exception.dominio.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {

    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        pessoa.salvar();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }


}