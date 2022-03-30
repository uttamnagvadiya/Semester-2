import java.util.Scanner;
class BankAccount{
    String accountNo, userName, email, accountType, accountBalance;
    
    void getAccountDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Account_No : ");
        accountNo = input.next();
        System.out.print("Account_Holder_Name : ");
        userName = input.next();   
        System.out.print("Email : ");
        email = input.next();
        System.out.print("Account_Type : ");
        accountType = input.next();
        System.out.print("Balance : ");
        accountBalance = input.next();
        System.out.println();
    }
    void displayAccountDetails(){
        System.out.println("Account_No : "+accountNo);
        System.out.println("Account_Holder_Name : "+userName);
        System.out.println("Email : "+email);
        System.out.println("Account_Type : "+accountType);
        System.out.println("Balance : "+accountBalance);
        System.out.println();
    }
}
public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.getAccountDetails();
        BankAccount b2 = new BankAccount();
        b2.getAccountDetails();
        System.out.println();
        b1.displayAccountDetails();
        b2.displayAccountDetails();
    }
}