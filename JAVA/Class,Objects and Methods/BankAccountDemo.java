import java.util.Scanner;
class BankAccount{
    long accountNo;
    String userName, email, accountType, z; 
    double accountBalance;

    BankAccount(long accountNo, String userName, String email, String accountType, double accountBalance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    String getAccountDetails(){
       z = "Account_No : " + accountNo +"\n" + "Account_Holder_Name : " + userName + "\n" + "Email : " + email + "\n" + "Account_Type : " + accountType + "\n" + "Balance : " + accountBalance + "\n";
       return z;
    }
    void displayAccountDetails(){
        System.out.println("Bank Details : " + "\n" + z);
    }
}
public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(123456789,"uttam","uuu6040@gmail.com","Saving",40562.78);
        BankAccount b2 = new BankAccount(987654321,"kishan","kkk4060@gmail.com","Current",145687.65);
        b1.getAccountDetails();
        b2.getAccountDetails();
        b1.displayAccountDetails();
        b2.displayAccountDetails();
    }
}