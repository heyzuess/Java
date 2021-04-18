import java.util.Calendar;

public class TestCalendar {
    public static void main (String[] args) {
        TestCalendar myApp = new TestCalendar();
        myApp.TestApp();
    }

    public void TestApp () {
        Calendar myCalendar = Calendar.getInstance();

        // Set time to Jan 7, 2004 at 13:40 pm (month is zero based)
        myCalendar.set(2004, 0, 7, 15, 40);

        // Convert to a large amount of miliseconds
        long lngDay1 = myCalendar.getTimeInMillis();

        // Add an hour's worth of milliseconds
        lngDay1 += 1000 * 60 * 60;

        // Update the time
        myCalendar.setTimeInMillis(lngDay1);

        // Output to console the hour of the day
        System.out.println("new hour " + myCalendar.get(Calendar.HOUR_OF_DAY));

        // Add 35 days to the date, which should move us into February
        myCalendar.add(Calendar.DATE, 35);

        // Output to console new date
        System.out.println("add 35 days " + myCalendar.getTime());

        // Roll 35 days onto current date. This rolls the date ahead 35 days but does
        // not change the month.
        myCalendar.roll(Calendar.DATE, 35);

        // Output to console new date
        System.out.println("roll 35 days " + myCalendar.getTime());

        // Setting the date to 1st of month
        myCalendar.set(Calendar.DATE, 1);

        // Output to console new date
        System.out.println("set to 1 " + myCalendar.getTime());
    }
}