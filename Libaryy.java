import java.util.Scanner;

class Book{
    private String title;
    private String author;
    boolean checkedout =false;
    
    Book(String x,String y)
    {
       title =x;
       author=y;
       
    }
    void display()
    {
        System.out.println(title+" "+author+" "+checkedout);
    }
    public boolean getcheckedout()
    {
      return checkedout;
    }
     void checkout()
    {
      if(!checkedout)
      {
        checkedout=true;
        System.out.println("yes book is checked");
      }
     else{
        System.out.println("not checked");
     
    }

} 

   void returnbook() 
   {
      if(checkedout)
      {
         checkedout=false;
         System.out.println("returned it");
      }
      else{
        System.out.println("not returned");
      }
   }
}
public class Libaryy
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Entered the title=");
        String title=input.nextLine();
        System.out.println("Entered the name=");
        String author=input.nextLine();
        Book myobj=new Book(title,author);
        myobj.display();
        System.out.println(myobj.getcheckedout());
        System.out.println(myobj.checkedout);
        myobj.returnbook();
    }
  }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
