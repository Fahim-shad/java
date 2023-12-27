import java.util.Scanner;

public class Data {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double radius = 6371.01;
        ; // Assuming a constant radius for simplicity
        double angle = radius*Math.acos(Math.sin(Math.toRadians(a)) * Math.sin(Math.toRadians(c)) + Math.cos(Math.toRadians(a)) *Math.cos(Math.toRadians(c)) *Math.cos(Math.toRadians(b-d)));

        System.out.println(angle);
    }
}