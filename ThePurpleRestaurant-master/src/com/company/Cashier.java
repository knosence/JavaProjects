package com.company;



public class Cashier implements Payable {

    private double bill;
    private double changeAmount;
    private double amountPaid;

    public Cashier() {
    }

    public Cashier(double bill, double amountPaid) {
        this.bill = bill;
        this.changeAmount = changeAmount;
        this.amountPaid = amountPaid;
        payBill(amountPaid);
    }

    public void takeOrder (double price){
        bill += price;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getTotalAmountToBePaid() {
        return bill;
    }


    public double getChangeAmount() {
        return changeAmount;
    }

    public double payBill(double amount) {
        changeAmount = amount - bill;

        return changeAmount;
    }
    public String toString(){
        return "Your bill is: $" + getTotalAmountToBePaid() +
                "\nYou paid: $" + getAmountPaid() +
                "\nYour change is: $" + getChangeAmount();
    }
}
