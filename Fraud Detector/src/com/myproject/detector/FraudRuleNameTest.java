package com.myproject.detector;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleNameTest {
    private FraudRuleName ruleName = new FraudRuleName();
    @Test
    public void testTraderName() {
        Trader traderT = new Trader("Pickachu", "Stockgolm");
        Trader traderF = new Trader("Bobrov", "Plotina");
        Transaction transactionT = new Transaction(traderT, 100);
        Transaction transactionF = new Transaction(traderF, 20);
        assertTrue(ruleName.isFraud(transactionT));
        assertFalse(ruleName.isFraud(transactionF));
    }
}
