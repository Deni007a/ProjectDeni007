package OOP.Them18.Laba4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Den on 26.03.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String readLin ;
        String boolString ="stop";
        boolean sto = true;


        while (sto)
        {
            readLin=bufferedReader.readLine();
            if (readLin.equals(boolString)) sto=false;
            if (sto==false) break;
            System.out.println("*"+sto);
            list.add(readLin);

        }


        //list.add("c:\\Windows\\notepad.exe");
       // list.add("c:\\Windows\\regedit.exe");
       // list.add("c:\\Windows\\explorer.exe");


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }


        int xx = (int)(Math.random()*list.size());
        System.out.println(xx);

        Runtime runtime =Runtime.getRuntime();
         runtime.exec(list.get(xx));


    }
}