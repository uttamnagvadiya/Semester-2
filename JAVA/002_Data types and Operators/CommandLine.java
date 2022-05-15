import java.util.*;
public class CommandLine{
    public static void main(String[] args){

        //Using Command Line 
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        
        //Using Scanner Class
        // Scanner input = new Scanner(System.in);
        // System.out.print("a = ");
        // float a = input.nextFloat();
        // System.out.print("b = ");
        // float b = input.nextFloat();

        float c = a + b;  float f = a * b;
        float d = a - b;  float g = a / b;


        System.out.println("Sum = " + c);
        System.out.println("Sub = " + d);
        System.out.println("Multi = " + f);
        System.out.println("Div = " + g);
    }
}