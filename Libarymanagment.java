import java.util.Scanner;
class Book{
 private String title;
 private String author;
 private boolean checkedout=false;
 Book(String x,String y)
 {
   title=x;
   author=y;
 }
void display()
{
    System.out.println(title+""+author+""+checkedout);
}
public String gettitle()
{
    return title;
}
public String getauthor()
{
    return author;
}
public boolean getcheckedout()
{
    return checkedout;
}
public void check()
{

   if(checkedout ==true)
   {

     System.out.println("book already chekedout");
     checkedout=true;
   }
  else{
    System.out.println("not checked out");
  }

}
public void returnbook()
{
   if(checkedout==true)
   {
     System.out.println("booked returned");
     checkedout=false;
   }

else{
    System.out.println("book available");
}
}
}

public class Libarymanagment{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("entered title =");
    String title=input.nextLine();
    System.out.println("entered author name =");
    String author=input.nextLine();

    Book myobj=new Book(title,author);
    myobj.display();
    System.out.println(myobj.gettitle());
    System.out.println(myobj.getauthor());
    System.out.println(myobj.getcheckedout());
    myobj.check();
    myobj.returnbook();



}

}


