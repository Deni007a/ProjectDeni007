package OOP2.Them6_anotation.Laba1;

import java.util.Date;

/**
 * Created by Den on 13.04.2017.
 */
public class Main {

@Deprecated
 static void findMax(int a) {
        int[]  varargs = new int[1];
    varargs[0]=a;
        System.out.println( a);
    //return varargs[0];
   }


    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Laba6_1");
            findMax(6);

    }
}
