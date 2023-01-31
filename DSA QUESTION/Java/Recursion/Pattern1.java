import java.util.Scanner;

public class Pattern1 {

    static void printColumn(int column) {
        if(column==0) {
            return;
        }
        System.out.print("*");
        printColumn(column-1);
    }

    static void printRow(int row, int column) {
        if(row==0) {
            return;
        }
        printColumn(column);
        System.out.println();
        printRow(row-1, column);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        int column = row;
        printRow(row, column);
    }
}