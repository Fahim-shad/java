import java.util.Scanner;
public class price{

   public static void main(String[] args){
    System.out.println("Welcome to Dream Bazar");
    Scanner input = new Scanner(System.in);
    String name = input.next();
    System.out.println("Please enter ypur name = " + name);
    System.out.println("Hello" + name +"Hope you are doing well.Wlc to our shop.");
    Scanner in = new Scanner(System.in);
    System.out.print("How many product did you buy?");
    int number = in.nextInt();
    System.out.println(number);
    
    String[] productnames = new String[number];
    double[] productprices= new double[number];
    double totalprice=0.0;
    for(int i=0;i<number;i++){
     System.out.println("Name of product" + (i+1));
     in.nextLine();
     productnames[i]=in.nextLine();
     System.out.print("price of product" + (i+1));
     productprices[i]=in.nextDouble();
     totalprice +=productprices[i];
}

double vat = 0.075 * totalprice;
double totalamount = vat + totalprice;
System.out.print("\tInvoice");
System.out.print("customer Name" +name);
















   }



















}