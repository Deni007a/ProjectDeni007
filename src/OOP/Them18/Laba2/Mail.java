package OOP.Them18.Laba2;

import java.math.BigDecimal;



/**
 * Created by Den on 24.03.2017.
 */
public class Mail {

    private static BigDecimal nails1  = new BigDecimal("0.10");

     private static BigDecimal getNails1() {
        return nails1;
    }

     private static BigDecimal getNails2() {
        return nails2;
    }

     private static BigDecimal getNails3() {
        return nails3;
    }

     private static BigDecimal getNails4() {
        return nails4;
    }

    static BigDecimal nails2  = new BigDecimal(0.211);
   static BigDecimal nails3  = new BigDecimal(0.30);
   static BigDecimal nails4  = new BigDecimal("0.40");




    public static void main(String[] args) {
        BigDecimal youbay = new BigDecimal ("1");

        String i ="2";


        youbay=youbay.subtract(getNails2().multiply(new BigDecimal(i)));
        youbay=youbay.subtract(getNails2());
        youbay=youbay.setScale(3, BigDecimal.ROUND_UP);



        System.out.println(youbay.setScale(2, BigDecimal.ROUND_UP));



        System.out.println(youbay);






    }
}
