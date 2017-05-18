package OOP.Them4.Laba2;

/**
 * Created by Den on 04.02.2017.
 */
public class Calculation {
int[] arr1 ={3,5,7,15,22,-10};
int [] arr2 ={-15,55,-200,500,5};
    public static void main(String[] args) {
        Calculation calcul = new Calculation();
        System.out.println  (MyMath.findMax(calcul.arr1));
        System.out.println  (MyMath.findMin(calcul.arr1));
        System.out.println  (MyMath.findMax(calcul.arr2));
        System.out.println  (MyMath.findMin(calcul.arr2));



    }


}

