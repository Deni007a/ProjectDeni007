package OOP2.Them1.Laba3;

import java.io.*;

/**
 * Created by Den on 27.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        String inputfile ="222.txt";
        String outputfile ="333.txt";
        int zz=0;
        try {
            FileInputStream fileInputStream = new FileInputStream(inputfile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputfile);


             while ( fileInputStream.read()!=-1){
                 zz=fileInputStream.read();
                 fileOutputStream.write(zz);
             }

             fileInputStream.close();
             fileOutputStream.flush();
             fileOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ошибка ввода вывода");
        }




    }
}
