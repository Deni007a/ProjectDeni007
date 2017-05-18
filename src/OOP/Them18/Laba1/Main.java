package OOP.Them18.Laba1;

import java.math.BigInteger;

/**
 * Created by Den on 23.03.2017.
 */
public class Main {

    static BigInteger bigIntrandom () {
        BigInteger bigInteger=new BigInteger(String.valueOf((int) (1 + Math.random() * 50)));
        System.out.println(bigInteger);
        return bigInteger;

    }

    static BigInteger fact(BigInteger big)
    {
         BigInteger output= new BigInteger("1");


        for (int i = 1; i <= big.intValue(); ++i) {

            output=output.multiply(BigInteger.valueOf(i));

            //System.out.println("*" + output);
        }
        return output;
    }

    //int ret = 1;
     //   for (int i = 1; i <= n; ++i) ret *= i;
    //    return ret;






    public static void main(String[] args) {

        BigInteger zz= bigIntrandom();
        System.out.println(zz);

        BigInteger factorial = fact(zz);

        System.out.println(fact(zz));


    }
}
