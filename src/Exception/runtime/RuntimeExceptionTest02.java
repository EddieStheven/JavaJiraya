package Exception.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

         try{
             System.out.println("Abrindo arquivo");
             throw new RuntimeException();
          //   System.out.println("Fechando recurso liberado pelo SO");
         } catch (Exception e){
             e.printStackTrace();
         } finally { // O finally vai executar independente do código
             System.out.println("Fechando recurso liberado pelo SO");
         }





    }
}
