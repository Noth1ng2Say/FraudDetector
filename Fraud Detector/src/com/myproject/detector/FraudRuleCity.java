package com.myproject.detector;

public class FraudRuleCity implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        int amount = transaction.getAmount();
        String city = trader.getCity();
        if (city.equals("Sidney")) {
            return true;
        }
        return false;
    }
    @Override
    public String getRuleName() {
        return "FraudRuleCity";
    }
}
