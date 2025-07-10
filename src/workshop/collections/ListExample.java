
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("hari");
        names.add("harinesh");
        names.add("bala");
        names.add("balasree");
        names.add("navi");
        names.add("rohit");

        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(names.get(i));
            
        }
    }

}
