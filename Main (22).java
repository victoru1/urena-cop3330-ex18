/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class Main
{
  public static void main(String arg[]) {
    double f,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Press 1 to convert from Fahrenheit to Celsius.\nPress 2 to convert from Celsius to Farenheit.");

    System.out.println("Your choice: ");
    int ch=sc.nextInt();

    switch(ch) {
      case 1:  System.out.println("Please enter temperature in Farenheit: ");
        f=sc.nextDouble();
        c=(f-32)*5/9;
        System.out.printf("The temperature in Celsius is " + (int) c + ".");
        break;
      case 2:  System.out.println("Please enter temperature in Celsius: ");
        c=sc.nextDouble();
        f=((9*c)/5)+32;
        System.out.printf("The temperature in Farenheit is " + (int) f + ".");
       break;
     default:  System.out.println("Please choose valid choice.");
   }  
  } 
}