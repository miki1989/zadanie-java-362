public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    private Circle circle;
    private Rectangle rectangle;
    private Ball ball;
    private Cube cube;

    /*@Override
    public double CircleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
    public double CircleArea(double radius){
        return Math.PI* radius*radius;
    }
    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getWidth()* rectangle.getLength();
    }
    public double rectangleArea(double width, double length){
        return width * length;
    }

    @Override
    public double ballVolume(Ball ball) {
        return Math.PI * Math.pow(ball.getRadius(),3)/4;
    }
    public double ballVolume(double radius){
        return Math.PI * Math.pow(radius,3)/4;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(),3);
    }
    public double cubeVolume(double side){
        return Math.pow(side,3);
    }
    */
    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape instanceof Circle){
            return Math.PI * (((Circle) shape).getRadius()*((Circle) shape).getRadius());
        }
        else{
            return ((Rectangle) shape).getWidth()* ((Rectangle) shape).getLength();
        }
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape instanceof Cube){
            return Math.pow((((Cube) shape).getSide()),3 );
        }
        else{
            return Math.pow((((Ball) shape).getRadius()),3)*Math.PI/4;
        }
    }
    public String toString(){
        return " ";
    }
}
