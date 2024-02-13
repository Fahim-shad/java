class RentalSystem{
private CAR[] car;
private int count=0;

RentalSystem(){
    car=new CAR[10];
}
public void addCar(String x , int y, double z){
car[count]=new CAR(x,y,z);
count++;
System.out.println(car[count].getModel());

}
public void displayAvailablecars(){

for(int i=0;i<=count;i++){

if(car[i].isAvailable()==true)
{
    System.out.println("AVAILABLE");
}

}

}
public void rentCar(String x)
{
  for(int i=0;i<=count;i++){
  if(car[i].getModel().equals(x)){
     car[i].rentCar();
     System.out.println("yes rented");

  }

  }

}
public void returncar(String x)
{
  for(int i=0;i<=count;i++){

  if(car[i].getModel().equals(x)){
     car[i].returncar();
     System.out.println("car returned");

  }
  }

}
















}