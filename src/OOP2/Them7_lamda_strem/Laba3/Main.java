package OOP2.Them7_lamda_strem.Laba3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by Den on 18.04.2017.
 */
public class Main {
        @FunctionalInterface
    public interface MyConverter {
            String convertStr(String str);
            static   String isNull(String str){
            if (str.isEmpty())
            {
                System.out.println("строка равна нулю");str="null";}
        return str;
        }
    }


    static  void   printJstr (List <String> list, Predicate<String> pred){
        System.out.println(list.toString());
        for (String str :list){
            if (pred.test(str)) {
                System.out.println(str+ "  результат");
            }
        }}


     static List<String> updateList(List<String> list, MyConverter con) {
//MyConverter.isNull();
         for (int i = 0; i <list.size() ; i++) {

             //list.set(i,list.get(i).toLowerCase());
             list.set(i,MyConverter.isNull(list.get(i)));
            // MyConverter.isNull(list.get(i));
             con.convertStr(list.set(i,list.get(i).toLowerCase()));
         }

         return list;
     }


    public static void main(String[] args) {
        System.out.println("laba7_3");


        List<String> list = Arrays.asList("Lola", "Liza", "Ana", "Zorymba","");

        // 2  в обратном порядке без лямб
        // Collections.sort(list,Collections.reverseOrder());

        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));


        System.out.println(updateList(list,x->x).toString());
        // System.out.println(list.toString());

        printJstr(list, p-> p.charAt(0)=='l' ); // ищет по первой букве




    }
}
