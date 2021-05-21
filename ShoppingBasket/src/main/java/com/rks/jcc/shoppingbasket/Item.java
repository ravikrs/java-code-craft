package com.rks.jcc.shoppingbasket;

public record Item(String name, int count, double unitPrice) {
    public double totalCost() {
        return count * unitPrice;
    }
}
