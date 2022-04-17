class Circle{
    double radius, z;
    Circle(double radius){
        this.radius = radius;
    }
    double getArea(){
        z = Math.PI*Math.pow(this.radius,2);
        return z;
    }
    void printArea(){
        System.out.print("Area of Circle = "+ z + "\n");
    }
}
public class AreaOfCircle{
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        c1.getArea();
        c1.printArea();
        c2.getArea();
        c2.printArea();
    }
}