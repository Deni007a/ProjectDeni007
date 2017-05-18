package OOP.Them4.Laba2;

/**
 * Created by Den on 04.02.2017.
 */
public class MyMath {

    static int  findMax (int[] arr)
    {
        int max=  arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max <arr[i])   max= arr[i];
        }
        return max;
    }
    static int  findMin (int [] arr)
    {
        int min=  arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min >arr[i])   min= arr[i];
        }
        return min;
    }


}
