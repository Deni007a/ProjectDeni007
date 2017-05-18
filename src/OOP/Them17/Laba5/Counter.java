package OOP.Them17.Laba5;

/**
 * Created by Den on 20.03.2017.
 */
public class Counter implements Runnable {

    Storage stor;

    public Counter(Storage store) {
        stor = store;

    }

    int intCounter;

    @Override
    public void run() {

        for (int i = 0; i < 30; i++) {
            synchronized (stor) {
                try {
                    stor.trueZZnotifyAll();
                    stor.trueZZwail();
                    intCounter++;
                    System.out.println(i);
                    stor.setNamber(intCounter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //System.out.println("* " + stor.getNamber());


            }

        }

    }


}
