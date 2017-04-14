package com.company;

public class Main {

    public static void main(String[] args) {

        TimeHelper clock = new TimeHelper(24527247);

        String results = clock.inMinutes(clock.Time);
        String secondResults = clock.inHours(clock.Time);

        System.out.println(results);
        System.out.println(secondResults);

    }
}
