import java.util.*;
public class PriorityQueueDemo{
    public static void main(String[] args){

        PriorityQueue <Character> pqu = new PriorityQueue <Character> ();

        pqu.add('F');
        pqu.add('A');
        pqu.add('B');
        pqu.add('M');
        pqu.add('E');

        System.out.println(pqu);
        while(!pqu.isEmpty()){
            System.out.println(pqu.remove());
        }
    }
}