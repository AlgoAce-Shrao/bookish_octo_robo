

// 1. lets compare the marks of students and sort them in ascending order

class Student{
    String name;
    int marks;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}


public class prac1{
    //will implement the comparator here
    Student st1=new Student("Shrao", 98);
    Student st2=new Student("Deb", 69);
    Student st3=new Student("Akash", 49);
    Student st4=new Student("Rudra", 100);


    // Comparator<Student> cmp=new Comparator<Student>() {
    //     @Override
    //     public int compare(Student s1,Student s2){
    //         return Integer.compare(s1.marks, s2.marks);
    //     }
    // };
}