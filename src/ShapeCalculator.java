public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    private Circle circle;
    private Rectangle rectangle;
    private Ball ball;
    private Cube cube;

    @Override
    public double CircleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
    public double CircleArea(double radius){
        return Math.PI* radius*radius;
    }
    @Override
    public double rectangleArea(Rectangle rectangle) {
        return 2*(rectangle.getWidth()+ rectangle.getLength());
    }
    public double rectangleArea(double width, double length){
        return 2*(width + length);
    }

    @Override
    public double ballVolume(Ball ball) {
        return Math.PI * Math.pow(ball.getRadius(),3);
    }
    public double ballVolume(double radius){
        return Math.PI * Math.pow(radius,3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(),3);
    }
    public double cubeVolume(double side){
        return Math.pow(side,3);
    }
}
