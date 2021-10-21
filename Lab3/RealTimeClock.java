package Lab3;

import java.util.*;

//Live clock program;
public class RealTimeClock { // Couldn't call the class clock since that class already exists;

    private Calendar calendar = Calendar.getInstance();
    private Time time = new Time(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE)); //Creates a time instance with real time as parameters;
    private long startTime = System.currentTimeMillis(); //The start time, when the clock has been instantiated;

    public void currentTime() {
        int startMinute = time.getMinute(); // Gets the current miniute

        while (time.getMinute() == startMinute) { // Comparing the current minute to the start minute;
            if ((System.currentTimeMillis() - startTime) >= 1000) { // If the current millisecond passes 1000 a second has passed;
                time.tick();
                startTime = System.currentTimeMillis();

                System.out.println(time.toString());
            }
        }
    }
}
