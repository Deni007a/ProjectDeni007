package OOP.Them17.Laba5;

/**
 * Created by Den on 20.03.2017.
 */
class Storage {
    private int namber;
    private boolean zz = false;

    public synchronized int getNamber() {
        return namber;
    }

    public synchronized void setNamber(int namber) {
        this.namber = namber;
    }

    public synchronized void trueZZnotifyAll() {
        zz = true;
        notifyAll();
    }

    public synchronized void falseZZnotifyAll() {
        zz = false;
        notifyAll();
    }

    public synchronized void falseZZwail() throws InterruptedException {
        while (zz == false)
            wait();
    }

    public synchronized void trueZZwail() throws InterruptedException {
        while (zz == true)
            wait();
    }


}
