package OOP.Them17.Laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Den on 03.04.2017.
 * 1) создать программу для вычисления суммы всех элементов массива
 * (1000000 целочисленных элементов, значения которых генерируются случайным образом
 * форме 0-100), с помощью ForkJoin framework.
 * 2) создать RecursiveTask для разделения массива на две части и назначить другой
 * RecursiveTask каждой части для дальнейшего разделения. Продолжать такое разделение,
 * массив и остановки деления когда массив содержит менее 20 элементов.
 */
public class Main {
    final static int CORE = Runtime.getRuntime().availableProcessors();
    final static int NUMMopp = 1;

    //******************************************
    static class MyFork extends RecursiveTask<Integer> {
        int start, end;

        public MyFork(int start, int end) {
            this.start = start;
            this.end = end;

        }


        @Override
        protected Integer compute() {
            Integer sum = 0;

            if (this.end - this.start < CORE) {
                /*
                List<Integer> list = new ArrayList<>();
                sum = 0;

                for (int i = 0; i < 100; i++) {
                    //list.add((int)(1+Math.random()*100));
                    list.add(i);
                    sum += 1;
                    */
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    //list.add((int)(1+Math.random()*100));
                    list.add(i);
                    sum += 1;




                recursia(list);

                }
            } else {
                int split = (this.start + this.end) / 2;
                MyFork myFork1 = new MyFork(this.start, split);
                MyFork myFork2 = new MyFork(split, this.end);
                ////
                invokeAll(myFork1, myFork2);
                sum += myFork1.join();
                sum += myFork2.join();

            }
            return sum;
        }

    }
    static int namberArr_fist = 0; // первый элемент
    static int namberArr_last = 0; // последний элемент

    static void recursia(List<Integer> list) {
        if (list.size() > namberArr_last & (list.size()-namberArr_last)>=20) {
            namberArr_last +=20;

            System.out.println("*"+new ArrayList<Integer>(list.subList(namberArr_fist, namberArr_last)) );

         new ArrayList<Integer>(list.subList(namberArr_fist, namberArr_last));
         namberArr_fist+=20;

        }
        else {
            if (list.size() == namberArr_last)  return;
            System.out.println("**"+new ArrayList<Integer>(list.subList(namberArr_last, (list.size()))));
            new ArrayList<Integer>(list.subList(namberArr_last, (list.size())));
            namberArr_last=namberArr_last+(list.size()-namberArr_last);

        }


        recursia(list);


    }


    public static void main(String[] args) {

        System.out.println("лаба 18");

        ForkJoinPool forkJoinPool = new ForkJoinPool(CORE);

        System.out.println(forkJoinPool.invoke(new MyFork(0, CORE)));


//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 101; i++) {
//            //list.add((int)(1+Math.random()*100));
//            list.add(i);
//        }
//        recursia(list);




    }


}



