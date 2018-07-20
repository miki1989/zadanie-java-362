public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Rectangle rect1 = new Rectangle(10, 8);
        ShapeCalculator shape1 = new ShapeCalculator();
        System.out.printf("%.1f\n",shape1.CircleArea(circle1));
        System.out.printf("%.1f\n",shape1.CircleArea(10));
        System.out.printf("%.1f\n",shape1.rectangleArea(rect1));
        System.out.printf("%.1f",shape1.rectangleArea(5,7));

    }
}
