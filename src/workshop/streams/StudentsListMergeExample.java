
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentsListMergeExample {
    public static void main(String[]args) {
        List<Integer> csRollNos=Arrays.asList(1001,1002,1003,1004,1005);
        List<Integer> csaRollNos=Arrays.asList(1212,1313,1414,1515,1616);
        List<Integer> allRollNos=Stream.concat(csRollNos.stream(),csaRollNos.stream()).sorted().toList();
        System.out.println(allRollNos);
    }

}
