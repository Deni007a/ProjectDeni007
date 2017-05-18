package OOP.Them1.Laba2;

/**
 * Created by Den on 31.01.2017.
 * Компьютерный класс поля должны быть инкапсулированы. Добавить в компьютерный класс методы getters и setters.
 * Используйте правильный доступ модификаторы.
 */
public class Computer2 {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public  Computer2(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {

Computer2 comp = new Computer2(123);
        int serNamber = comp.getSerialNumber();


       System.out.println( serNamber);

    }
}
