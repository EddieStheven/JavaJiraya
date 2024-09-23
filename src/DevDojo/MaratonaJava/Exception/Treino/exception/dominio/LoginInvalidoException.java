package DevDojo.MaratonaJava.Exception.Treino.exception.dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {

        System.out.println("Login Inválido");

    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
