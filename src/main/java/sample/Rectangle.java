package sample;

import java.util.ArrayList;

public class Rectangle implements Figure{
    ArrayList<Dot> dots;
    double perimeter;

    public Rectangle(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    public double getPerimeter() {
        checkInput();
        perimeter = Math.sqrt(Math.pow(dots.get(0).getX()-dots.get(1).getX(), 2) + Math.pow(dots.get(0).getY()-dots.get(1).getY(), 2)) + Math.sqrt(Math.pow(dots.get(1).getX()-dots.get(2).getX(), 2) + Math.pow(dots.get(1).getY()-dots.get(2).getY(), 2)) + Math.sqrt(Math.pow(dots.get(2).getX()-dots.get(3).getX(), 2) + Math.pow(dots.get(2).getY()-dots.get(3).getY(), 2)) + Math.sqrt(Math.pow(dots.get(3).getX()-dots.get(0).getX(), 2) + Math.pow(dots.get(3).getY()-dots.get(0).getY(), 2));
        return perimeter;
    }

    public boolean checkInput() {
        if (dots.size()!=4) throw new UnknownError();
        return true;
    }

    public double getSquare(){
        checkInput();
        return Math.abs((dots.get(0).getX() - dots.get(2).getX())*(dots.get(1).getY() - dots.get(2).getY()) - (dots.get(1).getX() - dots.get(2).getX())*(dots.get(0).getY() - dots.get(2).getY()));
    }

    public double minX() {
        checkInput();
        return Math.min(Math.min(dots.get(0).getX(), dots.get(1).getX()), Math.min(dots.get(2).getX(), dots.get(3).getX()));
    }

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }
}

