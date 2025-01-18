package Year2024.Outros.ONE.Desafio1.test;

import Year2024.Outros.ONE.Desafio1.Back.Músicas;
import Year2024.Outros.ONE.Desafio1.Back.Service;
import Year2024.Outros.ONE.Desafio1.Back.Áudio;

public class teste1 {
    public static void main(String[] args) {
        // Informações que vão ser imprimidas
        Músicas music = new Músicas("Triller","Michael Jackson","Pop");
        Músicas music2 = new Músicas("777","Joji","Pop");
        Áudio music4 = new Músicas("teste","teste1","teste2");
        Service t = new Service("Spotify");
        Service t2 = new Service("Amazon Music");

        //Assossiação com o streamer de música
        music.setService(t);
        music2.setService(t2);

        // informações da interface de comando
        music.curte();music.curte();music.curte();music.curte();music.curte();music.curte();
        music.reproduz();music.reproduz();
        music2.curte();music2.curte();
        music2.reproduz();

        // Imprimindo tudo
        music.imprime();
        music2.imprime();
        music4.imprime();






    }
}


