package com.myproject.detector;

class FraudRuleGermany implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        int amount = transaction.getAmount();
        String city = trader.getCity();
        if (city.equals("Germany") & amount > 1000) {
            return true;
        }
        return false;
    }
    @Override
    public String getRuleName() {
        return "FraudRuleGermany";
    }
}
