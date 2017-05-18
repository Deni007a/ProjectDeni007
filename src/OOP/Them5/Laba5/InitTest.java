package OOP.Them5.Laba5;

/**
 * Created by Den on 07.02.2017.
 */
public class InitTest {
    private   int id ;
    private static  int nextId = (int) (1000 * Math.random());

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    InitTest(){
        nextId++;
        id= nextId;

    }

}
