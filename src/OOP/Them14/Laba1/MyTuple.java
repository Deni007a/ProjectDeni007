package OOP.Them14.Laba1;

/**
 * Created by Den on 07.03.2017.
 */
public class MyTuple<A, B, C > {
    private  A tupeA;
    private  B tupeB;
    private  C tupeC;

    public A getTupeA() {
        return tupeA;
    }

    public void setTupeA(A tupeA) {
        this.tupeA = tupeA;
    }

    public B getTupeB() {
        return tupeB;
    }

    public void setTupeB(B tupeB) {
        this.tupeB = tupeB;
    }

    public C getTupeC() {
        return tupeC;
    }

    public void setTupeC(C tupeC) {
        this.tupeC = tupeC;
    }

    public MyTuple() {
    }

    public MyTuple(A tupeA, B tupeB, C tupeC) {
        this.tupeA = tupeA;
        this.tupeB = tupeB;
        this.tupeC = tupeC;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "tupeA=" + tupeA +
                ", tupeB=" + tupeB +
                ", tupeC=" + tupeC +
                '}';
    }

    public static void main(String[] args) {
        MyTuple<?,?,?> myTuple = new MyTuple<>(11,22,33);
        MyTuple myTuple12 = new MyTuple("aaa","ddd","ccc");
        System.out.println(myTuple);
        System.out.println(myTuple12);

    }
}
