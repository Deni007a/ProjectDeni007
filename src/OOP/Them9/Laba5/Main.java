package OOP.Them9.Laba5;

/**
 * Created by Den on 21.02.2017.
 */
public class Main {
    static boolean checkPersonWithRegExp(String s){

        return s.matches("[A-Z]{1}[a-z]+");
    }

    public static void main(String[] args) {

        String[] strArr = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};

        for ( String b: strArr) {
            System.out.println(checkPersonWithRegExp(b));

        }

    }
}
