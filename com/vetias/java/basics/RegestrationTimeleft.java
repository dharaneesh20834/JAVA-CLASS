
import java.time.LocalTime;

public class RegestrationTimeleft {
    public static void main(String[]args) {
        LocalTime currentTime=LocalTime.now();
        LocalTime regestrationTime=LocalTime.of( 18 , 59 , 59 );
        int hoursleft=regestrationTime.getHour()-currentTime.getHour();
        int minuteleft=regestrationTime.getMinute()-currentTime.getMinute();
        int secondsleft=regestrationTime.getSecond()-currentTime.getSecond();
        System.out.println("you have "+hoursleft+" hours "+minuteleft+" minutes and "+secondsleft+" seconds left to register");
        
    }
}
