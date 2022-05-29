// Output :

//      ***********
//      **       **
//      * *     * *
//      *  *   *  *
//      *   * *   *
//      *    *    *
//      *   * *   *
//      *  *   *  *
//      * *     * *
//      **       **
//      ***********

import java.util.Scanner;

public class Pattern06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows; j++){
                if (i==1 || i==rows || j==1 || j==(rows-i+1) || j==rows || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}