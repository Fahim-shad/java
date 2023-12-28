import java.util.Scanner;
public class commondigit {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("input the 1st number :");
    int num1 =input.nextInt();
    System.out.print("input the 2nd number :");
    int num2 =input.nextInt();
    int a =num1%10;
    int b= num1/10;
    int c = num2%10;
    int d= num2/10;
    if(a==c||a==d||a==b||b==d)
    {
        System.out.println("result = true");
    }

        











    }
}
