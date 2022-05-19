import java.util.*;
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class AgeComparator implements Comparator<Student>{
    public int compare(Student s, Student a){
        Student s1 = (Student)s;
        Student s2 = (Student)a;
        if(s1.age == s2.age) 
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorDemo{
    public static void main(String[] args){
        ArrayList<Student> sa = new ArrayList<Student>();
        sa.add(new Student("Kishan", 19));
        sa.add(new Student("Uttam", 18));
        sa.add(new Student("Karan", 17));
        Collections.sort(sa, new AgeComparator());
        Iterator<Student> itr = sa.iterator();
         while(itr.hasNext()){
             Student st = (Student)itr.next();
            System.out.println(st.name+ " : "+st.age);
        }
    }
}