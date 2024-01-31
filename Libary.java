
import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private boolean checkedout=false;
    private boolean checkout;
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
   public boolean checkedOut() 
   {
    return checkout ;
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
    
  class Libary{

 public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Entered the title=");
    String title=input.nextLine();
    System.out.println("Entered the name=");
    String author=input.nextLine();
    Book myobj=new Book(title,author);
    System.out.println(myobj.getcheckedout());
    System.out.println(myobj.checkedout);
    myobj.returnbook();
}

}  
    
    
    
    
 }
    