package Outros.Gafanhoto.Front;


import Outros.Gafanhoto.Back.Lutador;

public class Service {
    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("Jiu-Jitsu",0,1,32,"BR","Anderson Silva",79,13);
        Lutador lutador2 = new Lutador("Boxe",0,0,28,"BR","Charles do Bronx",65,23);

        lutador1.imprime();
        lutador2.imprime();

        lutador1.status();

        lutador1.entrouNoRingue();
        lutador2.entrouNoRingue();

        lutador1.bater();
        lutador2.apanhou();
        lutador1.bater();
        lutador2.apanhou();
        lutador2.bater();
        lutador2.bater();
        lutador1.apanhou();
        lutador1.bater();
        lutador2.apanhou();
        lutador2.bater();
        lutador2.bater();
        lutador1.apanhou();

        lutador2.ganhou();

    }



}




