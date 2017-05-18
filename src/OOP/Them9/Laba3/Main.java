package OOP.Them9.Laba3;

/**
 * Created by Den on 21.02.2017.
 * Create a class Main with a main() method. Create static method: uniqueChars(String s), which must take a String as argument
 * and return an array of distinct (unique) chars (char[]) of the given string. In method main() add code to invoke uniqueChars()
 * method and pass string: “Using methods of class String” as argument. Print result to console.
 */
public class Main {

    static char[] uniqueChars(String str){

        int count = 0;
        char[] charArr=str.toCharArray();

        char[]newArr = new char[charArr.length];

        for (int i = 0; i<charArr.length; i++)
            for (int j = 0;j<charArr.length; j++){
                if (i==j) continue;
                else if (charArr[i] == charArr[j]) break;
                else if (j == charArr.length-1){
                    newArr[count] = charArr[i];
                    count ++;
                    break;
                }
            }
        return newArr;

    }

    public static void main(String[] args) {
        String st = "Using methods of class String";
        System.out.print(uniqueChars(st));
    }

}
