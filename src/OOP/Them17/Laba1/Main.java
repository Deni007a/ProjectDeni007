package OOP.Them17.Laba1;



/**
 * Created by Den on 16.03.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyTimeBomb myTimeBomb1 = new MyTimeBomb();
        Thread thread = new Thread( myTimeBomb1);
        Thread thread2 = new Thread( myTimeBomb1);
       // thread.run();
        thread.start();
        thread2.start();
        thread.join();

        System.out.println("Ower");

    }
}
