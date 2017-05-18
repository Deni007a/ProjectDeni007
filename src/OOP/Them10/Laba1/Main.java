package OOP.Them10.Laba1;

/**
 * Created by Den on 21.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");

        Integer z1 =130;
        Integer z2 = Integer.valueOf(130);



        System.out.println( x1==x2);
        System.out.println( x1==x4);
        System.out.println( x1==x5);

        System.out.println( z1.equals(z2));
        System.out.println( z1==z2);



    }
}
