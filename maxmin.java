
public class maxmin{   
public static void main(String[] args){   
    
int  number[] ={45,67,88,97};

int max = number[0];
int min = number[0];
for(int i=0;i<number.length;i++)
{
    if(number[i] <min)
{
    min=number[i];
}
if(number[i] >max)
{
    max=number[i];
}



}

System.out.println(max);

System.out.println(min);












}
}