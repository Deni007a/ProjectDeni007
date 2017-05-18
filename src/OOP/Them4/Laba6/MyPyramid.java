package OOP.Them4.Laba6;

/**
 * Created by Den on 07.02.2017.
 */
public class MyPyramid {
    static public void printPyramid(int x) {
        int zz;

        for (int i = 1; i <= x; i++) {
            zz = x - i;   // вычисляем количество пробелов
            for (int j = 0; j <zz ; j++) { //  цикл для пробелов
                System.out.print(" ");
            }
            for (int j = zz; j <x ; j++) { //  цикл от 1 до Х

                System.out.print(j-zz+1);

            }
            for (int jj = 1; jj < i; jj++) {  // цикл от Х до  еденицы
                System.out.print(i-jj);

            }
            System.out.println();

        }
    }



    public static void main(String[] args) {

        printPyramid(8);


    }
}
