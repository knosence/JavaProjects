package com.company;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Celsius value to convert to fahrenheit: ");

        double celsius = scan.nextDouble();


        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("The Fahrenheit conversion for %g is %g: ",
                celsius,
                fahrenheit);

    }
}
