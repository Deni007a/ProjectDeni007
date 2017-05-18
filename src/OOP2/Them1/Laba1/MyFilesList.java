package OOP2.Them1.Laba1;

import java.io.*;
import java.util.List;
import java.util.Arrays;

/**
 * Created by Den on 26.03.2017.
 */
public class MyFilesList {

    public static void main(String[] args)  throws Exception {
        String dirPath = "C://";
        File file = new File(dirPath);
        File[] arrFiles = file.listFiles();
        List<File> listFile = Arrays.asList(arrFiles);

        if (listFile.size()==0) System.out.println("директория   пустая");
        for (File s: listFile) {
            System.out.println(s);

        }


        String fileName = "222.txt";

    FileOutputStream fileOutputStream= new FileOutputStream(new File("222.txt"));
        System.out.println("******************************");
        for (File s: listFile) {

            //fileOutputStream.write(s.getCanonicalPath().getBytes());
            fileOutputStream.write(s.getAbsolutePath().getBytes());


        }


        fileOutputStream.flush();
        fileOutputStream.close();
    }


}
