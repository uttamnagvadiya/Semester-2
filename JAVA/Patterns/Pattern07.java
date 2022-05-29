//      Output :

//        ****     ****
//       ******   ******
//      ******** ********
//      *****************
//       ***************
//        *************
//         ***********
//          *********
//           *******
//            *****
//             ***
//              *

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows = sc.nextInt();
        
        for (int i=rows/2; i<=rows; i+=2){
            for (int j=1; j<rows-i; j+=2){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k=rows; k>=1; k--){
            for (int g=k; g<rows; g++){
                System.out.print(" ");
            }
            for (int g=1; g<=(k*2-1); g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
