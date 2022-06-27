import java.util.*;
class Student{
    int no_of_subject_registered, n;
    int[] subject_credit;
    long id_no;
    String[] subject_code, grade_obtained;
    double spi, total_credit, point;
    double total_score, percentage;

    public void setStudentDetails(){

        Scanner i_input = new Scanner(System.in);
        Scanner s_input = new Scanner(System.in);

        System.out.print("StudentID : ");
        id_no = i_input.nextLong();
        System.out.print("No_of_Subject : ");
        no_of_subject_registered = i_input.nextInt();

        n = no_of_subject_registered;

        subject_code = new String[n];
        subject_credit = new int[n];
        grade_obtained = new String[n];

        for (int i=0; i<n; i++){
            System.out.print("Subject Code : ");
            subject_code[i] = s_input.next();
            
            System.out.print("Subject Credit : ");
            subject_credit[i] = i_input.nextInt();
            total_credit = total_credit + subject_credit[i];

            System.out.print("Grade : ");
            grade_obtained[i] = s_input.next();
            grade_obtained[i] = grade_obtained[i].toUpperCase();
        
            switch(grade_obtained[i]){
                case "A+" : point = 10; 
                break;
                case "A" : point = 9; 
                break;
                case "B+" : point = 8; 
                break;
                case "B" : point = 7; 
                break;
                case "C+" : point = 6; 
                break;
                case "C" : point = 5; 
                break;
            }

            total_score = total_score + (point * subject_credit[i]);
        }
        //------------- Calculate SPI & Percentage --------------------------

        spi = total_score / total_credit;
        percentage = (spi - 0.5)*10;
    }
    public void printStudentDetials(){
            System.out.println("----------------------------------------- Student Result --------------------------------------\n");
            System.out.println("StudentID : " + id_no);
            System.out.println("No_of_Subject : " + no_of_subject_registered + "\n");
            System.out.println("\tSubject Code\t\tSubject Credit\t\tGrade\n");
            for (int i=0; i<n; i++){
                System.out.println("\t" + subject_code[i] + "\t\t\t" + subject_credit[i] + "\t\t" + grade_obtained[i] + "\n");
            }
            System.out.print("Total Credit : " + total_credit + "\t\t");
            System.out.println("SPI : " + spi+"\n");
            System.out.println("Percentage : " + percentage+"%\n");
        }    
}
public class SPI{
    public static void main(String[] args){
        Student s = new Student();
        s.setStudentDetails();
        s.printStudentDetials();
    }
}