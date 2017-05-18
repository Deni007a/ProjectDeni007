package OOP.Them15.Laba5;

import java.util.*;

/**
 * Created by Den on 11.03.2017.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    static Set<Integer> generate(int numOfElm, int maxNumb) {
        Set<Integer> list = new TreeSet<>();
        Random random = new Random();
        while (list.size()<maxNumb){
            list.add(random.nextInt(maxNumb));

        }
return list;
    }


    public static void main(String[] args) {
 System.out.println(generate(5,10));

    }
}
