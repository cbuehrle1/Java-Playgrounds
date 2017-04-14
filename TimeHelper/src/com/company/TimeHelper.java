package com.company;

/**
 * Created by chadbuehrle on 4/12/17.
 */
public class TimeHelper {

    int Time;

    public TimeHelper (int time) {
        Time = time;
    }

    public String inMinutes (int time) {

        int result = 0;
        int seconds = 0;

        if ( time % 60 == 0 ) {
            result = time / 60;
        }
        else {
            seconds = time % 60;
            result = time - seconds;

            if (result < 1) {
                return "Seconds: " + time;
            }

            result = result / 60;
        }

        return "Minutes: " + result + " Seconds: " + seconds;
    }

    public String inHours (int time) {

        int hours = 0;
        int minutes = 0;
        int placeholder = 0;
        int seconds = 0;

        if ( time % 60 == 0 ) {
            minutes = time / 60;
        }
        else {
            seconds = time % 60;
            minutes = time - seconds;

            if (minutes < 1) {
                return "Seconds: " + time;
            }

            minutes = minutes / 60;
        }

        if (minutes % 60 == 0) {
            hours = minutes / 60;
        }
        else {
            placeholder = minutes % 60;
            placeholder = minutes - placeholder;

            if (placeholder < 1) {
                return "Minutes: " + minutes + " Seconds: " + seconds;
            }

            hours = placeholder / 60;
            minutes = minutes - placeholder;

        }

        return "Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds;
    }
}
