package datetime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class firday13 {

        public static void main(String[] args) {
            ArrayList<LocalDate> friday = new ArrayList<LocalDate>();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate firstDate=LocalDate.parse("01/01/2000",formatter);
            LocalDate lastDate=LocalDate.parse("31/12/2999",formatter);

            while(firstDate.isBefore(lastDate))
            {
                if(firstDate.getDayOfWeek()==DayOfWeek.FRIDAY && firstDate.getDayOfMonth()==13) {
                    friday.add(firstDate);
                }
                firstDate=firstDate.plusDays(1);
            }
            friday.forEach(System.out::println);
        }
    }