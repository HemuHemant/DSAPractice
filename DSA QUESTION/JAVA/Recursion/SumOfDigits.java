import java.util.Scanner;

public class SumOfDigits {
    static int intSumD(int num) {
        if(num==0) {
            return 0;
        }
        int digits = num%10;
        return digits+intSumD(num/10);
    }
    static void voidSumD(int num, int sum) {
        if(num==0) {
            System.out.println(sum);
            return;
        }
        int digits = num%10;
        voidSumD(num/10, sum+digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sc.close();
        voidSumD(num, sum);
        int result = intSumD(num);
        System.out.println(result);
    }
}