package com.company;

/**
 * Created by chadbuehrle on 4/12/17.
 */
public class Count {
    public void count (){
        int i = 0;

        while (i <= 99) {

            if (i % 3 == 0 && i % 5 == 0) {
                String unifocus = "UniFocus";
                System.out.println(unifocus);
            }
            else if (i % 3 == 0) {
                String uni = "Uni";
                System.out.println(uni);
            }
            else if (i % 5 == 0) {
                String focus = "Focus";
                System.out.println(focus);
            }
            else {
                System.out.println(i);
            }
            i++;

        }
    }
}
