import java.util.Scanner;
public class CarRentalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model=input.nextLine();
        int year=input.nextInt();
        double rentalprice=input.nextDouble();
        CAR myobj=new CAR(model,year,rentalprice);
        myobj.display();
        
        
        myobj.isAvailable();
        myobj.rentCar();
        myobj.returncar();













    }
    




















}
