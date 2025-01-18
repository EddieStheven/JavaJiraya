package Year2024.DevDojo.MaratonaJava.Wrappers;

public class WrapperTest01 {
    public static void main(String[] args) {

    byte byteP = 3;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10f;
    double doubleP = 10D;
    char charP = 'W';
    boolean booleanP = false;

// Wappares

    Byte byteW = 1;
    Short shortW = 1;
    Integer intW = 1; // autoboxing
    Long longW = 10L;
    Float floatW = 10f;
    Double doubleW = 10D;
    Character charW = 'W';
    Boolean booleanW = false;

    int i = intW; // unboxing
    Integer intW2 = Integer.parseInt("2");
    boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
