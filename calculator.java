import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num1 = input.nextInt();
int num2 = input.nextInt();
char operator =input.next().charAt(0);
if(operator=='+')
{
    System.out.println(num1+num2);
}
else if(operator=='-')
{
    System.out.println(num1-num2);
}
else if(operator=='*')
{
    System.out.println(num1*num2);
}
else if(operator=='/')
{
    System.out.println((double)num1/(double)num2);
}
else if(operator=='%')
{
   System.out.println(num1%num2);

}
else
{
    System.out.println("no result");
}












    }
}
