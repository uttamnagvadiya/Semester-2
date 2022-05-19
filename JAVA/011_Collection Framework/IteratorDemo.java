import java.util.*;
public class IteratorDemo{
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("L");
        a.add("A");
        a.add("P");
        a.add("T");
        a.add("O");
        a.add("P");

        Iterator<String> itr = a.iterator();
        while(itr.hasNext()){
            System.out.print("["+itr.next()+"] ");
        }
    }
}