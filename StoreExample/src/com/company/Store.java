package com.company;

import java.util.HashMap;

import java.util.Map;

public class Store {

    private Map<Product, Integer> cart;

    private Map<Product, Integer> availableInventory;

    public Store(){
        cart = new HashMap<Product, Integer>();
        availableInventory = new HashMap<Product, Integer>();
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public Map<Product, Integer> getAvailableInventory() {
        return availableInventory;
    }

    public void showAvailableInventory() {
        availableInventory.forEach((key, value) -> {
            System.out.println("  -" +key.getName() + "\tQTY: " + value);
        });
    }
        public void displayGetCart(){
        System.out.println("You have " + this.getCart() + " currently in your Cart.");
    }

    public void setAvailableInventory(Product product, Integer qty) {
           this.availableInventory.put(product, qty);
        }


    public void addItemsToCart(Product key, int customerQuantity){
        if (availableInventory.get(key) == null){
            System.out.println(key.getName() + " is not available as an item.");
        } else if (availableInventory.get(key) == 0) {
            System.out.println(key.getName() + " is out of stock.");
        } else if (availableInventory.get(key) < customerQuantity) {
            System.out.println("Only have " + availableInventory.get(key) + " in stock of " + key.getName());
        } else {
            cart.put(key, customerQuantity);
            Integer itemCount = availableInventory.get(key) - customerQuantity;
            availableInventory.replace(key, itemCount);
        }
    }

    public Product getItem(String item){
        Product itemProduct = null;
        for(Product p : availableInventory.keySet()){
            if(availableInventory.containsKey(item)){
                itemProduct = p;
            }

        }
        return itemProduct;
    }

}
