import java.util.*;
public class UpperCase{
    public static void main(String[] args){
       /* Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = input.next();*/

        for (int i=0; i<args[0].length(); i++){
            if (args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z'){
                System.out.println("Character is Capital its not Valid.");
                break;
            }
        }
    }
} 