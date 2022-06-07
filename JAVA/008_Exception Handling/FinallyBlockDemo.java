public class FinallyBlockDemo{
    public static void main(String[] args){
        int balance = 5000;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int withdraw = sc.nextInt();

        try{
            if (balance-withdraw < 1000){
                throw new Exception("Balance is < 1000");
            }
            else{
                balance = balance-withdraw;
                System.out.println(balance);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("--------- above balance is after the withdrawal. --------------");
            //Finally Block will be Execute with Exception and without Exception.
        }
    } 
}