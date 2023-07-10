class Shape {
    int area;
    public Shape() {
        area = 0;
    }
    public Shape(int side) {
        area = side * side;
    }
    public Shape(int length, int breadth) {
        area = length * breadth;
    }
    public Shape(Shape shape) {
        area = shape.area;
    }
    public void display() {
        System.out.println("Area: " + area);
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape square = new Shape(5);
        Shape rectangle = new Shape(4, 6);
        Shape copySquare = new Shape(square);

        square.display();
        rectangle.display();
        copySquare.display();
    }
}
