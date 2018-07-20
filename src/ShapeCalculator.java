public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    private Circle circle;
    private Rectangle rectangle;
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
        return 0;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return 0;
    }
}
