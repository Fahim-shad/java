
import java.util.Scanner;

public class Dell {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char z = input.next().charAt(0);

        int asciiValue = (int) z;

        System.out.println("The ASCII value is: " + asciiValue);
    }
}