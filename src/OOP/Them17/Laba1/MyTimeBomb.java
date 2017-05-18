package OOP.Them17.Laba1;



/**
 * Created by Den on 16.03.2017.
 */
public class MyTimeBomb extends Thread{
 static Integer i =0;
   static  void inkr (){

      i++;
   }

    public void run() {
        for (int i = 0; i <10_000 ; i++) {

inkr();

        }
       // System.out.println("BOM!!");
        System.out.println("zjro "+i);
    }


}
