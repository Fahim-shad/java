import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   int num=input.nextInt();
   int f=1,s=1,t;
   System.out.println(f);
   System.out.println(s);
   for(int i=3;i<=num;i++)
   {

     t=f+s;
     System.out.println(t);
     f=s;
     s=t;




   }













    }
}
