import java.util.Scanner;

public class Factorial {
    static void voidfact(int num, int product) {
        if(num==0) {
            System.out.println(product);
            return;
        }
        product = product*num;
        voidfact(num-1, product);

    }
    static int intfact(int num) {
        if(num==0) {
            return 1;
        }
        return num*intfact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int product = 1;
        voidfact(num, product);
        int result = intfact(num);
        System.out.println(result);
    }
}