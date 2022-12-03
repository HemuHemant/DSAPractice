import java.util.Scanner;

public class ProductOfDigits {
    static int intProductD(int num) {
        if(num==0) {
            return 1;
        }
        int digits = num%10;
        int product = digits*intProductD(num/10);
        return product;
    }
    static void voidProductD(int num, int product) {
        if(num==0) {
            System.out.println(product);
            return;
        }
        int digits = num%10;
        voidProductD(num/10, product*digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        sc.close();
        voidProductD(num, product);
        int result = intProductD(num);
        System.out.println(result);
    }
}