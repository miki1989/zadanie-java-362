package Figures2D;

import AbstractClasse.Shape2D;

public class Line2D extends Shape2D {
    private double x;
    private double y;

    private double x2;
    private double y2;

    public Line2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Line2D(double x, double y, double x2, double y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

   /* @Override
    public String toString(Figures2D.Line2D line) {
        super.toString();
        return "Odcinek wyznaczony przez współrzędne [" + line.getX() + "," +
                line.getY()+"] ["+line.getX2()+"," + line.getY2()+"] ma długość ";
    }
    */
}
