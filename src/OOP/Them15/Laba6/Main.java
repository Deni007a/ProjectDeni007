package OOP.Them15.Laba6;

import java.util.Scanner;

/**
 * Created by Den on 13.03.2017.
 */
public class Main {


    public static void main(String[] args) {

        MyTranslator myTranslator= new MyTranslator();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mous", "мыш");
        myTranslator.addNewWord("dog", "собака");

        Scanner scanner= new Scanner(System.in);
        String scan = scanner.nextLine();
        myTranslator.translate(scan.split(" "));
    }
}
