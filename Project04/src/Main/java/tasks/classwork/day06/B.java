package tasks.classwork.day06;

public class B {
    public static void main(String[] args) {
        A a = new A() {
            public int foo(int x) {
                int y = super.foo(5);
                System.out.println(y);
                return y;
            }
        };
        A b = new C();
        C c = new C();

//        method(new A() {
//            public int foo(int x) {
//                int y = super.foo(5);
//                System.out.println(y);}
//            });

            method(b, 2);

            method(c, 3);

        System.out.println(a.foo(3));
        c.foo(5);
        }

        public static void method (A a,int z){
            int d = a.foo(z);
        }

    }
