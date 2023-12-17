public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 3, 4);

        Shape[] shapes = {circle, rectangle, square, triangle};

        for (Shape shape: shapes) {
            System.out.println("Это фигура " + shape.getClass().getSimpleName());
            System.out.println("Eё периметр равен: " + shape.calculatePerimeter());
            System.out.println("Её площадь равна: " + shape.calculateArea() + "\n");
        }
    }
}
