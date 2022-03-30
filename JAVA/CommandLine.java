public class CommandLine{
    public static void main(String[] args){

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = a + b;  float f = a * b;
        float d = a - b;  float g = a / b;

        System.out.println("Sum = " + c);
        System.out.println("Sub = " + d);
        System.out.println("Multi = " + f);
        System.out.println("Div = " + g);
    }
}