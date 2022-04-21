

public class Ex12 {
    public static void main(String[] args) { 
        int a = -1; 
        System.out.println(Integer.toBinaryString(a)); 
        a >>>= 5; 
        System.out.println(Integer.toBinaryString(a)); 
        long g = -1; 
        System.out.println(Long.toBinaryString(g)); 
        g >>>= 8; 
        System.out.println(Long.toBinaryString(g)); 
        short o = -1; 
        System.out.println(Integer.toBinaryString(o)); 
        o >>>= 12; 
        System.out.println(Integer.toBinaryString(o)); 
        byte c = -1; 
        System.out.println(Integer.toBinaryString(c)); 
        c >>>= 6; 
        System.out.println(Integer.toBinaryString(c)); 
        c = -1; 
        System.out.println(Integer.toBinaryString(c)); 
        System.out.println(Integer.toBinaryString(c>>>5)); 
        } 
}
// Output:
// 111111111111111111111111111
// 1111111111111111111111111111111111111111111111111111111111111111
// 11111111111111111111111111111111111111111111111111111111        
// 11111111111111111111111111111111
// 11111111111111111111111111111111
// 11111111111111111111111111111111
// 11111111111111111111111111111111
// 111111111111111111111111111
