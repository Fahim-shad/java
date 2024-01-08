import java.util.Scanner;
public class game{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
String name1=input.next();
String name2=input.next();
String move1=input.next();
String move2=input.next();

if((move1.equals("R")&&move2.equals("S"))||(move1.equals("S")&&move2.equals("P"))||(move1.equals("P")&&move2.equals("R")))
{
    System.out.println(name1+"wins");
}
else{
    System.out.println(name2 +"wins");
}
    





































    }
}
