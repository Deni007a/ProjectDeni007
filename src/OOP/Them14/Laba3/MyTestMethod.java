package OOP.Them14.Laba3;

/**
 * Created by Den on 07.03.2017.
 */
public class MyTestMethod<T extends Integer > {
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

    public static   <T extends Integer > void calcNum (T []arrT, T maxElem) {
        int count = 0;
        Double countSum = Double.valueOf(0);

        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i].compareTo(maxElem) > 0) {
                count++;
                countSum = countSum.doubleValue() + arrT[i].doubleValue();

            }






        }
        System.out.println(count);
        System.out.println(countSum);

    }

}
