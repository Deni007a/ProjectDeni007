package OOP.Them11.Laba4;

public abstract class Share implements Drawable {


    private String shapeColor;



    public abstract double calcArea();

    public static Share parseShape(String inputString) {
        String[] tokkens = inputString.split(" ");



        switch (tokkens[0]) {
            case "Circle":
                return Circle.parseCircle(tokkens);
            case "Rectangle":
                return Rectangle.parseRectangle(tokkens);
            case "Triangle":
                return Triangle.parseTriangle(tokkens);
            default:
               try {
                   throw new InvalidShapeStringException (15, " неправильная фигура***");
               }
                catch (InvalidShapeStringException e) {
                   e.printStackTrace();
               }
        }
        return new Circle("ddd",1);

    }
//throw new InvalidShapeStringException (15, " неправильная фигура");

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

