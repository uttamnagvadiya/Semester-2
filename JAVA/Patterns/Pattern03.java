// Output :
    
// * * * * 
//  * * * 
//   * * 
//    * 
//    * 
//   * * 
//  * * * 
// * * * * 

import java.util.Scanner;
public class Pattern03{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        for(int i=n; i>0; i--){
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
        for(int i=0; i<n; i++)                                     
        {
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
    }
}   