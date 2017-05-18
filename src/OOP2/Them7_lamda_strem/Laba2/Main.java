package OOP2.Them7_lamda_strem.Laba2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by Den on 18.04.2017.
 */
public class Main {

    static int sumEven(Integer[] arr, Predicate<Integer> pred) {
    int sum=0;
        for (Integer namber :arr){
            if (pred.test(namber)) sum+=namber;
        }
        return sum;
    }


    static  void   printJstr (List <String> list, Predicate<String> pred){
        System.out.println(list.toString());
        for (String str :list){
            if (pred.test(str)) {
                System.out.println(str+ "  результат");
            }
        }}


    public static void main(String[] args) {
        System.out.println("laba7_2");

        Integer[] arrInt = new Integer[5];
        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(8) + 1;

        }

        Arrays.sort(arrInt,
                (Integer x, Integer y) -> {
                    if (x > y) return -1;
                    else if (x < y) return 1;
                    else return 0;
                }

        );

        List<String> list = Arrays.asList("Lola", "Liza", "Ana", "Zorymba");


        // 2  в обратном порядке без лямб
        // Collections.sort(list,Collections.reverseOrder());

        Collections.sort(list, (s1, s2) -> s2.compareTo(s1)

        );


        System.out.println(Arrays.toString(arrInt));



        //printJstr(list, p-> p.equals("Lola") );
        printJstr(list, p-> p.charAt(0)=='L' ); // ищет по первой букве

        System.out.println(sumEven(arrInt, p -> p % 2 == 0)); // выдает суммы  чисел по модулю на % 2


    }
}
