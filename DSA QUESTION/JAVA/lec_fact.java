import java.util.Scanner;

public class lec_fact {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;//1*1=>1
            //fact=1*2;=>2
            //fact=2*3;=>6
        }
        System.out.println("Factorial is =>"+fact);
    }
}
