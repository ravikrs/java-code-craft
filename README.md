# java-code-craft

## Shopping Basket
Note that:
- `Feature envy` code smell: When an object accesses fields of another object to execute some operation, instead of just
  telling the object what to do. e.g. _ShoppingBasket_ was doing `computeTotalPrice` by multiplying `Items::count` and
  `Items::unitPrice`. So moved this computation from _ShoppingBasket_ to _Item_ class i.e. `ITEM::totalCost`.
- In TDD's refactoring step: refactored _ShoppingBasketTest_ class to introduce `buildShoppingBasket` method to 
  build _Item_ objects. i.e. **remove duplication**
