import java.util.Scanner;
public class maxminfun{
    static void mymethod(int[] num){
        int max=num[0];
        int min=num[0];
   for(int i=0;i<num.length;i++){

      if(num[i]<min)
      {
        min=num[i];
      }

     if(num[i]>max)
     {
        max=num[i];
     }

   }


System.out.println(max);
System.out.println(min);

 }



public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int length=input.nextInt();
    int[] array=new int[length];
    for(int i=0;i<length;i++){
    
        array[i]=input.nextInt(); 
    }
    mymethod(array);







}







}
