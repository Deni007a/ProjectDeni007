package OOP.Them16.Laba2;

/**
 * Created by Den on 14.03.2017.
 */
public class Main {

    static void foo (int a){
    System.out.println( "int "+ a);

    }
    static void foo (Byte b){
        System.out.println( "Byte "+ b);

    }
    public static void main(String[] args) {
        foo((byte)120);
        foo((byte)129); // ЫЫЫЫ!
        Byte zz = 25;
        foo(zz);


    }
}
