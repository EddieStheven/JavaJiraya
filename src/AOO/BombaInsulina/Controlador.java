package AOO.BombaInsulina;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controlador implements Uten{


    // Implementando as interfaces
    @Override
    public void relogio() {

        LocalDateTime Horario = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String HorarioAtual = Horario.format(formatter);
        System.out.println("É exatamente: " +HorarioAtual);
        System.out.println("Está na hora de tomar a insulina! ");

    }

    @Override
    public void Bomba() {

    }
    @Override
    public void Alarme() {

    }
    @Override
    public void Sensor() {

    }
    @Override
    public void Agulhas() {

    }
    @Override
    public void Display1() {

    }
    @Override
    public void Display2() {

    }

}
