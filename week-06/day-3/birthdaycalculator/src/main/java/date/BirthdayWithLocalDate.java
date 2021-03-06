package date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        return LocalDate.parse(str);
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        return  date.getMonthValue() + ". " + date.getDayOfMonth() + ".";
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        boolean b = date.equals (LocalDate.now());
        return b;
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        int c = LocalDate.now().getYear () - birthday.getYear();
        // TODO - return how many years age the input date 'birthday' was
        return c;
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        if (date.getDayOfYear () == LocalDate.now().getDayOfYear ()){
            return 0;
        }else if (date.getDayOfYear () > LocalDate.now ().getDayOfYear ()){
            return date.getDayOfYear () - LocalDate.now ().getDayOfYear ();
        }else {
            return 365 - (LocalDate.now ().getDayOfYear () - date.getDayOfYear ());
        }
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
    }

    public static void main(String[] args) {
        new BirthdayWithLocalDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}