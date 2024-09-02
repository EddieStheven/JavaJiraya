package Dates.Test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1725193574819L);// long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
