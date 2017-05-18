package OOP.Them9.Laba2;

import java.util.StringTokenizer;

/**
 * Created by Den on 21.02.2017.
 * Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”. Create a class Main with a main() method.
 * In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat”
 * for second. Write code to display all of the letters, which are present in the first word, but absent in the second.
 */
public class Main {

    static int zz=0;

    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        char[] myStr1Arr = myStr1.toCharArray();
        char[] myStr2Arr = myStr2.toCharArray();

        for (int i = 0; i <myStr1Arr.length ; i++) {

            for (int j = 0; j <myStr2Arr.length ; j++) {
                if(myStr1Arr[i]!=myStr2Arr[j])  zz++;
            }
            if(zz == myStr2Arr.length )
                System.out.print(myStr1Arr[i]);
            else zz=0;

        }
// второй вариант
        StringTokenizer tokenizer = new StringTokenizer(myStr1,myStr2);
        while (tokenizer.hasMoreTokens()) {
            System.out.println();
            System.out.print(tokenizer.nextToken());
        }

    }
}
