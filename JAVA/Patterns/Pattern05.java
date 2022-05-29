// Output :

//       *
//      * *
//     *   *
//    *     *
//   *       *
//  *         *
// *************

import java.util.*;
public class Pattern05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows = input.nextInt();
          
        System.out.println("------------ Pattern 01 -----------------");
        for (int i=1; i<=rows; i++){
            for (int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); k++){
                if (k==1 || i==rows || k==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("------------ Pattern 02 -----------------");
        for (int i=1; i<=rows; i++){
            for (int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                if (k==1 || k==i || i==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}