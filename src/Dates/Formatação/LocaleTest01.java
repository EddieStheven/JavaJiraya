package Dates.Formatação;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH  = new Locale("it","CH");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());


    }
}
