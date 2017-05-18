package OOP2.Them_8_Networking.Laba5;

import sun.misc.IOUtils;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Den on 30.04.2017.
 */
public class Main {




    //Создайте новый проект под названием TestURLConnection.
    public static void main(String[] args) throws IOException {
        URL myUrl = new URL("http://lms.mainacad.com/");
        URLConnection myUrlCon = myUrl.openConnection();

        int c;
        System.out.println("Типа содержимого: "
                + myUrlCon.getContentType());
        long length;
        length = myUrlCon.getContentLengthLong();
        if(length == -1)
            System.out.println("Длина содержимого недоступна");
        else
            System.out.println("Длина содержимого: " + length);



        if(length != 0) {
            System.out.println(" Содержимое ");
            InputStream input = myUrlCon.getInputStream();
            while(((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно.");
        }

    }
}
