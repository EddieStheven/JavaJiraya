package Year2024.DevDojo.MaratonaJava.ClasssesInternas;

public class OuterClassesTest {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAtributte(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest outerClass = new OuterClassesTest();

        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest().new Inner();
        inner.printOuterClassAtributte();
        inner2.printOuterClassAtributte();

    }
}
