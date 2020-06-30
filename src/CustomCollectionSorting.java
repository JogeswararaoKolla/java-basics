import java.util.*;

public class CustomCollectionSorting {
    public static void main(String[] args) {
        List<Student>  studs=new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,55));
        studs.add(new Student(4,65));
        studs.add(new Student(5,55));

        Collections.sort(studs,(s1,s2)->{
            return s1.marks<s2.marks?1:-1;
        });
  for(Student s :studs){
      System.out.println(s);
  }

    }
}

class Student {
    int rollno;
    int marks;

    public Student(int rollno,int marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
