package javacore.DevDojo.Calculadora;

public class Calculadora {
  public void somaDoisNumeros(){
      System.out.println(10 + 10);
  }

  public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numParaMultiplicar, int numParaMultiplicar1){
        System.out.println(numParaMultiplicar * numParaMultiplicar1);
    }
    public double divideDoisNumeros(double numDivide, double numDivide1){
        if (numDivide == 0 || numDivide1 == 0) {
            return 0;
        }
      return numDivide/numDivide1;

    }

    public void somaArray(int[] numeros){
      int soma = 0;
      for ( int num: numeros){
          soma += num;
      }
        System.out.println(soma);
    }

    public void somarVarArgs(int... numeros){
        int soma = 0;
        for ( int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
