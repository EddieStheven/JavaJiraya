
package Year2024.DevDojo.MaratonaJava.Exception.Treino.exception.teste;

import Year2024.DevDojo.MaratonaJava.Exception.Treino.exception.dominio.Funcionario;
import Year2024.DevDojo.MaratonaJava.Exception.Treino.exception.dominio.Pessoa;
import Year2024.DevDojo.MaratonaJava.Exception.Treino.exception.dominio.LoginInvalidoException;

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