package com.beniregev.designpatterns.behavioral_patterns.command;

/**
 * Concrete classes implementing the Order interface.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
