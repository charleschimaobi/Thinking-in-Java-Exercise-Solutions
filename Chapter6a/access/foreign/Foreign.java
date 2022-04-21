package access.foreign;
import access.local.*;
public class Foreign {
    public static void main(String[] args) { 
        PackagedClass pc = new PackagedClass(); 
        } 
}
// Error generated when you hover your cursor over the PackagedClass:
// "The type PackagedClass is not visible"

// The compiler generates an error in this case because, the PackagedClass is not a public class,
// hence its type is not visible.
// To solve this problem, the PackagedClass should either be made public or 
// the Foreign class made part of the access.local package.  