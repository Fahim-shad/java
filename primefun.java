import java.util.Scanner;
public class primefun {
    static void mymethod(int num){
        boolean prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0)
            {
                prime =false;
            }
        }
if(prime)
{
    System.out.println("prime number");
}
else{
    System.out.println("is not a prime number");
}
     

    }
    
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    mymethod(num);
}

































}
