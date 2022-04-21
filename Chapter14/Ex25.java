// Exercise 25: Create a class containing private, protected and package-access
// methods. Write code to access these methods from outside of the class’s package.

package Chapter14;
import typeinfo.interfaceA.*;
import typeinfo.packageaccess.*;
import java.lang.reflect.*;

public class Ex25 {
    public static void main(String[] args) throws Exception {
        A a = Ex25A.makeA();
        a.f();
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName)
            throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
// Output:
/*
public C.f()
public C.g()
package C.u()
protected C.v()
private C.w()

Process finished with exit code 0

 */

