// Exercise 7: (1) Create the library according to the code fragments describing access and 
// Widget. Create a Widget in a class that is not part of the access package.

// Creating the Widget in a class that is not part of the access package. 
package Chapter6;

public class Widget {
    private String s;
  
  public Widget(String s) {
    this.s = s;
  }

  public String getS() {
    return s;
  }

  public void setS(String s) {
    this.s = s;
  }
}
