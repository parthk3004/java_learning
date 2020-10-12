package datetime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class today {


    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print(formatter.format(date));
        DayOfWeek day=date.getDayOfWeek();
        Month month=date.getMonth();
        int dt=date.getDayOfMonth();
        int year=date.getYear();
        System.out.print(day+", "+month+" "+dt+", "+year);


    }

}