package OOP2.Them1.Laba5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.*;

/**
 * Created by Den on 27.03.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("laba5");
        String namefile="L5.txt";
Map<String,Long> map = new HashMap<>();
        boolean sto = true;
        String boolString ="stop";
        String  readbufer;
        String  readbuferMod;

Long zz;
         RandomAccessFile randomAccessFile = new RandomAccessFile(namefile, "rw");

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

byte byteread;

                while (sto)
                {
                    readbufer=reader.readLine().trim();

                    if (readbufer.equals(boolString)) sto=false;
                    if (sto==false) break;
                    System.out.println("Читаем "+sto);

                       // randomAccessFile.writeUTF(readbufer+" "+0);

                        readbuferMod= readbufer+" "+0;

                        if (!map.containsKey(readbufer))   // фолс  если уже нету слова
                            {
                            System.out.println(map.containsKey(readbufer));
                            randomAccessFile.writeUTF(readbuferMod); // записываем
                                System.out.println(readbufer.length());
                            map.put(readbufer, randomAccessFile.getFilePointer()); // босаем ключь длину

                            }
                            else {     // если слово есть

                            zz= map.get(readbufer); //  берем ключь

                            System.out.println("Позиция "+zz);
                            /*
                            randomAccessFile.seek(zz=zz-(readbuferMod.length()+2));
                            randomAccessFile.writeUTF(readbufer+" "+"*");
                            randomAccessFile.seek(randomAccessFile.length());
                            */
                            randomAccessFile.seek(zz-1);
                            byteread= (byte) (randomAccessFile.readByte()+1);
                            if (byteread>=10) zz=zz-1;
                            randomAccessFile.seek(zz-1);
                            randomAccessFile.write(byteread);
                            randomAccessFile.seek(randomAccessFile.length());


                            }

                        }



                while (randomAccessFile.read()!=-1)
                {
                    System.out.println("читаем файл");
                    System.out.println( randomAccessFile.readLine() );

                }
                /*
        System.out.println("вывод карты");
        for (Map.Entry<String, Long> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Long value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);

        }
        */





randomAccessFile.close();

    }
}
