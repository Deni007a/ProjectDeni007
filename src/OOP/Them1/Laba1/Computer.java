package OOP.Them1.Laba1;

/**
 Lab Work 2-1-1
 Write Computer class, the attributes of this class is manufacturer (of String type), serialNumber (of int type),
 price (of float type), quantityCPU (of int type) and frequencyCPU (of int type).
 */
public class Computer {
    String manufacturer;
    int serialNumber;
    float price;
    int quantityCPU;
    int frequencyCPU;



    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.price = 100;
        System.out.println(comp.price);



    }
}
