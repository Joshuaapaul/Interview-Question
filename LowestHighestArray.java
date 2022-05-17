package com.lesson_1;

import java.util.Arrays;

public class LowestHighestArray{
    public static void main(String[] args) {
        int array [] ={10 ,5, 20, 20, 4, 5, 2, 25, 1};
        int max = array[0];
        int min = array[0];
        int maxCount=0;
        int minCount=0;

        for(int i=0; i<array.length; i++){
            if (array[i]>max) {
                max = array[i];
                maxCount++;
                if (array[i]<min) {
                    min = array[i];
                    minCount++;
                }
            }
            }
        System.out.println("The highest number is "+maxCount);
        System.out.println("The lowest number is "+minCount);

            }

    }

