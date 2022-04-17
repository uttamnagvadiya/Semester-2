import java.util.Scanner;
class Companies{
    String name;
    String author;
    String value;

    void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Company_Name = ");
        name = input.next();
        System.out.print("Company_Author = ");
        author = input.next();
        System.out.print("Company_Value = ");
        value = input.next();
    }
        
    void displayData(){
        System.out.println("\n"+"Output:");
        System.out.println("Company_Name = "+name);
        System.out.println("Company_Auhtor = "+author);
        System.out.println("Company_Value = "+value);
        System.out.println("\n");
    }
}
class CompaniesDemo{
    public static void main(String[] args){
        Companies C1 =new Companies();
        C1.setData();
        C1.displayData();
        Companies C2 =new Companies();
        C2.setData();
        C2.displayData();
    }
}