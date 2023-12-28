import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Seconds = ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingMinutes = remainingSeconds % 60;

        System.out.println("Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + remainingMinutes);
    }
}