package com.lesson_1;

import java.util.Scanner;

public class PurchaseOffer {
    public static void main(String[] args) {
        int PurchasedAmount = 8000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Purchased Amount : ");
        PurchasedAmount = input.nextInt();
        if(PurchasedAmount >= 20000){
            System.out.println("Free Trolley Suitcase");
        }
        else if (PurchasedAmount >= 10000){
            System.out.println("Free Travel Bag");
        }
        else if (PurchasedAmount>=5000){
            System.out.println("Free BackPck");
        }
        else {
            System.out.println("Collect money even for cover we give");
        }
    }
}
