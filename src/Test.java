public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Rectangle rect1 = new Rectangle(10, 8);
        Ball ball1 = new Ball(10);
        Cube cube1 = new Cube(10);
        Line2D line1 = new Line2D(5,2 );
        Line2D line2 = new Line2D(-2,-8 );
        Line2D line3 = new Line2D(2,2 ,5 ,4 );
        ShapeCalculator shape1 = new ShapeCalculator();
        System.out.printf("%.1f\n",shape1.CircleArea(circle1));
        System.out.printf("%.1f\n",shape1.CircleArea(10));
        System.out.printf("%.1f\n",shape1.rectangleArea(rect1));
        System.out.printf("%.1f\n",shape1.rectangleArea(5,7));
        System.out.printf("%.1f\n",shape1.ballVolume(ball1));
        System.out.printf("%.1f\n",shape1.ballVolume(15));
        System.out.printf("%.1f\n",shape1.cubeVolume(cube1));
        System.out.printf("%.1f\n",shape1.cubeVolume(20));
        System.out.printf("%.1f\n",shape1.lineLength(line1,line2));
        System.out.printf("%.1f\n",shape1.lineLength(line3));


    }
}
