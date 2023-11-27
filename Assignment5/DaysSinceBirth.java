package Assignment5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Day {

    private int year;
    private int month;
    private int day;

    public Day(int aYear, int aMonth, int aDay){
        year = aYear;
        month = aMonth;
        day = aDay;
    }
    
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public static long daysInBetween(Day start, Day end){
        LocalDate startDate = LocalDate.of(start.getYear(), start.getMonth(), start.getDay());
        LocalDate endDate = LocalDate.of(end.getYear(), end.getMonth(), end.getDay());
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

}

public class DaysSinceBirth {
    public static void main(String[] args) {
        
        Day birthDate = new Day(2001, 5, 4);

        LocalDate currentDate = LocalDate.now();
        Day today = new Day(currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());

        long DaysSinceBirth = Day.daysInBetween(birthDate, today);

        System.out.println("These are the number of days that have passsed since the day I was born: " +DaysSinceBirth);
    }

    
    
}
