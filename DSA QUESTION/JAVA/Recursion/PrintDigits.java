import java.util.Scanner;

public class PrintDigits {
    static void printdigitsRl(int num) {
        if (num == 0) {
            return;
        }
        int digits = num % 10;
        System.out.print("  " + digits);
        num = num / 10;
        printdigitsRl(num);
    }

    static void printdigitsLR(int num) {
        if (num == 0) {
            return;
        }
        int digits = num % 10;
        num = num / 10;
        printdigitsLR(num);
        System.out.print("  " + digits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("left=>right");
        printdigitsLR(num);
        System.out.println();
        System.out.println("right=>left");
        printdigitsRl(num);
    }
}
