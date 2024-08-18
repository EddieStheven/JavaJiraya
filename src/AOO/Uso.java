package AOO;

import AOO.BombaInsulina.NivelAcucar;
import AOO.BombaInsulina.PessoaDoente;
import AOO.BombaInsulina.Controlador;

public class Uso {

    public static void main(String[] args) {

        PessoaDoente pessoa1 = new PessoaDoente(30, NivelAcucar.ACUCAR_ALTO,"Fulano",true);

        pessoa1.imprime();

        pessoa1.relogio();








    }








}
