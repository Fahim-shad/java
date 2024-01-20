import java.util.Scanner;
public class sumandaveragefun{
    static void  mymethod(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];

        }

        double average=sum/num.length;
        System.out.println(sum);
        System.out.println(average);
    }
     
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int length=input.nextInt();
    int[] array=new int[length];
    for(int i=0;i<length;i++)
    {
        array[i]=input.nextInt();
    }
  mymethod(array);
    
}











}