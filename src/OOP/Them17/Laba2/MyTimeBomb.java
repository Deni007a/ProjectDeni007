package OOP.Them17.Laba2;


import static java.lang.Thread.sleep;

/**
 * Created by Den on 16.03.2017.
 */
public class MyTimeBomb implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+ " Boom");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("BOM!!");
    }

}
