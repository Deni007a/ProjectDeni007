package OOP.Them3.Laba1;

/**
 * Created by Den on 04.02.2017.
 */
public class MyWindow {

  private double width;
  private double height;
    private int numberOfGlass;
  private   String       color;
   private boolean     isOpen;


    MyWindow (double width){
        this.width=width;
    }

    MyWindow (double width, double height){
       this(width);
        this.height = height;
    }
    MyWindow (double width, double height,int numberOfGlass){
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }
    MyWindow (double width, double height,int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }
    MyWindow (double width, double height,int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass,color);
        this.isOpen = isOpen;
    }

   void printFields()
   {
       System.out.println(width);
       System.out.println(height);
       System.out.println(numberOfGlass);
       System.out.println(color);
       System.out.println(isOpen);

   }
    public static void main(String[] args) {
 MyWindow window = new MyWindow(11);
        window.printFields();
    }


}
