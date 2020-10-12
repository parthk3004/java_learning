package datetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class days {

    private static String getDay(String day, int dayofweek) {
        switch (day.toUpperCase()) {
            case "SUNDAY":
                return getdayss(1 + dayofweek);
            case "MONDAY":
                return getdayss(2 + dayofweek);
            case "TUESDAY":
                return getdayss(3 + dayofweek);
            case "WEDNESDAY":
                return getdayss(4 + dayofweek);
            case "THURSDAY":
                return getdayss(5 + dayofweek);
            case "FRIDAY":
                return getdayss(6 + dayofweek);
            case "SATURDAY":
                return getdayss(7);
            default:
                return "Invalid day";
        }
    }

    private static String getdayss(int val) {

        switch (val % 7) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                return "null";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Date in format `DD/MM/YYYY` : ");
        try {
            String dt = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dt, formatter);
            int dayofyear = date.getDayOfYear();
            int dayofweek = dayofyear;
            while (dayofweek > 7) {
                dayofweek %= 7;
            }
            System.out.print("Day on 1st January: ");
            String day = sc.nextLine();
            String dayss = getDay(day, dayofweek - 1);
            System.out.println(dayss);
        } catch (DateTimeParseException e) {
            System.out.print("Entered date is not in a valid format.\n Please enter date in dd/mm/yyyy format");
        }
    }
}