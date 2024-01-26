class A{
  private int accountNumber;
  private String accountHolder;
  private double balance=0;
  private double withdraw;
 A(int x,String y,double z){
accountNumber=x;
accountHolder=y;
balance=z;
 }
void display()
{
    System.out.println(accountNumber+" " +accountHolder+" "+balance);
}
void deposit(double z)
{
    balance+=z;
}
public double getDeposit()
{
    return balance;
}
void withdraw(double z)
{
    if(balance<z)
    {
        System.out.println("not withdraw");
    }
    else{
     balance-=z;
    }
}
public double getWithdraw()
{
    return withdraw;
}
public double checkbalance()
{
    return balance;
}



}
class bankaccount{
public static void main(String[] args) {
   A myobj=new A(12345,"Jawan",5000) ;
   myobj.display();
   myobj.deposit(3000);
   System.out.println(myobj.getDeposit());
   myobj.withdraw(1000);
   System.out.println(myobj.getWithdraw());
   System.out.println(myobj.checkbalance());

}

}