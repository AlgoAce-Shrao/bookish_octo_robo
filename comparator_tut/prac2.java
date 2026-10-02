import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + '}';
    }
}
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // return s1.getRollNumber() - s2.getRollNumber();
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }
}

class RollDescComparator implements  Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return Integer.compare(s2.getRollNumber(), s1.getRollNumber());
    }
}

public class prac2{
    public static void main(String args[]){
        List<Student> students=new ArrayList<>();

        students.add(new Student("Shrao", 2));
        students.add(new Student("Deb", 1));
        students.add(new Student("Akash", 9));
        students.add(new Student("Rudra", 3));

        System.out.println("Original list");
        System.out.println(students);
        System.out.println("After sorting by name");
        
        // sorting by name
        Collections.sort(students,new NameComparator());
        System.out.println(students);
        
        System.out.println("After sorting by rollnumber");
        Collections.sort(students,new RollNumberComparator());
        System.out.println(students);

        System.out.println("After sorting them by rollnumber in descending order");
        Collections.sort(students,new RollDescComparator());
        System.out.println(students);


        // lets implement custom comparator using anonymous comparator class and lambda expression 
        //sort by name in descencing order

        // Collections.sort(students, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student s1,Student s2){
        //         return s2.getName().compareTo(s1.getName());
        //     }
            
        // });
        
        //using lambda expression
        Collections.sort(students, (s1, s2) -> s2.getName().compareTo(s1.getName()));

        System.out.println("After sorting in descending order of name");
        System.out.println(students);
        



        // using comparator.comparing()
        // sort the students by their roll number in descnding order

        Comparator<Student> c=Comparator.comparing(Student::getRollNumber);
        // this returns a comparator and now sort the list by passing this comparator as a parameter
        students.sort(c);
        System.out.println("Students by ascending order of roll number  by using comparing function");
        System.out.println(students);
        
        // now descending order
        Comparator<Student> c1=Comparator.comparing(Student::getRollNumber).reversed();
        Collections.sort(students,c1);
        System.out.println("Students by descending order of roll number by using comparing function");
        System.out.println(students);


        // 💡If we need to do multi-level sorting then use this as well ...thenComparing()

        //lets sort the students by both name and roll number
        Comparator<Student> c2=Comparator.comparing(Student::getRollNumber).thenComparing(Student::getName);
        // note the difference b/w results by changing thr priority of sorting levels...
        Collections.sort(students,c2);
        System.out.println("The sorted list by name and roll number is :");
        System.out.println(students);


        // reverse and then comparing
        // lets sort by name in descending order  and roll number in ascending oredr
        Comparator<Student> c3=Comparator.comparing(Student::getName).reversed().thenComparing(Student::getRollNumber);
        Collections.sort(students,c3);
        System.out.println("sort by name in descending order  and roll number in ascending oredr");
        System.out.println(students);
        
    }


}

