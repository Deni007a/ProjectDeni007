package OOP.Them18.Laba3;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Den on 24.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("Rus","Uganda");



        System.out.println(locale);

        Date date = new Date();
        System.out.println("Data "+date.toString());
        int zz2 =10000000;
        double zz =10.110;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat=NumberFormat.getInstance(Locale.getDefault());

        System.out.println(numberFormat);
        System.out.println(numberFormat.format(zz));
        System.out.println(numberFormat.format(zz2));

        System.out.println(numberFormat.getCurrency().getCurrencyCode());
        System.out.println(numberFormat.getCurrency().getCurrencyCode()+" "+numberFormat.format(zz2));

        Calendar calendar =Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int moon = calendar.get(Calendar.MONTH)+1;


        System.out.println(day);
        System.out.println(moon);





    }
}
