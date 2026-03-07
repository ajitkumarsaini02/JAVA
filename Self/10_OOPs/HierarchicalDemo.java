 // Hierarchical 
class Shape {
    public void display() {
        System.out.println("This is a Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        
        Triangle t = new Triangle();
        t.display();
        t.area(10, 20);

        System.out.println();

        Circle c = new Circle();
        c.display();
        c.area(7);
    }
}

