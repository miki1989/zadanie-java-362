package MethodClasses;

import Figures2D.Line2D;

public class LineCalc {
    private Line2D line;

    public double lineLength(Line2D line){
        double distX = line.getX()-line.getX2();
        double distY = line.getY()-line.getY2();
        return Math.sqrt(distX*distX + distY*distY);
    }

    public double lineLength(Line2D a, Line2D b){
        double distanceX = b.getX()-a.getX();
        double distanceY = b.getY()-a.getY();
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
}

