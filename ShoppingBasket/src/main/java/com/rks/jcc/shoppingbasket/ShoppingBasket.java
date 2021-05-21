package com.rks.jcc.shoppingbasket;

import java.util.List;

public class ShoppingBasket {
    private final List<Item> items;

    public ShoppingBasket(List<Item> items) {
        this.items = items;
    }

    public int computeTotalItems() {
        if (items == null) {
            return 0;
        } else {
            return items.stream().mapToInt(Item::count).sum();
        }
    }

    public double computeTotalPrice() {
        if (items == null) {
            return 0;
        } else {
            return items.stream().mapToDouble(Item::totalCost).sum();
        }
    }


}
