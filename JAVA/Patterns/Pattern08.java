import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows = sc.nextInt();
        
        

        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 
        System.out.println("------------------ Pattern 01 ---------------------");
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        // 1 
        // 2 3 
        // 3 4 5 
        // 4 5 6 7 
        System.out.println("------------------ Pattern 02 ---------------------");
        for (int i=1; i<rows; i++){
            for (int j=i; j<i+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4 
        // 5 5 5 5 5 
        System.out.println("------------------ Pattern 03 ---------------------");
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();


        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        System.out.println("------------------ Pattern 04 ---------------------");
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();


        // 1
        // 2 3 
        // 4 5 6
        // 7 8 9 10
        System.out.println("------------------ Pattern 05 ---------------------");
        int $=1;
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(($++)+" ");
            }
            System.out.println();
        }
        System.out.println();


        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        System.out.println("------------------ Pattern 06 ---------------------");
        for (int i=1; i<=rows; i++){
            for (int j=i; j>=1; j--){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
        System.out.println();


        //     1
        //    A B 
        //   2 3 4
        //  C D E F
        // 5 6 7 8 9
        System.out.println("------------------ Pattern 07 ---------------------");
        int u=1, j;
        char  c = 'A';

        for (int i=1; u<=rows; i=j){
            for (int k=u; k<rows; k++){
                System.out.print(" ");
            }
            for (j=i; j<(i+u); j++){
                System.out.print(j+" ");
            }
            System.out.println();
            u++;

            if (u <= rows){
                for (int p=u; p<rows; p++){
                    System.out.print(" ");;
                }
                for (int t=1; t<=u; t++){
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
                u++;
            }
        }
        System.out.println();
    }
}
