import java.util.Scanner;
public class Weird {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num =input.nextInt();
    if(num%2!=0)
    {
        System.out.println("weird");
    }

    if(num%2==0 && num>2 && num<5)
    {
        System.out.println("not weird");
    }
    if(num%2==0 && num>6 && num<20)
    {
        System.out.println("weird");
    }
    if(num%2==0 && num>20)
    {
        System.out.println("not weired");
    }
















    }
}
