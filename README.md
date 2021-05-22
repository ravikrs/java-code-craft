# java-code-craft
TDD:
- start by writing a failing test. Test is a specification
- write the simplest code to pass the test
- refactor the code. e.g. remove duplication, design, etc.
## Requirements
- Java 16
- Maven 3.6.0
## Shopping Basket
Pointers:
- code smell `Feature envy`: When an object accesses fields of another object to execute some operation, instead of just
  telling the object what to do. e.g. _ShoppingBasket_ was doing `computeTotalPrice` by multiplying `Items::count` and
  `Items::unitPrice`. So moved this computation from _ShoppingBasket_ to _Item_ class i.e. `ITEM::totalCost`.
- In TDD's refactoring step: refactored _ShoppingBasketTest_ class to introduce `buildShoppingBasket` method to 
  build _Item_ objects. i.e. **remove duplication**.

## DVD Library
Pointers:
- It works better when we start with assertion first, then build setup for the test.
- See the test assertion fail and then fix the test to pass. More confidence in unit tests as regression test. 
- Tests should fail for a single reason. May cause duplication in test code. Try to move test setup to either constructor
  or setup method.
- code smell `message chain`: When one object requests another object which requests another object and so on. Use Hide
  Delegate refactoring technique. e.g. Library -> getMovieDvd -> getCopyCount. So don't expose Movie inside Library.
  Rather expose use delegate method getMovieDvdCount inside Library. Another option is to use Extract method to move
  functionality to the beginning of the chain. E.g. Library maintains the number of dvd copies and return when asked 
  (instead of having copies field inside MovieDvd class)

## CD Warehouse

## Links
- [Java Code Craft Youtube playlist from Codemanship](https://www.youtube.com/playlist?list=PL1tIFPlmF4ymILyzmcQmimv7RHBlY3N15)
- [Code refactoring](https://refactoring.guru/)
