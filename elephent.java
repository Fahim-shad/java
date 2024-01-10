import java.util.Scanner;
public class elephent{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
int x=input.nextInt();
if(x%5==0){
    System.out.println(x/5);
}
else{
    System.out.println(x/5 +1);
}

    }
}