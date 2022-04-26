import java.util.*;
public class LargestNumberof3{
    public static void main(String[] args){
        double x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        System.out.print("z = ");
        z = input.nextDouble();

        if (x > y){
            if (x > z){
                System.out.println("x is Largest Number.");
            }
        }
        else if (y > z){
            System.out.println("y is Largest Number.");
        }
        else{
            System.out.println("z is Largest Number.");
        }
    }
}