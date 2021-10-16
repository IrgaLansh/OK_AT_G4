package tasks.classwork.day05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static java.lang.String.valueOf;

public class DemoMath {
    public static void main(String[] args) throws ParseException {
        /*
         *//*        float xx = 0.3f;
        float yy = 0.4f;
        //String.
        int gg = Integer.parseInt("222");
        int hh = Integer.parseInt("bhjdbhbj");
        System.out.println(gg);*//*

        long t1 = System.currentTimeMillis();

        int n = 10_000_000;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append("*");

        }
        System.out.println(s.length());
        System.out.println(System.currentTimeMillis() - t1);

        //System.out.println(xx + yy);
    }*/
//    compare(null);
//
//    }
//    public static void compare(String s){
//        System.out.println("mama".equals(s));
//    }

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        //Date date = dateFormat.parse("04.06.2012");
        String text = dateFormat.format(new Date());

        System.out.println(text);

    }

}

