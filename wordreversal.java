import java.util.Scanner;
public class wordreversal{
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    String w = input.nextLine();
    String rev="    ";
    for(int i=0;i<w.length();i++)
    {
       char ch=w.charAt(i);
       rev = ch;

    }

System.out.println("word reverce = " +rev);
















    }
}