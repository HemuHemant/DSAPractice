import java.util.Scanner;

public class Test {
    //using void 
    static void printNumber(int num) {
        if(num==0) {
            return;
        }
        printNumber(num-1);
        System.out.println(num);
    }
    //using int
    static int printNum(int num) {
        if(num>0) {
            printNum(num-1);
            System.out.println(num);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        printNumber(num); // call void function
        System.out.println();
        printNum(num); // call int function
    }
}