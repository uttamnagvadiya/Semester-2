// Output :

//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

import java.util.Scanner;
public class Pattern02{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        for(int i=0; i<n; i++)                                     
        {
            if(i==1){
                continue;
            }
            for(int j=i+1; j<n; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=n-1; i>0; i--){
            if(i==2){
                continue;
            }
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k>0; k--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}