package com.myproject.detector;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleGermanyTest {
    private FraudRuleGermany ruleGermany = new FraudRuleGermany();
    @Test
    public void testTraderGermany() {
        Trader traderT = new Trader("Grisha", "Germany");
        Trader traderF = new Trader("Misha", "Germany");
        Transaction transactionT = new Transaction(traderT, 1001);
        Transaction transactionF = new Transaction(traderF, 20);
        assertTrue(ruleGermany.isFraud(transactionT));
        assertFalse(ruleGermany.isFraud(transactionF));
    }
}
