package OOP2.Them_8_Networking.Laba1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Den on 27.04.2017.
 */
   class  MyServer  {

    public static void main(String[] args)

     {


     try {

         ServerSocket serverSocket = new ServerSocket(44500);
         System.out.println("start server");
         while (true) {
             Socket socket = serverSocket.accept();
             System.out.println("Conect client !!!!");


             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             out.println(" вы Подключились");

             String xxx = in.readLine();
             System.out.println(xxx);



         }


     } catch (IOException e1) {
         e1.printStackTrace();
     }

 }

}
