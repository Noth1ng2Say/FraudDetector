package com.myproject.detector;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName) {
        fraud = this.fraud;
        ruleName = this.ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }
    public String FraudDetectionResult() {
        return ruleName;
    }
}
