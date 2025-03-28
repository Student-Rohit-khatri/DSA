package com.rohit.Enum_example;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,sunday;
        //these are enum constants.
        //these are public,static and final
        // since it's final you can't create child enum
        //type is week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        System.out.println(week);
        System.out.println(week.ordinal());

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
