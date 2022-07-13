//Output :



import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        int alpha = 65;


        //     A
        //    ABC
        //   ABCDE
        //  ABCDEFG
        // ABCDEFGHI
        // for (int i=0; i<rows; i++){
        //     for (int j=0; j<(rows-i-1); j++){
        //         System.out.print(" ");
        //     }
        //     for (int k=0; k<2*i+1; k++){
        //         System.out.print((char)(alpha+k));
        //     }
        //     System.out.println();
        // }
        System.out.println();

        
        //      A
        //     AB
        //    ABC
        //   ABCD
        //  ABCDE
        // for (int i=0; i<rows; i++){
        //     for (int j=0; j<(rows-i-1); j++){
        //         System.out.print(" ");
        //     }
        //     for (int k=0; k<i; k++){
        //         System.out.print((char)(alpha+k));
        //     }
        //     System.out.println();
        // }
        System.out.println();


        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        // for (int i=0; i<rows; i++){
        //     for (int j=0; j<(rows-i); j++){
        //         System.out.print((char)(alpha+j));
        //     }
        //     System.out.println();
        // }
        System.out.println();


        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        // for (int i=0; i<rows; i++){
        //     for (int j=0; j<=(i); j++){
        //         System.out.print((char)(alpha+j));
        //     }
        //     System.out.println();
        // }
        System.out.println();


        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C 
        // A B 
        // A 
        for (int i=0; i<=rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
        for (int i=rows; i>=0; i--){
            for (int k=0; k<=i-1; k++){
                System.out.print((char)(alpha+k)+ " ");
            }
            System.out.println();
        }
    }    
}
