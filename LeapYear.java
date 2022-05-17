package com.lesson_1;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int year =2016;
        //for(year=1900;year<=2020;year++){
            if ((year % 400 ==0) || (year % 4 == 0 && year % 100 !=0)){
                System.out.println("12.09."+year);
            }
            else {
                System.out.println("13.09."+year);
            }
       // }
    }
}
