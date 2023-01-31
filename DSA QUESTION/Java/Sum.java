import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        sc.close();
        int sum = firstNum+secondNum;
        System.out.println("Sum = "+sum);
    }
}
