package OOP2.Them1.Laba4;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Den on 27.03.2017.
 */
//laba4.txt
public class Main {
    public static void main(String[] args)  {
        System.out.println("лаба 4");
       ArrayList<String> list = new ArrayList<>();
        //Iterator<String> iterator = list.iterator();//получение итератора для списка


        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String name = reader.readLine();
        String name = "L4.txt";



        System.out.println("имя файла "+name);
        String zz;
        String newstring="******";
        String oldstring="up";

        try {


            BufferedReader bufferedReader = new BufferedReader( new FileReader(name) );
            //FileInputStream fileInputStream = new FileInputStream(name);
           // FileOutputStream fileOutputStream = new FileOutputStream(name);

            while (bufferedReader.read()!=-1){
                zz=bufferedReader.readLine().replace(oldstring,newstring);
                list.add(zz);
            }
            /*
            for (String s: list) {
                System.out.println(s);
            }
            */
          bufferedReader.close();


            FileOutputStream fileOutputStream = new FileOutputStream(name);
            String zx ;
            Iterator<String> iterator = list.iterator();//получение итератора для списка

            while (iterator.hasNext())      //проверка, есть ли ещё элементы
            {
               fileOutputStream.write(iterator.next().getBytes());
            }




            //fileOutputStream.flush();
            //fileOutputStream.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ошибка ввода вывода");
        }





    }
}
