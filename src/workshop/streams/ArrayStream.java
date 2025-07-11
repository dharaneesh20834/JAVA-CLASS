
import java.util.Arrays;


public class ArrayStream {
    public static void main(String[] args) {
        int[]marks={90,98,100,34,80};
        long numberofSubjectsPassed=Arrays.stream(marks)
        .filter(mark->mark>40).count();
        System.out.println(numberofSubjectsPassed);

       // IntStream markStream=Arrays.stream(marks);
        //numberofSubjectsPassed=markStream
        //.filter(mark->marks>40).count();
    }
}
