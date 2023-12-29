 
import java.util.Scanner;

public class equal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter four numbers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        if (num1== num2 || num1 ==num3||num1==num4||num2==num3||num3==num4||num2==num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}