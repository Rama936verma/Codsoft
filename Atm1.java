
import java.util.*;
class ATM{



    float Balance=500000f;
    int PIN;
    public void checkpin()
    {

        System.out.println("enter your pin:");
        Scanner ip =new Scanner(System.in);
    
        int enteredpin=ip.nextInt();
        System.out.println("confirm your pin:");
        PIN=ip.nextInt();
        if(enteredpin==PIN){

            menu();

        }
        else{
            System.out.println("enter  your valid pin:");
            
        }
        
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.check acount blance:");
        System.out.println("2.Withdraw Money:");
        System.out.println("3.Deposite:");
        System.out.println("4.Exit");

        Scanner sc =new Scanner(System.in);
        int option=sc.nextInt();
        if (option==1){
            checkBalance();


        }
        else
        if(option==2)
        {
            withdraw();

        }
        else if(option==3)
        {
            deposite();

        }
        else if(option==4)
        {
            return;
        }
        else{
            System.out.println("enter valid choice:");
        }


        }

        public void checkBalance()
        {
            System.out.println("Balance:"+Balance);
         
            menu();
        }

        public void withdraw(){
            System.out.println("enter amount to withdraw:");
            Scanner sc=new Scanner(System.in);
            int amount=sc.nextInt();
            if(amount>Balance){
                System.out.println("insufficient fund:");
            }
            else{
                Balance=Balance-amount;
                System.out.println(" money withdraw seccessful:");

            }
            menu();

        }
         

        public void deposite(){


            System.out.println("enter the amount:");
                        Scanner sc=new Scanner(System.in);

            float amount=sc.nextFloat();
            Balance=Balance+amount;
            System.out.println(" money depoite successful");

        }






    }

public class Atm1 {
    public static void main(String[] args) {

        ATM obj=new ATM();
    obj.checkpin();

    }
}
 