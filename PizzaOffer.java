package com.lesson_1;

import javax.swing.*;
import java.util.Scanner;

public class PizzaOffer {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String DayOfTheWeek = "Tuesday";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day : ");
        DayOfTheWeek = input.nextLine();

       switch(DayOfTheWeek){
           case "Sunday":
               System.out.println("Free Personal Pizza on purchase of medium Pizza");
               break;
           case "Monday":
               System.out.println("Rs.101 OFF on a bill of Rs.400 and above");
               break;
           case "Tuesday":
               System.out.println("Free Plain Garlic Bread on another medium pizza");
               break;
           case "Wednesday":
               System.out.println("Buy 1 Get 1 Free on any medium pizza");
               break;
           case "Thursday":
               System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
               break;
           case "Friday":
               System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
               break;
           case "Saturday":
               System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
       }
    }



}
