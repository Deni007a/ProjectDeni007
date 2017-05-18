package OOP.Them17.Laba6;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Den on 21.03.2017.
 * 1) Перепишите DiningHall класса, так что после того, как метод makePizza() вызывается 10 раз
 * , метод servePizza() вызывается один раз каждый из 20 различных потоков.
 * 2) Вставьте синхронизации для устранения данных рас в вашем коде, если таковые существуют.
 * 3) описывают какие данные рас может произойти в многопоточном коде без синхронизации.
 * <p>
 * Подготовка Без специальной подготовки
 */
public class DiningHall  {
    static int pizzaNum;
    static  int  studentID = 1;

    public void makePizza() {
        pizzaNum++;
    }



    public void servePizza() {
        ExecutorService service = Executors.newFixedThreadPool(1);

        for (int i = 0; i <20 ; i++) {
        service.execute(new Runnable() {
            @Override
            public void run() {
                String result;
                if (pizzaNum > 0) {
                    result = "Served ";
                    pizzaNum--;
                } else result = "Сдох собака!!! ";
                System.out.println(result + studentID);
                studentID++;
            }
        }  );
        }


    }

    public static void main(String[] args) {
        /*
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) d.makePizza();
        //for (int i = 1; i <= 20; i++) d.servePizza();
        d.servePizza();
       // System.out.println(System.getenv());
      */

        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt());
        }



    }


}
