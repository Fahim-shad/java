
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        double square=height*height;
        double d =  (weight /square )*703;

        System.out.println("Body Mass Index is: " + d);
    }
}