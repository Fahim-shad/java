import java.util.Scanner;
class ShoppingChart{
    private List[] carIteams;
    private int iteamCount;
    
ShoppingChart()
{
    carIteams=new List[10] ;
    iteamCount=0;

}
public void addproduct(String productname,double price,int quantity)
{
   if(10>iteamCount){
      List obj=new List(productname,price,quantity);
      carIteams[iteamCount++]=obj;
      System.out.println(obj.getProductName());

   }
   else{
         System.out.println("card full");
   }

}
public void updateQuantity(String productname,int newquantity)
{
   for(int i=0;i<iteamCount;i++)
   {

      if(carIteams[i].getProductName().equals(productname)){
        carIteams[i].updateQuantity(newquantity);
          System.out.println("update done");
      }

       else{
              System.out.println("not product");
       }

   }

}
public void CalculateTotalCost()
{
  double totalcost=0;
  













}


























}



