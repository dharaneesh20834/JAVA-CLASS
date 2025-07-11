
import java.util.ArrayList;
import java.util.List;

public class NameStarts {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("hari");
        names.add("harinesh");
        names.add("bala");
        names.add("balasree");
        names.add("navi");
        names.add("rohit");
        names.add("santhosh");
        long nameCount=names.stream().filter(name ->name.startsWith("s ")).count();
        System.out.println(nameCount);
}
}