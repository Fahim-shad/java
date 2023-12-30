import java.util.Scanner;

public class Reversenumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (num > 0) {
            int r = num % 10;
            System.out.print(r);
            num = num / 10;
        }
    }
}