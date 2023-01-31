import java.util.Scanner;

public class ArmStrong {
    static void voidArmStrong(int num, int sum, int temp) {
        if(num==0) {
            if(sum==temp) {
                System.out.println("Armstorng Number");
            }
            else {
                System.out.println("Not Armstrong Number");
            }
            return;
        }
        int digits = num%10;
        digits = digits*digits*digits;
        voidArmStrong(num/10, sum+digits, temp);
    }

    static boolean isArmstrong(int num, int sum, int temp) {
        if(num==0) {
            if(sum==temp) {
                return true;
            }
            else {
                return false;
            }
        }
        int digits = num%10;
        sum = digits*digits*digits;
        return isArmstrong(num/10, sum+digits, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int sum = 0;
        voidArmStrong(num, sum, temp);
        boolean result = isArmstrong(num, sum, temp);
        System.out.println(result);
        if(result==true) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstorng Number");
        }
    }
}
