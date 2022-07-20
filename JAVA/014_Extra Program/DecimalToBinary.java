import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int remainder=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal Number : ");
        int decimal = sc.nextInt();
        
        int binary [] = new int[25];
        int index = 0;

        while (decimal != 0) {
            binary[index] = decimal % 2;
            index++;
            decimal /= 2;
        }
        
        System.out.print("Binary : ");
        for (int i=index-1; i>=0; i--){
            System.out.print(binary[i]);
        }
    }
    
}
