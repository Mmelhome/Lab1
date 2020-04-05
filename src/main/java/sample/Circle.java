package sample;

import java.util.ArrayList;

public class Circle implements Figure {
    private ArrayList<Dot> dots;
    private double radius;
    private double perimeter;

    public Circle(ArrayList<Dot> dots, double radius) {
        this.dots = dots;
        this.radius = radius;
    }

    /**
     * @return figure perimeter
     */
    public double getPerimeter() {
        checkInput();
        perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public boolean checkInput() {
        if (dots.size()!=1) throw new UnknownError();
        return true;
    }

    public double getSquare() {
        return 3.14 * radius * radius;
    }

    public double minX() {
        checkInput();
        return dots.get(0).getX() - radius;
    }

    public double maxX() {
        checkInput();
        return dots.get(0).getX() + radius;
    }

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}