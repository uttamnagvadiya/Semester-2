// class Counter{
// 	static int count = 0;

// 	Counter(){
// 		count++;
// 	}

// 	void display(){
// 		System.out.println("Counter = " + count);
// 	}
// }

// class NoOfVowel{
// 	public static void main(String[] args){
// 		Counter c1 = new Counter();
// 		c1.display();
// 		Counter c2 = new Counter();
// 		c2.display();
// 		Counter c3 = new Counter();
// 		c3.display();
// 	}
// }

import java.util.*;
class NoOfVowel{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int vowel = 0;
		
		String sentence;
		char ch;
		do{
			System.out.print("Enter Sentence : ");
			sentence = input.nextLine();
			
	        for(int i=0;i<sentence.length();i++){
	        	sentence = sentence.toLowerCase();
	        	ch = sentence.charAt(i);
	        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	        		vowel++;
	        	}
	        }
	    }
	    while(!sentence.equals("quit"));

       System.out.print("NumberOfVowel = " + (vowel-2));
    }   
}
