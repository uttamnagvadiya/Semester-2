import java.util.*;
public class CountConsonantsVowel{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = input.nextLine();
        str = str.toLowerCase();
        
        int vowel = 0, consonant = 0;
        for (int i=0; i<str.length(); i++){
            char character  = str.charAt(i);
            if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
                vowel++;
            }
            else{
                consonant++;
            }
        } 
        System.out.printf("==> %s Vowels in Your String.\n", vowel);
        System.out.printf("==> %s Consonants in Your String.", consonant);
    }
} 