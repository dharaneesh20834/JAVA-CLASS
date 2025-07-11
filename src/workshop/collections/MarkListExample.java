import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}
public class MarkListExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("harinesh", 85));
        students.add(new Student("hari", 72));
        students.add(new Student("imanual", 90));
        students.add(new Student("rohit", 65));
        students.add(new Student("bala", 78));
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("Ascending Order:");
        for (Student s : students) {
            System.out.println(s);
        }
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));
        System.out.println("\nDescending Order:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
