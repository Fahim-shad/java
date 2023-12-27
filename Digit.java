import java.util.Scanner;

public class Digit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum is: " + sum);
    }
}