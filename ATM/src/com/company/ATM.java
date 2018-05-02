package com.company;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        //init Scanner
        Scanner scan = new Scanner(System.in);

        //init Bank
        Bank theBank = new Bank("Bank of NaDario");

        //add a user, which also creates a savings account
        User aUser = theBank.addUser("John", "Doe", "1234");

        //add checking account for out user
        Account newAccount = new Account("Checking", aUser, theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);

        User curUser;
        while (true){

            //stay in the login prompt until successful login
            curUser = ATM.mainMenuPrompt(theBank, scan);

            //stay in main menu until user quits
            ATM.printUserMenu(curUser, scan);
        }
    }

    public static User mainMenuPrompt(Bank theBank, Scanner scan){

        //inits
        String  userID;
        String pin;
        User authUser;

        //prompt the user for user ID/pin combo until a correct one is reached

        do{

            System.out.printf("%n%nWelcome to %s%n%n", theBank.getName());
            System.out.print("Enter user ID: ");
            userId = scan.nextLine();
            System.out.print("Enter pin: ");
            pin = scan.nextLine();

            //try to get the user object corresponding to the ID and pin combo
            authUser = theBank.userLogin(userID, pin);
            if()

        }while();
    }
}
