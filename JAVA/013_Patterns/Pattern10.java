import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        // if (rows%2==0){
        //     rows=rows;
        // }
        // else{
        //     rows+=1;
        // }


        int space=0, i, j;

        // 12345_54321
        // 1234___4321
        // 123_____321
        // 12_______21
        // 1_________1
        System.out.println("------------------ Pattern 01 ---------------------");
        for (i=0; i<rows; i++){
            for (j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (j=1; j<=rows; j++){
                if (j<=(rows-i)){
                    System.out.print(j);
                }
                else{
                    System.out.print("_");
                }
            }
            while(j>0){
                if (j>(rows-i)){
                    System.out.print("_");
                }
                else{
                    System.out.print(j);
                }
                j--;
            }
            if ((rows-i)>9){
                space++;
            }
            System.out.println();
        }
        System.out.println();


        // 1     1
        //  2   2 
        //   3 3  
        //    4   
        //   3 3  
        //  2   2 
        // 1     1
        System.out.println("------------------ Pattern 02 ---------------------");

        //Enter the Rows is 8 or more than 8.

        if(rows%2 != 0){
            rows++;
        }

        if (rows>=8){
            for (i=1; i<rows; i++){
                for (j=1; j<=rows/2; j++){
                    if (i==j){
                        System.out.print(j);
                    }
                    else if (i>4 && j==(rows-i)){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                j -= 2;
                while (j>0){
                    if (i==j){
                        System.out.print(j);
                    }
                    else if (i>4 && j==(rows-i)){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(" ");
                    }
                    j--;
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Entered Rows is Invalid.");
        }
    }
}
