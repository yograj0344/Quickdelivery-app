import java.util.Scanner;
class method63
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       
    //    System.out.println("Welcom TO Qspider\n Pay Fees");
       System.out.println("Welcome To *Quickdeliver*");
    //    System.out.println("deliver item\n Vegetable\nmilk\n glossary");
       System.out.println("Enter 1 for vegetable 50 Rs");
       System.out.println("Enter 2 for milk 10 Rs"); 
       System.out.println("Enter 3 for glossary  100 Rs");
       System.out.println("What order Enter the option");
       int opt=sc.nextInt();
       System.out.println("Enter the address");
        String m=sc.nextLine();
      
     
       
       System.out.println("Enter Amount");
         opt=sc.nextInt();
         System.out.println("Enter 1 For Card payment");
         System.out.println("Enter 2 For UPI Payment");
         System.out.println("Enter 3 For Net Banking");
         
         System.out.println("Mode of payment");
        opt=sc.nextInt();

      
    //   
        
       
        // opt=sc.nextInt();

       if(opt==1)
       {
           System.out.println("Enter the Card Number");
           int card=sc.nextInt();
           System.out.println("Enter the Cvv Number");
           int cvv=sc.nextInt();
           System.out.println("Enter the Exp Date");
           String exp=sc.next();
           method63 e1=new method63(); // non static  method call
            e1.print( card, cvv, exp);

       }else if(opt==2)
       {
           System.out.println("Enter the UPI  ");
           String upi=sc.next();
           print(upi);

       }
       else if(opt==3)
       {
           System.out.println("Enter the USER ID");
           String user=sc.next();
           System.out.println("Enter the Password");
           String pass=sc.next();
            
           method63 e1 =new method63(); // non static method
            e1.print( user,  pass);
       }
       else{
           System.out.println("Wrong input");

       }
    }
    public  void print(int card,int cvv,String exp)
    {
        System.out.println("payment by card");
        System.out.println("Order Completed");

        
    }
    public static  void print(String uip)
    {
        System.out.println("payment by upi");
        System.out.println("OrderCompleted");
    }
    public  void print(String user, String pass)
    {
        System.out.println("Paynent by Net Banking");
        System.out.println("order completed");
    }
}