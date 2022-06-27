import java.util.Scanner;

public class ATM {

    public static void printBalance (int balance){
        System.out.println("Current Balance = "+balance);
    }

    public static int withdraw (int balance, int withdrawAmount){
        System.out.println("The Withdrawing Amount is : "+ withdrawAmount);
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println("Please, Collect the Cash and Remove Your Card.");
            printBalance(balance);
        }
        else{
            System.out.println( "Sorry! the balanace is insufficient." );
        }
        return balance;
    }

    public static int deposit (int balance, int depositAmount){
        System.out.println("The Depositing Amount is : "+ depositAmount);
        balance += depositAmount;
        System.out.println( "Your Money has been successfully deposited" );
        printBalance(balance);
        return balance;
    }



    public static void main(String[] args) {
        int balance=100000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while (true){  
            System.out.println("\nHi, Please Do Not Remove Your Chip Card.");
            System.out.println("Choose From the Following Option. \n\nc------>>> Balance Inquiry/ Withdrawal/ Deposit/ Exit <<<------\n");

            System.out.print("Select the Appropriate Option you want to Perform : ");
            String op = sc.nextLine();

            switch (op){
                case "Balance Inquiry" : 
                    printBalance(balance);
                    break;

                case "Withdrawal" :
                    System.out.print("Enter Amount : ");
                    withdraw = sc.nextInt();
                    withdraw(balance, withdraw);
                    break;

                case "Deposit" : 
                    System.out.print("Enter Amount : ");
                    deposit = sc.nextInt();
                    deposit(balance, deposit);
                    break;

                case "Exit" : 
                    System.exit(0);
            }
        }
    }    
}
