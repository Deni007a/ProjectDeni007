package OOP.Them16.Laba5;

/**
 * Created by Den on 14.03.2017.
 */
public class Main {

        static void foo (int a){
            System.out.println( "int "+ a);

        }
        static void foo (byte b){
            System.out.println( "byte "+ b);

        }
        public static void main(String[] args) {

            byte zz = 25;
            foo(zz);
            foo(5);
            foo((byte)5);


        }

}
