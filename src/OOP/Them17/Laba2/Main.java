package OOP.Them17.Laba2;

/**
 * Created by Den on 16.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        MyTimeBomb myTimeBomb1 = new MyTimeBomb();
        Thread thread = new Thread( myTimeBomb1);
        // thread.run();
        thread.start();

        System.out.println("Ower");
    }
}
