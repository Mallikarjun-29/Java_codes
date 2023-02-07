import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int add = (a+b);
        System.out.println("The addition of " + a + " and " + b + " is " + add);
    }
}
