package com.myproject.detector;

public class FraudRuleAmount implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        int amount = transaction.getAmount();
        if (amount > 1000000) {
            return true;
        }
        return false;
    }
    @Override
    public String getRuleName() {
        return "FraudRuleAmount";
    }
}
