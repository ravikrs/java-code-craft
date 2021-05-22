package com.rks.jcc.shoppingbasket;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingBasketTest {

    @Test
    void testNullBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket(null);
        assertEquals(0, shoppingBasket.computeTotalItems());
        assertEquals(0.0, shoppingBasket.computeTotalPrice());
    }

    @Test
    void testEmptyBasket() {
        ShoppingBasket shoppingBasket = buildShoppingBasket();
        assertEquals(0, shoppingBasket.computeTotalItems());
        assertEquals(0.0, shoppingBasket.computeTotalPrice());
    }

    @Test
    void testTotalOfOneItem() {
        ShoppingBasket shoppingBasket = buildShoppingBasket((new Item("item1", 1, 3.50)));
        assertEquals(1, shoppingBasket.computeTotalItems());
        assertEquals(3.50, shoppingBasket.computeTotalPrice());
    }

    @Test
    void testTotalOfTwoItems() {
        ShoppingBasket shoppingBasket;
        shoppingBasket = buildShoppingBasket(new Item("item1", 2, 2.50), new Item("item2", 3, 5));
        assertEquals(5, shoppingBasket.computeTotalItems());
        assertEquals(20, shoppingBasket.computeTotalPrice());
    }

    private ShoppingBasket buildShoppingBasket(Item... items) {
        return new ShoppingBasket(Arrays.asList(items));
    }
}
