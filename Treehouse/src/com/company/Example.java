package com.company;

public class Example {

    public static void main(String[] args){

        System.out.println("We are making a new PEZ Dispenser");

        PezDispenser dispenser = new PezDispenser("Yoda");

        System.out.printf("The dispenser is %s %n",
                dispenser.getCharacterName()
                );

        if(dispenser.isEmpty()){
            System.out.println("Dispenser is empty");
        }

        System.out.println("Filling the dispenser with delicious Pez...");
        dispenser.fill();

        if(!dispenser.isEmpty()){
            System.out.println("Dispenser is full");
        }

        while(dispenser.dispense()){
            System.out.println("Chump!");
        }

        if(dispenser.isEmpty()){
            System.out.println("OOPS!! we ate all the PEZ");
        }

        dispenser.fill(4);
        dispenser.fill(2);

        while (dispenser.dispense()){
            System.out.println("chump!!");
        }

        try {
            dispenser.fill(300);
            System.out.println("This will never happen");
        }catch (IllegalArgumentException iae){
            System.out.println("whoa there!");
            System.out.printf("The error was %s %n",
                    iae.getMessage());
        }
    }
}
