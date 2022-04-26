public class AverageOfArray{
    public static void main(String[] args){
        int [] marks = {50, 100, 150, 200, 250};
        float sum=0;
        for (float element:marks){
            sum += element;
        }
        System.out.println("The Avergae value of Array : "+sum/marks.length);
    }
}