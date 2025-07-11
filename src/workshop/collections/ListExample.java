
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

        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());

        System.out.println(names);
        
        }
    }










//method 1 for line 20
//names.sort(Comparator.reverseOrder());
  //for (int i = 0; i < 6; i++) {
    //System.out.println(names.get(i));
            
//method 2 for line 16
 //names.forEach(System.out::println);
 //  names.sort(Comparator.reverseOrder());