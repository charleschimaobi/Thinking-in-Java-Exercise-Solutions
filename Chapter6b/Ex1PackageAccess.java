// Creating an instance of the class outside of that package.

import Chapter6.Ex1; // calling the class from the package
public class Ex1PackageAccess {
    public static void main(String[] args) throws Exception {
        Ex1 c = new Ex1(); // An instance of the class in the package
    }
}