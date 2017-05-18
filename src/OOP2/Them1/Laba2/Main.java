package OOP2.Them1.Laba2;

import java.io.*;

/**
 * Created by Den on 26.03.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("OOP/Them17/Laba2");
        String  fileName = "111.txt";

        String line = null;

        try {


            BufferedReader bufferedReader = new BufferedReader( new FileReader(fileName) );

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }

        catch(IOException ex) {
            System.out.println(
                    "Ошибка чтения'"
                            + fileName + "'");

        }
    }
}


