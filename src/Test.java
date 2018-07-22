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
        /*System.out.printf("%.1f\n",shape1.CircleArea(circle1));
        System.out.printf("%.1f\n",shape1.CircleArea(10));
        System.out.printf("%.1f\n",shape1.rectangleArea(rect1));
        System.out.printf("%.1f\n",shape1.rectangleArea(5,7));
        System.out.printf("%.1f\n",shape1.ballVolume(ball1));
        System.out.printf("%.1f\n",shape1.ballVolume(15));
        System.out.printf("%.1f\n",shape1.cubeVolume(cube1));
        System.out.printf("%.1f\n",shape1.cubeVolume(20));
        System.out.printf("%.1f\n",shape1.lineLength(line1,line2));
        System.out.printf("%.1f\n",shape1.lineLength(line3));

        System.out.println();
        System.out.println();
        */
        System.out.printf("%.1f\n",shape1.shapeArea(circle1));
        System.out.printf("%.1f\n",shape1.shapeArea(rect1));
        System.out.printf("%.1f\n",shape1.volume(ball1));
        System.out.printf("%.1f\n",shape1.volume(cube1));
        Shape[] shaping = new Shape[5];
        shaping[0]= line3;
        shaping[1] = rect1;
        shaping[2] = circle1;
        shaping[3] = ball1;
        shaping[4] = cube1;
        System.out.println();

        for (int i = 0; i < shaping.length; i++) {
            if(shaping[i] instanceof Line2D){
                System.out.printf("Odcinek wyznaczony przez współrzędne [ %.1f ,%.1f] [%.1f,] ma długość %.2f\n",line3.getX(),line3.getY(),line3.getX2(), line3.getY2(), shape1.lineLength(line3));
            }
            if(shaping[i] instanceof Rectangle){
                System.out.printf("Prostokąt o długościach boków %.1f i %.1f ma pole które wynosi %.1f\n", rect1.getLength(), rect1.getWidth(), shape1.shapeArea(rect1));
            }
            if(shaping[i] instanceof Circle){
                System.out.printf("Koło o promieniu %.1f ma pole %.2f\n", circle1.getRadius(),shape1.shapeArea(circle1));
            }
            if(shaping[i] instanceof Ball){
                System.out.printf("Kula o promieniu %.1f ma objętość %.2f\n",ball1.getRadius(),shape1.volume(ball1));
            }
            if(shaping[i] instanceof Cube){
                System.out.printf("Sześcian o długości krawędzi %.1f ma objętość %.2f\n", cube1.getSide(),shape1.volume(cube1));
            }

        }





    }
}
