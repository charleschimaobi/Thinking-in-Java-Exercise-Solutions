// Exercise 21 of chapter 5.
// (1)Create an enum of the least-valuable six types of paper currency. Loop
// through the values() and print each value and its ordinal().
public class Ex21 {
    enum paperCurrency {
        FIVE, TEN, TWENTY, FIFTY, HUNDRED, THOUSAND
      }
    
      public static void main(String[] args) {
        for (paperCurrency type : paperCurrency.values()) {
          System.out.println(type + " Has the ordinal of " + type.ordinal());
        }
      }
    }
  // Output:
  // FIVE Has the ordinal of 0
  // TEN Has the ordinal of 1
  // TWENTY Has the ordinal of 2
  // FIFTY Has the ordinal of 3
  // HUNDRED Has the ordinal of 4
  // THOUSAND Has the ordinal of 5 

