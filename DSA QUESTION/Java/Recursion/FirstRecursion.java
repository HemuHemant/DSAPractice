import java.util.Scanner;

public class FirstRecursion {
    static void Print(int count) {
        if (count==0) {
            return;
        }
        // At the time of calling function value is printed in descending order
        System.out.println(count);

        Print(count-1);
        
        // At the time of returning function value is printed in ascending order
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Print(num);
    }
}