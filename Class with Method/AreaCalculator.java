public class AreaCalculator {
    public static void main(String[] args) {
        int side = 5;
        int length = 4;
        int breadth = 6;

        int squareArea = calculateArea(side);
        System.out.println("Area of square: " + squareArea);

        int rectangleArea = calculateArea(length, breadth);
        System.out.println("Area of rectangle: " + rectangleArea);
    }

    public static int calculateArea(int side) {
        return side * side;
    }

    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}
