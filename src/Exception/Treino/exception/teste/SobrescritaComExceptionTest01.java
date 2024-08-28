package Exception.Treino.exception.teste;

import Exception.Treino.exception.dominio.Funcionario;
import Exception.Treino.exception.dominio.Pessoa;
import Exception.Treino.exception.dominio.LoginInvalidoException;

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
