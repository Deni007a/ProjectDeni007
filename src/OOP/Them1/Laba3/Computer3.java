package OOP.Them1.Laba3;

import java.util.Arrays;

/**
 * Created by Den on 02.02.2017.
 * Напишите программу для создания массива объектов компьютеров (5 шт.). Объявите массив объектов компьютеров (5 шт.),
 * создание 5 объектов компьютеров и поместите его в массив (с помощью цикла).
 */
public class Computer3 {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;



    private int frequencyCPU;
    
    
    public static void main(String[] args) {
        Computer3 [] arr = new Computer3[5];

        for (int i = 0; i < 5; i++) {

            arr[i] = new  Computer3();
            System.out.println( "ИМЯ:/n"+ arr[i].toString());
        }
        System.out.println(Arrays.toString(arr));
    }
}
