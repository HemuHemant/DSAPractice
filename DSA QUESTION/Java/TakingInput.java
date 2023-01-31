import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.close();
        System.out.println("Hello "+name);
        System.out.println("Your are "+age+" years old");
    }
}
