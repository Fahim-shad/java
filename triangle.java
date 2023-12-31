import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    int side1 =input.nextInt();
    int side2 = input.nextInt();
    int side3=input.nextInt();

    if(side1==side2&&side2==side3)
    {
        System.out.println("equilateral");
    }
    else if(side1>(side2+side3))
    {   
        System.out.println("right angle triangle");
    }

    else{
        System.out.println("any other angle");
    }

    }
}