package datetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class displaydate {

    public static void main(String args[]) {
        LocalDate date = LocalDate.now();

        String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.print(formattedDate);
    }
}