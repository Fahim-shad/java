import java.util.Scanner;
public class reverce{
public static void main (String[] args){

Scanner input =new Scanner(System.in);
String sentence =input.nextLine();
String rev = " ";
for(int i =0;i<sentence.length();i++)
{
  char ch =sentence.charAt(i);
  rev= ch+rev;


}

System.out.println("Reverce string = " + rev);



















}














}
