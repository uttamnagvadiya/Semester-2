import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        long a = input.nextLong();
        long x=0;

        for(long i = a ; i>0;){
            x=(x*10) + (i%10);
            i=i/10;
        }
        if (a==x){
            System.out.print("This Number is Palindrome");
        }
        else{
            System.out.print("This Number is Not Palindrome");
        }

    }
}