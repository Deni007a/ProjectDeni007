package OOP.Them10.Laba3;

import java.util.StringTokenizer;

/**
 * Created by Den on 16.02.2017.
 */
public abstract class Share implements Drawable {


    private String shapeColor;



    public abstract double calcArea();

     static Share parseShare (String imputString ){
        StringTokenizer tokenizer = new StringTokenizer(imputString); // создаем токанизатор
        String[] tokkens = new String[tokenizer.countTokens()];
        for (int i = 0; i <tokkens.length ; i++) {
            tokkens[i] = tokenizer.nextToken();
        }
        switch (tokkens[0]){
            case  "Circle":
                return  new Circle(tokkens[1], Double.parseDouble(tokkens[2]));
            case  "Rectangle":
                return  new Rectangle(tokkens[1], Double.parseDouble(tokkens[2]), Double.parseDouble(tokkens[3]));
            case  "Triangle":
                return  new Triangle(tokkens[1], Double.parseDouble(tokkens[2]), Double.parseDouble(tokkens[3]),Double.parseDouble(tokkens[4]) );

            default: return   null;
        }
    }

    public Share(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public Share() {

    }

    public String getShapeColor() {
        return shapeColor;
    }


    @Override
    public String toString() {
        return "Share: " +
                "shapeColor=" + shapeColor;
    }
}
