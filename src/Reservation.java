import java.time.DayOfWeek;

public class Reservation implements Reservable{
    private final String code;
    private final DayOfWeek dayOfWeek;
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public DayOfWeek getDay() {
        return dayOfWeek;
    }

    public Reservation(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 8;i++) {
            int index;
            do{
                index = (int)Math.floor(Math.random() * 43 + 48);
            }
            while ((index > 57 && index < 65));
            sb.append((char) (index));
        }
        code = sb.toString();
        int dayIndex = (int)Math.floor(Math.random()*7);
        dayOfWeek = DayOfWeek.values()[dayIndex];
    }

    @Override
    public String toString(){
        String day = dayOfWeek.name().substring(0,3);
        return "Booking# " + code + " for " + day;
    }
}
