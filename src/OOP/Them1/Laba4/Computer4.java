package OOP.Them1.Laba4;

import java.util.Arrays;

/**
 * Created by Den on 02.02.2017.
 * Напишите программу, которая итерации массив объектов компьютеров и увеличивается на 10 процентов поля Цена.
 */
public class Computer4 {

         private float price=100;

    public float getPrice() {
        return price;
    }
    public void setPrice (float price){
        this.price=price;
    }

        public static void main(String[] args) {

            Computer4 [] arr = new Computer4[10];
            float zz=0;
            for (int i = 0; i < 10; i++) {


                arr[i] = new  Computer4();

              zz=zz/100*10+arr[i].getPrice();
                arr[i].setPrice(zz);

            }

            for ( Computer4 a : arr) {
                System.out.println(a.getPrice());

            }

        }

    }
