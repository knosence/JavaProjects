package com.company;

import java.util.Scanner;

public class Boiling {

    public static void main(String[] args){
        System.out.println("Enter Temperature to determine if the water is boiling: ");
        Scanner scan = new Scanner(System.in);

        int temp = scan.nextInt();
        if(temp >= 100){
            System.out.println("The water is boiling");
        } else {
            System.out.println("The water is not boiling");
        }
    }
}
