import java.util.Scanner;

public class Pattern6 {
    
    static void printStar(int star) {
        if(star==0) {
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    
    static void printSpace(int space) {
        if(space==0) {
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    } 

    static void printPattern(int row, int column) {
        if(row==0) {
            return;
        }
        printSpace(column);
        printStar(2*row-1);
        System.out.println();
        printPattern(row-1, column+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        printPattern(row, 0);
    }
}
