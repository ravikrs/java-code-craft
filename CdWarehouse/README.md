## Functional Requirement
- Customers can buy CDs
- Customers can search on title and artist
- Record labels send batches of CDs to th warehouse
- customers can only order titles that are in stock
### Buy a cd
- CD is in stock - stock count is reduced by quantity
- Insufficient stock - throw an exception
### Search for a CD
- It's in catalogue - return the CD info
- No match - return nothing
- multiple matches - return list

### Receive stock from a label
- Single title that's in catalogue - add copies to that CD's stock
- Not in catalogue - add it and add copies to stock
- multiple cds - any new cds added to catalogue and stock added to each CD