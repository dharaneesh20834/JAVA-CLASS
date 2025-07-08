
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator1 {
    public static void main(String[] args) {
        Scanner inpuScanner=new Scanner(System.in);
        System.out.println("Enter your date of birth(YYYY:MM:DD):");
        String dateofBirth=inpuScanner.nextLine();
        LocalDate BirthDate=LocalDate.parse(dateofBirth);
        int YearofBirth=BirthDate.getYear();
        int currentYear=LocalDate.now().getYear();
    }

}
