package OOP.Them1.Laba5;
/*

 */

public class Comuter5 {
    private static String manufacturer;
    private static  int serialNumber;
    private static float price;
    private static  int quantityCPU;
    private static  int frequencyCPU;


    public Comuter5(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;

    }

    public Comuter5() {
    }

    public static void main(String[] args) {

        Comuter5 comp = new Comuter5("IBM", 11111, 500.0f, 3600, 2000);
    }

    public static void vien() {
        System.out.println(manufacturer +1);


    }
}
