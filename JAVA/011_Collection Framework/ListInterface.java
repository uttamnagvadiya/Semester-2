import java.util.*;
public class ListInterface{
    public static void main(String[] args){

        //Here ArrayList & LinkedList implements List Interface.

        List l1 = new ArrayList();                      // Using ArrayList
        l1.add("Uttam");
        l1.add("Kishan");
        l1.add("Karan");
        System.out.println("ArrayList Elements : "+l1);

        System.out.println();                                         

        List l2 = new LinkedList();                     // Using LinkedList
        l2.add("Rajkot");
        l2.add("Baroda");
        l2.add("Ahemdabad");
        System.out.println("LinkedList Elements : "+l2);

       
        System.out.println("Index of Elements : "+l2.lastIndexOf("Rajkot"));      // Returns the index of Elements.
        System.out.println(l1.get(1));                                            // Return the Elements of index. 
    }
}