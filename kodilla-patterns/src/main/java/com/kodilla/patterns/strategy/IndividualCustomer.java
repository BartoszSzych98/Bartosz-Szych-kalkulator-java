package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public non-sealed class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}