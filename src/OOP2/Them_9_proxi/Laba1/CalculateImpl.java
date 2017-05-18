package OOP2.Them_9_proxi.Laba1;

/**
 * Created by den on 27.04.17.
 */
public class CalculateImpl implements  Calculate {


    @Override
    public int multiplication(int a, int b) {


        return a/b;
    }

    @Override
    public int division(int a, int b) {

        return a*b;
    }
}
