package OOP.Them14.Laba4;

/**
 * Created by Den on 07.03.2017.
 */
public class MyMixer <T extends  Number>{
      private  T [] arrT;


    public MyMixer() {
    }

    void shuffle( T [] arrT)
    {
        for (int i = 0; i <arrT.length ; i++) {
             if ( i%2==0 ) {
                 System.out.println(arrT[i+1]);
             }
             else System.out.println(arrT[i-1]);



        }

    }

    public static void main(String[] args) {
        Integer [] intArr = {1,2,3,4,5,6,7,8,9,10};
        Double [] intArr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};

       MyMixer<Integer> myMixer= new MyMixer<Integer>();
       myMixer.shuffle(intArr);
       new MyMixer<Double>().shuffle(intArr2);
    }




}
