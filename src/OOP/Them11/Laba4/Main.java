package OOP.Them11.Laba4;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Den on 16.02.2017.
 */
public class Main  {
    public static void main(String[] args)  throws IOException {
/*
 К ЧЕРТУ СКАНЕР!!!!!  БАФ РЕ6ЙДЕР РУЛИТ!!!!
 УВИДЛ СКАНЕР В КОДЕ  БЕЙ НОГАМИ
Share shape = Share.parseShare("Circle Blyu 1.0");
        */

try {


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    int arr_leg = Integer.parseInt(reader.readLine());
    Share[] arrShapes = new Share[arr_leg];

    for (int i = 0; i < arrShapes.length; i++) {

        arrShapes[i] = Share.parseShape(reader.readLine());

    }

    for (Share shape : arrShapes) {
        shape.draw();
    }

     System.out.println("длина  масива " + arrShapes.length);
     reader.close(); // закрываем



    throw new InvalidShapeStringException (15, " неправильная фигура");
}
catch ( InvalidShapeStringException ii){
    System.out.println("ошибку отловили");
}



        }



}
