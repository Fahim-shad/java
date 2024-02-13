import java.util.Scanner;
class List{
private String productname;
private double price;
private int  quantity;
List(String a,double b,int c)
{
   productname=a;
   price=b;
   quantity=c;

}
public String getProductName()
{
   return productname;
}
public double getPrice()
{
   return price;
}
public int getQuantity()
{
   return quantity;
}
public void updateQuantity(int newquantity)
{

if(newquantity>=0)
{
   quantity=newquantity;
}
else{
   System.out.println("invalid");


}

}

}