package com.myproject.detector;
import org.junit.*;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    private FraudDetector detector = new FraudDetector();
    @Test
    public void testTraderName() {
        Trader traderT = new Trader("Pickachu", "Stockgolm");
        Trader traderF = new Trader("Bobrov", "Plotina");
        Transaction transactionT = new Transaction(traderT, 100);
        Transaction transactionF = new Transaction(traderF, 20);
      //  assertTrue(detector.isFraud(transactionT));
       // assertFalse(detector.isFraud(transactionF));
    }
    @Test
    public void testTransactionAmount() {
        Trader trader = new Trader("Bobrov", "Plotina");
        Transaction transaction1 = new Transaction(trader, 100);
        Transaction transaction2 = new Transaction(trader, 1000001);
      //  assertFalse(detector.isFraud(transaction1));
      //  assertTrue(detector.isFraud(transaction2));
    }
    @Test
    public void testTraderCity() {
        Trader traderT = new Trader("Grisha", "Sidney");
        Trader traderF = new Trader("Misha", "Kazan");
        Transaction transactionT = new Transaction(traderT, 100);
        Transaction transactionF = new Transaction(traderF, 20);
      //  assertTrue(detector.isFraud(transactionT));
      //  assertFalse(detector.isFraud(transactionF));
    }
    @Test
    public void testTraderGermany() {
        Trader traderT = new Trader("Grisha", "Germany");
        Trader traderF = new Trader("Misha", "Germany");
        Transaction transactionT = new Transaction(traderT, 1001);
        Transaction transactionF = new Transaction(traderF, 20);
       // assertTrue(detector.isFraud(transactionT));
      //  assertFalse(detector.isFraud(transactionF));
    }
}
