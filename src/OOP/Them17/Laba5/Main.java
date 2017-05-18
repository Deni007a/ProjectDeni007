package OOP.Them17.Laba5;

/**
 * Created by Den on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Storage store = new Storage();
        Counter cou1 = new Counter(store);
        Printer print1 = new Printer(store);


        Thread thread1 = new Thread(cou1);
        Thread thread2 = new Thread(print1);


        thread1.start();
        thread2.start();

    }


}
