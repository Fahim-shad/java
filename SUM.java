import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        int result = num1 + num2 ;
        if(result==num3)
        {
            System.out.println("The result is = " + "True");
        }
        else
        {
            System.out.println("The result is = " + "False");
        }












    
    }
}