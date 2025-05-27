
    

public class RectanglePerimeter {
    double length;
    double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void displayPerimeter() {
        System.out.println("Rectangle Perimeter: " + calculatePerimeter());
    }
}
