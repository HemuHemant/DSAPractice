import java.util.Scanner;

public class PowerOfNumber {
    static void voidPower(int base, int power, int result) {
        if (power == 0) {
            System.out.println(result);
            return;
        }
        result = result * base;
        voidPower(base, power - 1, result);
    }

    static int intfact(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * intfact(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        sc.close();
        int result = 1;
        voidPower(base, power, result);
        int fact = intfact(base, power);
        System.out.println(fact);

    }
}