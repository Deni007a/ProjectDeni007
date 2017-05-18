package OOP.Them9.Laba1;

/**
 * Created by Den on 21.02.2017.
 * Create a class Main with a main() method. In method main() declare local variable myStr of String type and assign a value:
 * “abracadabra”. Using the methods of the class String, do next steps: * Find the index of first “ra” substring of myStr
 * value and print result to console. * Find the index of last “ra” substring of myStr value and print result to console.
 * * Get substring of myStr from 3 to 7 char index and print result to console.
 * * Create static method reverseString(String) which return String value as result with changed order of
 * letters (reverse it, for example “abcd” ->”dcba”). * Invoke reverseString() method with myStr argument and print
 * result to console.
 */
public class Main {
    static void reverseString(String s){

        char[] chareArr = s.toCharArray();
        for (int i = chareArr.length-1; i >0 ; i--) {
            System.out.print(chareArr[i]);
        }
        System.out.println();
    }

    static void reverseString2(String s){
        StringBuffer s_buff = new StringBuffer(s); // бросаю строку
        System.out.println( s_buff.reverse());

        }


    public static void main(String[] args) {

       String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra")); //Найти индекс первой подстроки «ra» myStr значение и печати результат на консоль.
        System.out.println(myStr.lastIndexOf("ra")); //* Найти индекс последнюю подстроку «ra» myStr
        System.out.println(myStr.substring(3,7)); //* Получить подстроку myStr от 3 до 7 индекс типа char и печатать результат

      reverseString("123456");
         reverseString2("a123456");

    }
}
