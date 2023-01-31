import java.util.Scanner;

public class PowerOfTwo {

    static void checkPowerOfTwo(int num, int power) {
        if(power==num) {
            System.out.println("true");
            return;
        }
        
        checkPowerOfTwo(num, power*2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPowerOfTwo(num, 2);
        // boolean result = checkPowerOfTwo(num);
        // System.out.println(result);
    }
}