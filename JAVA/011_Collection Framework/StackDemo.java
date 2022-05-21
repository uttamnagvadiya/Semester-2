import java.util.*;
public class StackDemo{
    public static void main(String[] args){

        Stack <Character> stc = new Stack <Character> ();

        for (char i=65; i<=90; i++){
            stc.push((char)i);
        }
        System.out.println("Original Stack : "+stc+"\n");

        //Return the last added Element. it can not be removed in Stack
        System.out.println("Last in First Out : "+stc.peek()+"\n"+stc+"\n");

        //Return the last added Element. it can be removed in Stack
        System.out.println("Removal LiFo : "+stc.pop()+"\n"+stc+"\n");

        /*Searches for Element in the Stack. If Found, Stack is returned.
            Ohtherwise -1 is returned. Counting Start the Right Side.*/
        System.out.println("Searched Element : "+stc.search('a')+"\n");

        //Check the Stack Empty or Not
        System.out.println("Stack Empty Before Clear : "+stc.empty());
        stc.clear();
        System.out.println("Stack Empty After Clear : "+stc.empty());
    }
}