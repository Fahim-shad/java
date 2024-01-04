import java.util.Scanner;
public class scaler{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("dimension of matrix = ");
int row=input.nextInt();
int cols=input.nextInt();
int [][] matrix= new int[row][cols];
int f=0,d=0;

System.out.println("Enter elements of the matrix: ");
for (int i = 0; i < row; i++) {
    for (int j = 0; j < cols; j++) {
        matrix[i][j] = input.nextInt();
    }
}

d = matrix[0][0];
for (int i = 0; i < row; i++) {
    for (int j = 0; j < cols; j++) {
        if(i==j&&matrix[i][j]!=d)
        {
            f=1;
            break;
        }

        else if(i!=j&&matrix[i][j]!=0)
        {
            f=1;
            break;
        }





    }
}

if(f==0)
{
    System.out.println("scaler matix");
}
else {
    System.out.println("not scaler matrix");
}

























































    }
}