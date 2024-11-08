package com.myproject.detector;

public class Transaction {
    private Trader trader;
    private int amount;
    Transaction(Trader trader, int amount) {
        this.amount = amount;
        this.trader = trader;
    }

    public int getAmount() {
        return amount;
    }

    public Trader getTrader() {
        return trader;
    }
}
