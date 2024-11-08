package com.myproject.detector;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    private List<FraudRule> rules = new ArrayList<FraudRule>();
    private void list() {
        rules.add(new FraudRuleName());
        rules.add(new FraudRuleAmount());
        rules.add(new FraudRuleCity());
        rules.add(new FraudRuleGermany());
    }



    FraudDetectionResult isFraud(Transaction transaction) {
        return rules.stream()
                .filter(fraudRule -> fraudRule.isFraud(transaction))
                .findFirst()
                .map(this::buildFraudResult)
                .orElse(buildNotFraudResult());
    }

    private FraudDetectionResult buildNotFraudResult() {
        return new FraudDetectionResult(false, null);
    }

    private FraudDetectionResult buildFraudResult(FraudRule fraudRule) {
        return new FraudDetectionResult(true, fraudRule.getRuleName());
    }
}

