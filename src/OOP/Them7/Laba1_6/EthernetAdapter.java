package OOP.Them7.Laba1_6;

/**
 * Created by Den on 15.02.2017.
 */
public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString()+" EthernetAdapter: " +
                "speed=" + speed +
                ", mac='" + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac() != null ? getMac().equals(that.getMac()) : that.getMac() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + (getMac() != null ? getMac().hashCode() : 0);
        return result;
    }
}
