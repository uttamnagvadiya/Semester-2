//-------------------- Distance between 3 Points --------------------------
import java.util.Scanner;
class MyPoint{
    double x, y, z;
    MyPoint(){
        x=0; y=0; z=0;
    }
    MyPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z; 
    }
    double distance(MyPoint a){
       double D = Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y,2) + Math.pow(this.z-a.z,2));
        return D;
    }
}
class InputXY{
    double x, y, z;
    Scanner input = new Scanner(System.in);

    public double getX() {
        System.out.print("Enter x : ");
        return x = input.nextDouble();
    }
    public double getY() {
        System.out.print("Enter y : ");
        return y = input.nextDouble();
    }
    public double getZ() {
        System.out.print("Enter z : ");
        return z = input.nextDouble();
    }
}
public class My3Points {
    public static void main(String[] args) {
        InputXY i = new InputXY();
        MyPoint d1 = new MyPoint();

        MyPoint d2 = new MyPoint(i.getX(), i.getY(), i.getZ());
        System.out.printf("Distance (%.1f, %.1f, %.1f) to (%.1f, %.1f, %.1f) : ", d1.x, d1.y, d1.z, d2.x, d2.y, d2.z);
        System.out.println(d1.distance(d2));

        MyPoint d3 = new MyPoint(i.getX(), i.getY(), i.getZ());
        System.out.printf("Distance (%.1f, %.1f, %.1f) to (%.1f, %.1f, %.1f) : ", d2.x, d2.y,d2.z, d3.x, d3.y, d3.z);
        System.out.println(d2.distance(d3));
    }
}