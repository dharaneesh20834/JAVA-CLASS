
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String>students=new HashMap<>();
        students.put(1001,"harinesh");
        students.put(1002,"hari");
        students.put(1003,"kani");
        students.put(1004,"dharanee");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }

}
