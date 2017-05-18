package OOP.Them17.Laba5;

/**
 * Created by Den on 20.03.2017.
 */
class Printer implements Runnable {
    Storage stor;

    public Printer(Storage store) {
        stor = store;

    }

    private boolean print = false;

    @Override
    public void run() {
        synchronized (stor) {
            for (int i = 0; i < 30; i++) {

                try {
                    stor.falseZZwail();
                    stor.falseZZnotifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("print " + stor.getNamber());

            }


        }
    }
}

