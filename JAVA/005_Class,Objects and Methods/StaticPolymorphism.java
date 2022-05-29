class Addition{
    //Methods Overloading
    public int sum(int x, int y){
        return (x+y);
    }
    public double sum(double x, double y){
        return (x+y);
    }
    public int sum(int x, int y, int z){
        return (x+y+z);
    }
}
public class StaticPolymorphism{
    public static void main(String[] args){
        Addition add = new Addition();
        System.out.println(add.sum(1, 1));
        System.out.println(add.sum(2, 3));
        System.out.println(add.sum(5, 2, 3));
    }
}