import java.util.Scanner;
public class shakib{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String j = input.nextLine();
    String b=j.substring(0,Math.min(j.length(),13));
    System.out.println("short string ="+ b);
   
    }
}