package com.company;

public interface PayableWithTip extends Payable {

    public void addTipToTotal(double tipAmount);
}
