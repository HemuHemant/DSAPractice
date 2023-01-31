import java.util.Scanner;

public class Pattern7 {
    
    static void printSpace(int space) {
        if(space==0) {
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printStar(int star) {
        if(star==0) {
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printPattern(int row, int column) {
        if(row==0) {
            return;
        }
        printSpace(row);
        printStar(2*column-1);
        System.out.println();
        printPattern(row-1, column+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        printPattern(row, 1);
    }
}
