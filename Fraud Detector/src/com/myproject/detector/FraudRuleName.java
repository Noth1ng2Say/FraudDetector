package com.myproject.detector;

public class FraudRuleName implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String name = trader.getFullName();
        if (name.equals("Pickachu")) {
            return true;
        }
        return false;
    }
    @Override
    public String getRuleName() {
        return "FraudRuleName";
    }
}
