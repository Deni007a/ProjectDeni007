package OOP.Them16.Laba3;

/**
 * Created by Den on 14.03.2017.
 */
public class Main {

    static void foo (int a, int b){
        System.out.println( "int a , b "+ a+" "+b);

    }
    static void foo (int...b){
        int [] ddd =b;
        for (int a: ddd) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        foo(25,5);
        foo(2,5,6,8,48);


    }
}
