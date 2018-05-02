package com.company;

import java.util.Scanner;

public class Display {

    public static void main(String[] args) {

        Store walmart = new Store();
        Product drill = new Product("Drill", 25.50);
        walmart.setAvailableInventory(drill,3);

        Scanner scan = new Scanner(System.in);
        int userIntInput;
        Product userProductInput;

        System.out.println("Hello, and welcome to our store");
        do {
            System.out.println("What would you like to do? \n" +
                    "1 - view the contents of your cart \n2 - add items to your cart");

            userIntInput = scan.nextInt();

            if(userIntInput == 1){
                walmart.displayGetCart();
            } else if(userIntInput == 2){
                System.out.println("We have currently are stocked with : \n");
                walmart.showAvailableInventory();
                System.out.println("From the list above, what items would you like to add to your cart?\n");

                userProductInput = walmart.getItem(scan.next());
                System.out.println("How many?\n");
                userIntInput = scan.nextInt();

                if(walmart.getAvailableInventory().containsKey(userProductInput)
                        && walmart.getAvailableInventory().get(userProductInput) >= userIntInput) {
                    walmart.addItemsToCart(userProductInput, userIntInput);
                }
            }

        }while(userIntInput > 0);

    }

    public static void storeMenu(){

    }
}
