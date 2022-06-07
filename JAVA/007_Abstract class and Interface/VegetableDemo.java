import java.util.*;
abstract class Vegetable {
	String color;
	abstract String tostring();
}

class Potato extends Vegetable{
	public String tostring(){
		color = "Skin";
		return color;
	}
}
class Brinjal extends Vegetable{
	public String tostring(){
		color = "Purple";
		return color;
	}
}
class Tomato extends Vegetable {
	public String tostring(){
		color = "Red";
		return color;
	}
}

public class VegetableDemo{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Vegetable Name : ");
		String veg = input.next();

		Vegetable v=null;

		switch(veg){
			case "Potato":
				v = new Potato();
				break;
			case "Brinjal":
				v = new Brinjal();
				break;
			case "Tomato":	
				v = new Tomato();
				break;
		}
		
		System.out.println(veg + " : " + v.tostring());
	}
}