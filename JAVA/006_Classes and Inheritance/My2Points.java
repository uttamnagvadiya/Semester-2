/*class My_Point{
    double x, y;
    My_Point(){
      x = 0;
      y = 0;
    }
    My_Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    double distance(My_Point a){
        double D = Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y,2));
        return D;
    }
}
public class MyPoints{
    public static void main(String[] args){
        My_Point d1 = new My_Point();
        My_Point d2 = new My_Point(5,5);

        System.out.println("Distance between two points is : " + d1.distance(d2));
    }
}*/




//------------------ Distance between 2 Points --------------------------
import java.util.Scanner;
class MyPoint{
    double x, y;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    double distance(MyPoint a){
       double D = Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y,2));
        return D;
    }
}
class InputXY{
    double x, y;
    Scanner input = new Scanner(System.in);
    public double getX() {
        System.out.print("Enter x : ");
        return x = input.nextDouble();
    }
    public double getY() {
        System.out.print("Enter y : ");
        return y = input.nextDouble();
    }
}
public class MyPoints {
    public static void main(String[] args) {
        InputXY i = new InputXY();
        MyPoint d1 = new MyPoint();

        MyPoint d2 = new MyPoint(i.getX(), i.getY());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ", d1.x, d1.y, d2.x, d2.y);
        System.out.println(d1.distance(d2));

        MyPoint d3 = new MyPoint(i.getX(), i.getY());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ", d2.x, d2.y, d3.x, d3.y);
        System.out.println(d2.distance(d3));
    }
}