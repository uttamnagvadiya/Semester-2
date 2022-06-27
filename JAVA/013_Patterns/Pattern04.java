// Output :
//   j
//  j a
// j a v  
//j a v a

import java.util.Scanner;
public class Pattern04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        String n = input.nextLine();
        for( int i=0; i<=n.length(); i++){
            for(int j=i; j<(n.length()*2)-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(n.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}