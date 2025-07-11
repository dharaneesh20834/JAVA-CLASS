
import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("hari");
        names.add("harinesh");
        names.add("bala");
        names.add("balasree");
        names.add("navi");
        names.add("rohit");
        names.add("santhosh");
        names.add("sankar");
        names.stream()
        .filter(name->name.startsWith("S")|| name.startsWith("s"))
         .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
