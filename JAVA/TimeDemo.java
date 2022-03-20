import java.util.Scanner;
class Time{
    int hour, minute, second;

    void setTime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Hour = ");
        hour = input.nextInt();
        System.out.print("Minute = ");
        minute = input.nextInt();
        System.out.print("Second = ");
        second = input.nextInt();
    }

    void displayTime(){
        this.second+=second;
        while(this.second>60){
            minute++;
            this.second-=60;
        }
        this.minute+=minute;
        while(this.minute>60){
            hour++;
            this.minute-=60;
        }
        this.hour+=hour;

        System.out.println("Hours : "+this.hour+"\nMinutes : "+this.minute+"\nSeconds : "+this.second);
    }
}
class TimeDemo{
    public static void main(String[] args){
        Time t = new Time();
        t.setTime();
        t.displayTime();
    }
}