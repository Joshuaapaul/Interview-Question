package com.lesson_1;

public class StarPattern {
    public static void main (String Args []){
        int n=5;
        int j;int i;
        for (i=1;i<=n;i++) {
            for (j = i; j <= n; j++) {
                System.out.print("   ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
        int x , y;
        x = 10;
        x++;
        --x;
        y = x++;
        System.out.println(x + " " + y);
    }


}
