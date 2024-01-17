import java.util.Scanner;
public class Factorialfun {
    static void mymethod(int num){
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial *=i;
        }
      System.out.println(factorial);
    }


public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    mymethod(num);
    
}














}
