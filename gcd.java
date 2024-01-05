import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a =input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
int g=0;
for(int i=1;i<=a;i++)
{
    if(a%i==0&&b%i==0&&c%i==0){

          g=i;




    }
}

System.out.println(g);







    }
}
