public abstract class GeometricShape extends Shape2D{

        public double shapeArea(Circle circle){
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        public double shapeArea(Rectangle rectangle){
            return 2*(rectangle.getWidth()+ rectangle.getLength());
        }
}
