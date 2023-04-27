import java.util.Scanner;
class Time{
    int hour, minute, second;

    Time(){
        hour=0; minute=0; second=0;
    }

    void setTime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Hour = ");
        hour = input.nextInt();
        System.out.print("Minute = ");
        minute = input.nextInt();
        System.out.print("Second = ");
        second = input.nextInt();
        System.out.println();
    }

    void displayTime(){
        System.out.println("Hour= "+ hour);
        System.out.println("Minute= "+ minute);
        System.out.println("Second= "+ second);
    }

    Time addTime(Time z){
        Time temp = new Time();
        temp.second = second + z.second;
        temp.minute = minute + z.minute + (temp.second/60);
        temp.second = temp.second%60;
        temp.hour = hour + z.hour + (temp.minute/60);
        temp.minute = temp.minute%60;
        
        return temp;
    }
}

public class TimeDemo{
    public static void main(String[] args){
        
        Time t1 = new Time();
        t1.setTime();
       
        Time t2 = new Time();
        t2.setTime();

        Time add = new Time();
        add = t1.addTime(t2);
        add.displayTime();
    }
}