import java.util.Scanner;
public class fibonaccifun{
     static void mymethod(int s,int f,int num){
        for(int i=3;i<=num;i++){
            int t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }

     }
















public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int  s=input.nextInt();
    int f=input.nextInt();
    int num=input.nextInt();
     mymethod(s,f,num);
    
}















}