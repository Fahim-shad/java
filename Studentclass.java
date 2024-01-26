
import java.util.Scanner;
class Student{
private String name;
private int roll;
private int totalmarks;

public void setValue(String x,int y)
{
   name=x;
   roll=y;
}
public void totalmarks()
{
    totalmarks=0;
   for(int i=0;i<4;i++)
   {
     Scanner input=new Scanner(System.in);
     int marks=input.nextInt();
    totalmarks+=marks;
   }

}
public String getname()
{
    return name;
}
public int getTotal()
{
   return totalmarks;
}

public int getroll()
{
    return roll;
}
class Studentclass{
public static void main(String[] args) {
    Student myobj=new Student();
    myobj.setValue("fahim",2142 );
    myobj.totalmarks();
    myobj.getname();
    myobj.getroll();
    myobj.getmarks();









}







}

















}
























