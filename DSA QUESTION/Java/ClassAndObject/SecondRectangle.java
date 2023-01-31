class Rectangle {

    int length;
    int breadth;

    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
    public boolean isSquare() {
        if(length==breadth) {
            return true;
        }
        return false;
    }
}

public class SecondRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 15;
        int area = r1.area();
        System.out.println(area);
        int perimeter = r1.perimeter();
        System.out.println(perimeter);
        boolean checkSquare = r1.isSquare();
        System.out.println(checkSquare);
    }
}
