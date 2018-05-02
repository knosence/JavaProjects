package com.company;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Double> menuItems = new HashMap<>();

    public void displayMenu(){
        System.out.println("Please select an item from the menu:");
        for ( Map.Entry<String, Double> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + " costs $" + entry.getValue() + ".");
        }
    }

    public void addItemToMenu(String name, Double price){
        menuItems.put(name, price);
    }

    public double getItemPrice(String name) {
        return menuItems.get(name);
    }
}
