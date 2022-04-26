import java.util.Scanner;
public class CalculatePercentage{
    public static void main(String[] args){

        double subject_01, subject_02, subject_03, subject_04, subject_05;

        Scanner input = new Scanner(System.in);
        System.out.print("Subject_01 = ");
        subject_01 = input.nextDouble();
        System.out.print("Subject_02 = ");
        subject_02 = input.nextDouble();
        System.out.print("Subject_03 = ");
        subject_03 = input.nextDouble();
        System.out.print("Subject_04 = ");
        subject_04 = input.nextDouble();
        System.out.print("Subject_05 = ");
        subject_05 = input.nextDouble();
        
        double Percentage = (subject_01 + subject_02 + subject_03 + subject_04 + subject_05)*100 / 500;

        System.out.println("Percentage = "+Percentage+"%");

        if(Percentage >= 60)
            System.out.println("Student in First Division");
        else if(Percentage >= 50 && Percentage < 59)
            System.out.println("Student in Second Division");
        else if(Percentage >= 40 && Percentage < 49)
            System.out.println("Student in Third Division");
        else if(Percentage < 40)
            System.out.println("Student is Fail");    
    }
}