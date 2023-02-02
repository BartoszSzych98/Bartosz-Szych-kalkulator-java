package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;

public non-sealed class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}