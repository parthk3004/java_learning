package datetime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class alivedays {


        public static void main(String[] args) {
            LocalDate startDate = LocalDate.parse("1998-04-30");
            LocalDate today = LocalDate.now();
            Period period = Period.between(startDate, today);
            System.out.print(period.getYears()*365+period.getMonths()*30);
        }

    }