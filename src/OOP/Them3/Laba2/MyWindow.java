package OOP.Them3.Laba2;

import java.awt.*;

/**
 * Created by Den on 04.02.2017.
 */
public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;


    MyWindow(double width) {
        this.width = width;
    }

    MyWindow(double width, double height) {
        this(width);
        this.height = height;
    }

    MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }

    MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass, color);
        this.isOpen = isOpen;
    }

    void printFields() {
        String allFields = width == 0 ? "" : " width " + width;
        allFields += height == 0 ? "" : "height " + height;
        allFields += numberOfGlass == 0 ? "" : "numberOfGlass " + numberOfGlass;
        allFields += color == null ? "" : "color " + color;
        allFields += isOpen ? " its OPEN" : "*";

    }

    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color +
                ", isOpen=" + isOpen +
                '}';
    }

}