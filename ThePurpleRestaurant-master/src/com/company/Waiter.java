package com.company;

import java.util.Map;

public class Waiter implements PayableWithTip {


    private double tipAmount;
    private double totalWithTip;
    private double bill;
    private double changeAmount;
    private double amountPaid;

    public Waiter(){

    }

    public Waiter(double bill) {
        this.bill = bill;
    }

    public void takeOrder (double price){
        bill += price;
    }

    public void addTipToTotal(double tipAmount) {
        this.tipAmount = tipAmount;
      this.totalWithTip = this.bill + tipAmount;
    }


    public double getTotalAmountToBePaid() {
        return bill;
    }

    public double getTipAmount() {
        return tipAmount;
    }

    public double getTotalWithTip() {
        return totalWithTip;
    }

    public double payBill(double amount) {
        this.amountPaid = amount;
        changeAmount = this.amountPaid - totalWithTip;
        return changeAmount;
    }

    public double getChangeAmount() {
        return changeAmount;
    }

//    public void displayBillBeforeTip(){
//        System.out.println("Your bill is: $" + getBillAmount());
//    }

    public void displayBillAfterTip(){
        System.out.println("Your bill after tip is $" + getTotalWithTip());
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String toString(){
        return "Your bill with tip was $" + getTotalWithTip() + ".\n"  +
                "You paid $" + getAmountPaid() + ".\n" +
                "Your change is $" + getChangeAmount() +
                "\n***********************************\n";


    }
}
