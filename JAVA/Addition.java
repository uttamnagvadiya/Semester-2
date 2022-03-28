import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        float z = x + y;

        System.out.println("ADDITION: "+z);
        
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        x = input.nextFloat();
        System.out.print("y = ");
        y = input.nextFloat();

        z = x + y;
        System.out.println("ADDITION: "+z);
    }
}