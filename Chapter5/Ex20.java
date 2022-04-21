//Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) 
//syntax. Print all the elements in the resulting args array. Test it with various numbers of 
//command-line arguments.
public class Ex20 {
    public static void main(String[] args) {
        TestVarargs.main("Testing Varargs");
        TestVarargs.main("Charles", "Chimaobi");
        TestVarargs.main("Exercise20", "Chapter5");
        TestVarargs.main("Constructor", "and", "Initialization");
      }
    }
    
    class TestVarargs {
      public static void main(String... args) {
        for (String s : args) {
          System.out.println(s);
        }
      }
    }
  // Output:
  // Testing Varargs
  // Charles
  // Chimaobi
  // Exercise20
  // Chapter5
  // Constructor
  // and
  // Initialization

