package com.myproject.detector;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleCityTest {
    private FraudRuleCity ruleCity = new FraudRuleCity();
    @Test
    public void testTraderCity() {
        Trader traderT = new Trader("Grisha", "Sidney");
        Trader traderF = new Trader("Misha", "Kazan");
        Transaction transactionT = new Transaction(traderT, 100);
        Transaction transactionF = new Transaction(traderF, 20);
        assertTrue(ruleCity.isFraud(transactionT));
        assertFalse(ruleCity.isFraud(transactionF));
    }
}
