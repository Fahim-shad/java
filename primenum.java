import java.util.Scanner;
public class primenum{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int num = input.nextInt();
  boolean prime=true;
  for(int i=2;i<num;i++)
  {
      if(num%i==0)
      {
        prime=false;
      }

      


  }


    if(prime)
    {
        System.out.println("prime number");
    }

  else{
     System.out.println("not a prime number");
  }
















  }

















}









































