package Year2024.DevDojo.MaratonaJava.Exception.Treino.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}
