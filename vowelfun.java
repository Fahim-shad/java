import java.util.Scanner;
public class vowelfun{
     static void mymethod(String sen){
        int count=0;
        for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
         System.out.println("vowel is =" +count);
     }
public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    String sen=input.nextLine();
    mymethod(sen);

}







}
    

 
 
    







