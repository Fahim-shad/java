import java.util.Scanner;

public class asciicount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String z = input.nextLine();
        int index = input.nextInt();

        if (index > 0 && index < z.length()) {
            char ch = z.charAt(index);
            int ascii = (int) ch;
            System.out.println("Character: " + ch);
            System.out.println("ASCII Value: " + ascii);
        } else {
            System.out.println("Error: Index out of bounds");
        }
    }
}
