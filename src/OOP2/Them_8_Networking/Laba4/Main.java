package OOP2.Them_8_Networking.Laba4;

import java.io.*;
import java.net.*;

/**
 * Created by Den on 10.05.2017.
 */
public class Main {


    static class MySender {
        String sent;


        void mySender() {

// читаем файл
            File myfile = new File("L4.txt");
            BufferedReader bufferedReader =
                    null;
            try {
                bufferedReader = new BufferedReader(new FileReader(myfile.getAbsoluteFile() ));
                System.out.println(myfile.getAbsoluteFile());
                while (bufferedReader.read() != -1) {
                   sent=bufferedReader.readLine();

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sent);

            try {
                // делаем дата ком сокет
                DatagramSocket datagramClietSoket = new DatagramSocket();
                String adress ="127.0.0.1";
                InetAddress inetAddress = null;
                inetAddress = InetAddress.getByName(adress);

               //sent = bufferedReader.readLine();
                //sent2="dddddd";
                //System.out.println(sent2);

                byte[] byteArr2 = sent.getBytes();


       DatagramPacket xxxxxx =
           new DatagramPacket(byteArr2, byteArr2.length, inetAddress, 45000);

datagramClietSoket.send(xxxxxx);

            } catch (SocketException e) {
                e.printStackTrace();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Laba5");
       // MyRecipient myRecipient = new MyRecipient();
       // myRecipient.Go();
MySender mySender = new MySender();
mySender.mySender();



    }
}
