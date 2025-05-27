class Rectangle {
    
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

public class rec_ar {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.5, 5.0);
        rect.displayArea();
    }
}

