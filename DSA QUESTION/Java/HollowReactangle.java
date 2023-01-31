import java.util.Scanner;

public class HollowReactangle {

    static void printPattern(int row) {
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if(i==j || i+j==row+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        input.close();
        printPattern(row);
    }

}
