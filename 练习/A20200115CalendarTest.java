import java.time.*;

/**
 * This program demonstrates calendar.
 * 打印当天所在的这个月的日历，并在今天的日期上加上*
 * @author chengcai
 * @version 1.0 2020.01.15
 */

public class A20200115CalendarTest{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);   // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1=Monday,...7=Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}