package OOP.Them10.Laba2;

/**
 * Created by Den on 21.02.2017.
 */
public class Main {
    static Long compute(Byte b, Integer i) {

        Long zz = Byte.toUnsignedLong(b)+Integer.toUnsignedLong(i);

        return zz;
    }

    public static void main(String[] args) {
        System.out.println(compute( (byte)8,125));


    }
}
