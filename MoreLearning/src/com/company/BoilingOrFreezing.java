package com.company;

import java.util.Scanner;

public class BoilingOrFreezing {

    public static void main(String[] args) {
        System.out.println("Enter Temperature to determine if the water is boiling: ");
        Scanner scan = new Scanner(System.in);

        int temp = scan.nextInt();
        if (temp >= 100) {
            System.out.println("The water is boiling");
        } else if(temp <= 0) {
            System.out.println("The water is Frozen");
        } else{
            System.out.println("The water is neither Boiling or Freezing");
        }

    }
}