package OOP.Them17.Laba4;

/**
 * Created by Den on 20.03.2017.
 */
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

/**
 * Created by Den on 16.03.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int symArr=0;
        long symTread=0;

        List<Integer> arrSum =new ArrayList<>(1000);
        for (int i = 0; i <1000 ; i++) {
            arrSum.add(random.nextInt(1000));

        }
        for (Integer i:arrSum) {
            symArr+=i;
        }
        System.out.println("Сумма колекции "+symArr);
        MySumCount mySumCount1 = new MySumCount(0,500,arrSum);
        MySumCount mySumCount2 = new MySumCount(500,1000,arrSum);

        Thread thread1 = new Thread( mySumCount1);
        Thread thread2 = new Thread( mySumCount2);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();


        symTread=mySumCount1.getResultSum()+mySumCount2.getResultSum();
        System.out.println("4 лаба*"+symTread);
    }
}