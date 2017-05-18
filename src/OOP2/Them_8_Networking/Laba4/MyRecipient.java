package OOP2.Them_8_Networking.Laba4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Den on 10.05.2017.
 */
public class MyRecipient {

    public static void main(String[] args) {


        try {
            DatagramSocket serversoked = new DatagramSocket(45000);
            byte[] arrbate = new byte[1024];
            while (true) {
                System.out.println("server start");

                DatagramPacket datagramPacket = new DatagramPacket(arrbate, arrbate.length);


                serversoked.receive(datagramPacket);

                String ssss = new String(datagramPacket.getData());

                System.out.println( ssss);


            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
