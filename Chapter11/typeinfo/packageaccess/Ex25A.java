package typeinfo.packageaccess;
import typeinfo.interfaceA.*;

class C implements A {
    public void f() {
        System.out.println("public C.f()"); }
    public void g() {
        System.out.println("public C.g()"); }
    void u() {
        System.out.println("package C.u()"); }
    protected void v() {
        System.out.println("protected C.v()"); }
    private void w() {
        System.out.println("private C.w()"); }
}
public class Ex25A {
    public static A makeA() { return new C(); }

}
