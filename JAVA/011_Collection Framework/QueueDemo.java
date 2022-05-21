import java.util.*;
public class QueueDemo{
    public static void main(String[] args){

        Queue <String> qu = new LinkedList <String> ();

        qu.add("Tom");
        qu.add("Jerry");
        qu.add("Doraemon");
        qu.add("Nobita");
        qu.add("Bheem");

        System.out.println("Original Queue : "+qu+"\n");

        //Return the Element at the Head of the Queue
        System.out.println("Head of Queue : "+qu.element()+"\n"+qu+"\n");

        //Add Element to the Queue. Returns true if Element was Added and Otherwise false
        System.out.println("Added Element : "+qu.offer("Kalia")+"\n"+qu+"\n");

        //Return the First added Element. its cannot be removed. It Return Null if the Queue is Empty.
        System.out.println("First in First out : "+qu.peek()+"\n"+qu+"\n");

        //Return the First added Element. its can be removed. It Return Null if th Queue is Empty.
        System.out.println("Removal FiFo : "+qu.poll()+"\n"+qu+"\n");

        //Elements Removed From Queue
        qu.remove("Bheem");
        qu.remove("Kalia");
        System.out.println("This Queue is after Removed Elements"+"\n"+qu+"\n");

        //Check the Queue Empty or Not
        System.out.println("Queue Empty Before Clear : "+qu.isEmpty());
        qu.clear();
        System.out.println("Queue Empty After Clear : "+qu.isEmpty());
    }
}