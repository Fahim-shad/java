import java.util.Scanner;
public class vowel{
    public static void main(String[] args){

Scanner input =new Scanner(System.in);
String s=input.nextLine();
int count =0;
for(int i=0;i<s.length();i++)
{
    char ch=s.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        count++;
    }
}
 System.out.println("number of vowels = "+ count);



























    }
}
