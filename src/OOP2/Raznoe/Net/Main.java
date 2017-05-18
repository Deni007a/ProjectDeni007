package OOP2.Raznoe.Net;

import sun.misc.IOUtils;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by Den on 30.04.2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("NET");
        try  {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress
                    ("www.mainacad.com",80),5_000);
            System.out.println("сойдинение "+socket.isConnected());


            BufferedReader bufferedReader=
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter printWriter =
                    new PrintWriter(socket.getOutputStream(),true);



            Scanner s = new Scanner(socket.getInputStream()).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            System.out.println(result);

//
//                       Scanner scanner =new Scanner((socket.getInputStream()));
//            while (scanner.hasNext()){
//                String line = scanner.next();
//                System.out.println(line);
//            }


//            FileOutputStream fileOutputStream = new FileOutputStream("111.txt");
//            int zz = 0;
//            while ( socket.getInputStream().read()!=-1){
//                zz=socket.getInputStream().read();
//                fileOutputStream.write(zz);
//            }
//
//            fileOutputStream.flush();
//            fileOutputStream.close();



//
//            System.out.println("getInetAddress "+socket.getInetAddress());
//            System.out.println("getKeepAlive "+socket.getKeepAlive());
//            System.out.println("getChannel " +socket.getChannel());
//            System.out.println("getLocalPort "+socket.getLocalPort());
//            System.out.println("getLocalSocketAddress "+socket.getLocalSocketAddress());
//            System.out.println("getSoLinger "+socket.getSoLinger());
//            System.out.println("getSoTimeout "+socket.getSoTimeout());

        }
        catch (IOException o)
        {
            o.getStackTrace();};

    }
}
