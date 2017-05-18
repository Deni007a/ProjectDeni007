package OOP.Them9.Laba4;

import java.util.StringTokenizer;

/**
 * Created by Den on 21.02.2017.
 * Create a class Main with a main() method. In method main() declare local variables myStr add code which split a string by
 * “space” “comma” and “.dot” delimiter using StringTokennizer class, and iterate the StringTokenizer elements and print it out
 * one by one to console. String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
 */
public class Main {


    public static void main(String[] args) {
        String  myStr ="This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer token  = new StringTokenizer(myStr,"., ");
           while (token.hasMoreTokens()) {

               System.out.println(token.nextElement());

           }
    }
}
