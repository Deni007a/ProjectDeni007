package OOP2.Them_8_Networking.Laba1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Den on 27.04.2017.
 */
class MyClient {
     void Client(String s) {

        String adress ="127.0.0.1";

        try {
            Socket socket = new Socket(adress,44500);
            //socket.connect(new InetSocketAddress(adress,44500));

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println(in.readLine());
            out.println(s);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
