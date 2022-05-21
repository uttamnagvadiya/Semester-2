import java.util.*;
public class VectorClass{
    public static void main(String[] args){
        Vector <Integer> v = new Vector <Integer> ();

        for (int i=1; i<=10; i++){
            v.add(i);
        }
        
        System.out.println("\nOriginal Vector : "+v+"\n");

        //Replace the Element at the specified index
        v.set(5, 100);
        System.out.println(v);
        
        //Check Whether this Vector Contains Specified Element or All the Elements  
        System.out.println(v.contains(15));
        System.out.println(v.containsAll(v)+"\n");

        //Element of any Particular Index.
        System.out.println("Element : "+v.get(4)+"\n");

        //Remove Elements at Index
        v.remove(8);
        System.out.println("The Vector is after remove any specific Element \n"+v+"\n");

        //Element removed from Vector
        System.out.println("Removal Elements : ["+v.remove(6)+"]\n");

        //First & Last Element of Vector
        System.out.println("First Element : ["+v.firstElement()+"]");
        System.out.println("Last Element : ["+v.lastElement()+"]\n");

        //Returns the Index of Elements
        System.out.println("Index of Element : "+v.indexOf(5)+"\n");

        // v.ensureCapacity(50);
        // System.out.println(v.size());
        // System.out.println(v);

        System.out.println("HashCode of this Vector : "+v.hashCode()+"\n");

        //Returns the Current Capacity of this Vector
        System.out.println("Capacity of Vector : "+v.capacity()+"\n");

        //Iterating Over Vector Elements
        for (int i=0; i<v.size(); i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println("\n");
        
        System.out.println("Vector Size Before Clear : "+v.size());
        v.removeAll(v);  //v.clear();                                                       // You can use also clear() method.
        System.out.println("Vector Size After Clear : "+v.size());

        //Check the Vector is Empty or Not
        System.out.println("Vector is Empty or Not : "+v.isEmpty());     //Returns Ture or False
    }
}