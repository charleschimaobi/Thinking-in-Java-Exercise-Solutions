// Exercise 7: (1) Create the library according to the code fragments describing access and 
// Widget. Create a Widget in a class that is not part of the access package.


import Chapter6.Widget;
public class Ex7 {
    
        public static void main(String[] args) {
          Widget w = new Widget("Widget");
          System.out.println(w.getS());
          w.setS("Next Widget");
          System.out.println(w.getS());
    }
} 
