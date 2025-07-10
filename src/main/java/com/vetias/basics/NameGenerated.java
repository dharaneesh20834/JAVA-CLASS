
import java.util.Scanner;

public class NameGenerated {
    public static void main(String[]args) {
        System.out.println("enter your name:");
        System.out.println("enter your gender:");
        System.out.println("enter your qualification:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        String gender=scanner.next();
        String qualification=scanner.next();
        if("Male".equalsIgnoreCase(gender)){
            System.out.println("Mr."+name+","+qualification);
        }
        else{
            System.out.println("Ms."+name+","+qualification);
        }
        System.out.println(qualification);

    }

}

         