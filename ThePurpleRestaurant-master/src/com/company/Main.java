package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) {

        Menu outback = new Menu();
        Menu chickfila = new Menu();

        outback.addItemToMenu("Steak", 19.00d);
        outback.addItemToMenu("Blooming Onion", 10.00d);
        outback.addItemToMenu("Caesar Salad", 6.25d);
        outback.addItemToMenu("Beer", 4.50d);
        outback.addItemToMenu("Soda", 1.99d);

        chickfila.addItemToMenu("Chick'n Minis", 5.99);
        chickfila.addItemToMenu("8-count Nugget",6.99);
        chickfila.addItemToMenu("Chicken Sandwich", 5.99);
        chickfila.addItemToMenu("Lemonade", 1.75);
        chickfila.addItemToMenu("Sweet Tea",1.75);


       Waiter w = new Waiter();
//        w.displayBillBeforeTip();
//        w.addTipToTotal(5);
//        System.out.println("You added a tip of $" + w.getTipAmount());
//        w.payBill(40);
//        System.out.println(w.toString());
//
        Cashier c = new Cashier();
//        System.out.println(c.toString());

        try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))) {

            boolean continueToMenu = true;
            int restaurantSelection;
            // Selecting restaurant
            do {
                System.out.println("Which restaurant would you like to visit? \n" +
                        "1 for Chick-fil-A \n" +
                        "2 for Outback Steakhouse \n");
                String restaurant = customer.readLine();
                restaurantSelection = Integer.parseInt(restaurant);

                if (restaurantSelection == 1) {
                    System.out.println("You have selected Chick-fil-A.\n");
                    continueToMenu = false;
                } else if (restaurantSelection == 2) {
                    System.out.println("You have selected Outback Steakhouse.\n");
                    continueToMenu = false;
                } else {
                    System.out.println("Selection not valid");
                }
            } while(continueToMenu);

            // Viewing menu based upon selected restaurant
            if (restaurantSelection == 1) {
                boolean finished = true;
                do {
                    // view menu
                    chickfila.displayMenu();
                    // add order method
                    String itemSelection = customer.readLine();
                    c.takeOrder(chickfila.getItemPrice(itemSelection));
                    System.out.println("Will that complete your order? (Y or N)");
                    String orderCompletion = customer.readLine();
                    if(orderCompletion.equalsIgnoreCase("Y")){
                        finished = false;
                    }
                }while(finished);
                System.out.println( "Your total is $" + c.getTotalAmountToBePaid());

                //Ask customer for cash
                System.out.println("Please insert cash payment. (Format = 00.00)");
                String cashFromCustomer = customer.readLine();
                double cashAmount = Double.parseDouble(cashFromCustomer);
                System.out.println("You paid $" + cashAmount + ".\n" + "Your change is $" + c.payBill(cashAmount));

            } else if (restaurantSelection == 2) {
                boolean finished = true;
                do {
                    // view menu
                    outback.displayMenu();
                    // add order method
                    String itemSelection2 = customer.readLine();
                    w.takeOrder(outback.getItemPrice(itemSelection2));
                    System.out.println("Will that complete your order? (Y or N)");
                    String orderCompletion = customer.readLine();
                    if(orderCompletion.equalsIgnoreCase("Y")){
                        finished = false;
                    }
                }while(finished);
                //Present Total to Customer
                System.out.println( "Your total is $" + w.getTotalAmountToBePaid() + "\n");

                //Ask Customer to Add tip
                System.out.println("How much would you like to tip? (Format = 00.00)");
                String tipFromCustomer = customer.readLine();
                double tipToAddToBill = Double.parseDouble(tipFromCustomer);
                w.addTipToTotal(tipToAddToBill);

                //Display Total with Tip
                System.out.println("Your bill after tip is $" + w.getTotalWithTip());

                //Ask customer for cash
                System.out.println("Please insert cash payment. (Format = 00.00)");
                String cashFromCustomer = customer.readLine();
                double cashAmount = Double.parseDouble(cashFromCustomer);
                System.out.println("You paid $" + cashAmount + ".\n" + "Your change is $" + w.payBill(cashAmount));

            }
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
