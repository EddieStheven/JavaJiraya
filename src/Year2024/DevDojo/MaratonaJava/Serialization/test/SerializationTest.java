package Year2024.DevDojo.MaratonaJava.Serialization.test;

import Year2024.DevDojo.MaratonaJava.Serialization.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Eddie Stheven","12345678910");
        /*serializar(aluno);*/
        deserializar();
    }


    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
                oos.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
