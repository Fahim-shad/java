import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int c = num;
        int s = 0;

        while (num > 0) {
            int digit = num % 10;
            s =( s * 10 ) + digit;
            num = num / 10;
        }

        if (c== s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}