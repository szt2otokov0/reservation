import java.time.DayOfWeek;
import java.util.Random;

public class Reservation implements Reservable{
    private String code;
    private DayOfWeek dayOfWeek;
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public DayOfWeek getDay() {
        return dayOfWeek;
    }

    public Reservation(){
        code = "";
        for(int i = 0; i < 8;i++) {
            code += (char) (Math.random() * 43 + 48);
        }

    }
}
