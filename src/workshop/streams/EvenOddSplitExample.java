
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(10,11,12,13,14,10,11,71,81,19);
        Map<Boolean,List<Integer>>groupedMap=numbers.stream()
        .collect(Collectors.partitioningBy(no -> no%2==0));
        System.out.println("even number:"+groupedMap.get(true));
        System.out.println("odd number:"+groupedMap.get(false));

    }

}
