
class CAR{
	private String model;
	private int year;
	private double rentalprice;
	private boolean available=true;
	CAR(String x,int y,double z)
	{
		model=x;
		year=y;
		rentalprice=z;
	}
void display()
{
	System.out.println( "Entered the model name=" +model );
    System.out.println( "Entered the model year=" +year );
	System.out.println( "Entered the RentalPrice=" +rentalprice );

}

		public String getModel()
		{  
		   return model;
		}
		public int getYear()
		{
			return year;
	    }
		public double getrentalprice()
		{ 
		  return rentalprice;
		}
		public boolean isAvailable()
		{
            return available;
        }
        public void rentCar(){

        if(available==false)
        {
           System.out.println("not rented");
           

        }
        else{
            System.out.println("car is already rented");
        }

        }
        public void returncar()
        {
           if(available==false){
           System.out.println(" the car returned");
          available=true;

           }
        else{
            System.out.println("the car is availavle");
        }

        }

    }






























