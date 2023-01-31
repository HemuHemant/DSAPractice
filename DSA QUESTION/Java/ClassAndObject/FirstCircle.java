class Circle {

    public double radius;
    
    public double area() {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return perimeter();
    }
}

public class FirstCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 14;
        double area = c1.area();
        System.out.println(area);
        double perimeter = c1.perimeter();
        System.out.println(perimeter);
        double circumference = c1.circumference();
        System.out.println(circumference);
    }
}