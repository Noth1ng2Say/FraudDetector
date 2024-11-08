package com.myproject.detector;

public interface FraudRule {
    boolean isFraud(Transaction transaction);
    String getRuleName();
}
