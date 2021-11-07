package com.beniregev.designpatterns.behavioral_patterns.command;

/**
 * Concrete classes implementing the Order interface.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
