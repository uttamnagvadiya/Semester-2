public class ReverseArray{
    public static void main(String[] args){
        int [] a = {458, 89, 25, 78, 16, 11};
        System.out.print("Original Array : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        } 
        System.out.println();
        System.out.print("Reverse Array : ");
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}