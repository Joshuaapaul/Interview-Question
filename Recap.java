package com.lesson_1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Recap {

    public static void main (String[]args) {
        // Data types : Primitive
       byte number = 39;
       short number1 = 276;
       int number2 = 7666;
       long number3 = 56657567L;
       float number4 = 677.89777f;
       char name = 'J';
       boolean TF = true;

        System.out.println(number);
        System.out.println(TF);

        // Reference data type : String,arrays,class,interface.
        //Arrays
        int[] numbers = new int [4];
        numbers[0] = 30;
        numbers[1] = 130;
        numbers[2] = 10;
        numbers[3] = 67;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);

        int[] numberss = {30,130,10,67};
        System.out.println(Arrays.toString(numberss));

        char names[] = {'a', 'b', 'c'};
        char names1[] = names.clone();
        int len = names.length;


        System.out.println(names);
        System.out.println(len);
        System.out.println(names1);

        int numbers1 [] = {'1','2','3'};
        int numbers2D [][] ={{'1','2','3','4'},{'5','6','7','8'}};
//refer youtube
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2D));

        //Strings

        String myname = "  joshua" + " paul";

        System.out.println(myname.length());
        System.out.println(myname.toUpperCase());
        System.out.println(myname);
        System.out.println(myname.trim());
        System.out.println(myname.startsWith(" "));

        // fixed value

        int ageofperson = 23;
        ageofperson = 25; //assigned new value

        System.out.println(ageofperson);

        final int ageofperson1 = 26; // fixed value
        System.out.println(ageofperson1);

        //Math operations

        byte num = 3;
        int num1 = 15;

        System.out.println(num * num1);
        System.out.println(num + num1);
        System.out.println(num - num1);
        System.out.println(num1 < num);
        System.out.println(num1 == num);

        int num2 = num+num1;
        num2 += 2; // adding 2 to the existing value or num2 = numb2+2;
        System.out.println(num2);
        num2 *= 2;
        System.out.println(num2);

        float num3 = (2+23) - 3 *2/4f;
        System.out.println(num3);

        // Logical operators
     int ageOfPerson = 17;
     boolean indiancitizen = true;

     System.out.println(ageOfPerson == 18 && indiancitizen == true); //& and = ture when both info is true
     System.out.println(ageOfPerson == 18 || indiancitizen == true); // | or = ture when ny info is true
     System.out.println(!indiancitizen == true);

     String nam = ageOfPerson >= 18 ? "eligible" : "not elegible"; // put ? after condition
     System.out.println(nam);

     int number5 = 6;
     ++number5;

     System.out.println(number5);

     int number6 =13;
     System.out.println(--number6);

     // math class

     int number7 = 20;
     int number8 = 23;
     float number9 = 31.4f;


     System.out.println(Math.abs(number7));
     System.out.println(Math.max(number7,number9));
     System.out.println(Math.ceil(number9));
     System.out.println(Math.floor(number9));

     // Scanner

     int number10;
     Scanner input = new Scanner(System.in);

     System.out.println("enter a number :");
     number10 = input.nextInt();

     System.out.println("the entered number is :" + number10);
     String Scanner = input.nextLine();


     String name2;

     Scanner input1 = new Scanner(System.in);
     System.out.println("enter a name");

     name2 = input.nextLine(); //input.nextline() for multiple opertaions

     System.out.println("hi, " + name2+" "+ name2.toUpperCase());

     // condition if, else, elseif etc

     int specialpen= 25;
     int pen = 10;
     int money = 16;
     Scanner input2 = new Scanner(System.in);
     money = input.nextInt();

     if(money>=specialpen) {
      System.out.println("you can buy the special pen");
     }
     else if(money>=pen) {
      System.out.println("you can buy the pen");
     }
     else {
      System.out.println("no money bruh");
     }

     // switch statements
     String name3 = "paul";
     Scanner input3 = new Scanner(System.in);
     name3 = input3.nextLine();

     switch (name3){
      case "paul":
       System.out.println("hello "+name3);
      case "sunil":
       System.out.println("hello "+name3);
      case "rishi":
       System.out.println("hello "+name3);
      default:
       System.out.println("sorry your name dosen't match the list");
     }

     //loops : for,while,dowhile,foreach

     for (int number11 = 4; number11>0;number11--){ //refer youtube
      System.out.println("love");
     }
     int number12 = 2;
     while (number12 > 0){
      System.out.println("peace");
      number12--;  // executes only when the condition is correct
     }
     int number13 = 4;
     do {
      System.out.println("joy");
      number13--;
     }while (number13>0);

     //for and for each for array

     String vegetables[] = {"carrot","beans","tomato"};
     for (int i =0; i<vegetables.length; i++) {
      System.out.println(vegetables[i]);
     }

     for(String vegetable : vegetables) {
      System.out.println(vegetable);
     }

     for (int i=vegetables.length-1; i>-1; i--) {
      System.out.println(vegetables[i]);
     }







    }

}
