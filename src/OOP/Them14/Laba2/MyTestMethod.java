package OOP.Them14.Laba2;

import java.util.ArrayList;

/**
 * Created by Den on 07.03.2017.
 */
public class MyTestMethod <T extends Comparable<T> > {
    private T [] arrT;
    protected T maxElem;



    public T getMaxElem() {
        return maxElem;
    }

    public void setMaxElem(T maxElem) {
        this.maxElem = maxElem;
    }

    public MyTestMethod(T[] arrT, T maxElem) {
        this.arrT = arrT;
        this.maxElem = maxElem;
    }

    public MyTestMethod() {
    }

    public static   <T extends Comparable<T>> void calcNum (T []arrT, T maxElem) {
      int count =0;
       for ( T inter: arrT) {
           if (inter.compareTo(maxElem)>0) { count++; }

       }
       System.out.println(count);


 }




}
