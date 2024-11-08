package com.myproject.detector;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleAmountTest {
    private FraudRuleAmount ruleAmount = new FraudRuleAmount();
    @Test
    public void testTransactionAmount() {
        Trader trader = new Trader("Bobrov", "Plotina");
        Transaction transaction1 = new Transaction(trader, 100);
        Transaction transaction2 = new Transaction(trader, 1000001);
        assertFalse(ruleAmount.isFraud(transaction1));
        assertTrue(ruleAmount.isFraud(transaction2));
    }
}
