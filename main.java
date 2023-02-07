import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        System.out.println("The largest common divisor of the two strings is: " + gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        if (str1.equals(str2)) {
            return str1;
        }
        if (!str1.startsWith(str2)) {
            return "";
        }
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}
