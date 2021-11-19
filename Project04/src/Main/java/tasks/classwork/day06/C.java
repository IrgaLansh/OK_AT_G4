package tasks.classwork.day06;

public class C extends A {
    public int foo(int x){
        int y = super.foo(5);
        System.out.println(y);
        return y;
    }

}
