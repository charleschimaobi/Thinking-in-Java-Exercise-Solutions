//Exercise 22 of chapter 5: Write a switch statement for the enum in the previous example. For 
//each case, output a description of that particular currency. 

public class Ex22 {
    enum Currency {
        FIVE, TEN, TWENTY, FIFTY, HUNDRED, THOUSAND
      }
    
      public static void main(String[] args) {
        for (Currency type : Currency.values()) {
          switch (type) {
            case FIVE:
              System.out.println(" 5 Naira ");
              break;
            case TEN:
              System.out.println(" 10 Naira ");
              break;
            case TWENTY:
              System.out.println(" 20 Naira ");
              break;
            case FIFTY:
              System.out.println(" 50 Naira ");
              break;
            case HUNDRED:
              System.out.println(" 100 Naira ");
              break;
            case THOUSAND:
              System.out.println(" 1,000 Naira ");
              break;
            default:
              break;
          }
        }
      }
    } 
    // Output:
    // 5 Naira 
    // 10 Naira 
    // 20 Naira
    // 50 Naira
    // 100 Naira
    // 1,000 Naira
