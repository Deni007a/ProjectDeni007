package OOP.Them5.Laba4;

/**
 * Created by Den on 07.02.2017.
 */
public class MuInit {

     static int arr[] = new  int [10];

 static    {
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) (100 * Math.random());
        }
    }
    void printArray(){
        for (int a:arr) {
            System.out.print(a+" ");

        }
        System.out.println();

    }
}
