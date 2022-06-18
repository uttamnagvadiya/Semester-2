import java.util.*;
public class Addition{
    public static void main(String[] args){
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        float z = x + y;

        System.out.println("ADDITION: "+z);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        x = sc.nextFloat();
        System.out.print("y = ");
        y = sc.nextFloat();

        z = x + y;
        System.out.println("ADDITION: "+z);
    }
}