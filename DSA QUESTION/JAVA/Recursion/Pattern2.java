import java.util.Scanner;

public class Pattern2 {

    static void printColumn(int column) {
        if(column==0) {
            return;
        }
        System.out.print("*");
        printColumn(column-1);
    }
    static void printTriangle(int row) {
        if(row==0) {
            return;
        }
        printColumn(row);
        System.out.println();
        printTriangle(row-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        printTriangle(row);
    }
}
