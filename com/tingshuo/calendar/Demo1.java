package com.tingshuo.calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
/*        date1.setTime(2102591991);
            1702593496
        date2.setTime(1651740095);0
..        System.out.println(date1);
        System.out.println(date2);*/
        long t1 = date1.getTime();
        long t2 = date2.getTime();
        System.out.println(t1);
        System.out.println(t2);

    }

}
