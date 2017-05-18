package OOP.Them7.Laba1_6;

/**
 * Created by Den on 15.02.2017.
 */
public  abstract class Device {
   private String manufacturer;
   private     float price;
   private    String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;

    }


    @Override
    public String toString() {
        return
                this.getClass().getSimpleName() + ///!!!!!!!!!!
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (!getManufacturer().equals(device.getManufacturer())) return false;

        return getSerialNumber().equals(device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = getManufacturer().hashCode();
        result = 31 * result + getSerialNumber().hashCode();
        return result;
    }
}
