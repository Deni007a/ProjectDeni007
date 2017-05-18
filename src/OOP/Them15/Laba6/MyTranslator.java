package OOP.Them15.Laba6;

import java.util.HashMap;

/**
 * Created by Den on 11.03.2017.
 */
public class MyTranslator {

   private HashMap <String,String> hashMap = new HashMap<>();

     void addNewWord (String angl, String rus) {
        hashMap.put(angl,rus);

     }
     void  translate (String[] en){
         for ( String intern : en)
         {
             System.out.println(hashMap.get(intern));
         }
     }


}
