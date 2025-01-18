package Year2024.DevDojo.MaratonaJava.ClasssesInternas;

public class OuterClassesTest01 {
    private String name = "Goku";

    void print(){
        class LocalClasses {
            public void printLocal(){
                System.out.println(name);
            }
        }

    }

    public static void main(String[] args) {

    }
}
