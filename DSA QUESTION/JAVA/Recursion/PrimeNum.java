import java.util.Scanner;

public class PrimeNum {
    static void voidCheckPrime(int num, int count) {
        if(count==num) {
            System.out.println("Prime Number");
            return;
        }
        else if(num%count==0) {
            System.out.println("Not Prime Number");
            return;
        }
        voidCheckPrime(num, count+1);
    }
    static boolean intCheckPrime(int num, int count) {
        if(count==num) {
            return true;
        }
        else if(num%count==0) {
            return false;
        }
        return intCheckPrime(num, count+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 2;
        sc.close();
        voidCheckPrime(num, count);
        boolean result = intCheckPrime(num, count);
        if(result==true) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    } 
}
