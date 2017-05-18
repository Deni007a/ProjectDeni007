package OOP.Them8.Laba2;

/**
 * Created by Den on 16.02.2017.
 */
public abstract class Share implements Drawable {


    private String shapeColor;



    public abstract double calcArea();

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
