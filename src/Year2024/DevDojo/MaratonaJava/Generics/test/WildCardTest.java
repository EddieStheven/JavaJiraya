package Year2024.DevDojo.MaratonaJava.Generics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho!");
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gatinho!");
    }
}


public class WildCardTest {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()} ;
        Gato[] gatos = {new Gato(), new Gato()} ;

        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animal = {new Gato(), new Cachorro()};
        System.out.println(animal);
    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }

    }

}
