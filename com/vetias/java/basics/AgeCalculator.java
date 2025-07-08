
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[]args) {
        Scanner inputScanner = new Scanner(System.in);
        int YearofBirth=inputScanner.nextInt();
        int currentYear=LocalDate.now().getYear();
        System.out.println(YearofBirth-currentYear);
        
        
    }

}
