package tasks.classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class Class11_2 {

    public static void main(String[] args) throws InterruptedException {

/*//        Thread thread = new Thread(()-> System.out.println("gfhjk"));
        Thread t1 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> {
                System.out.println("t1 " + i);
                Thread.yield();
            });
        });

        Thread t2 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t2 " + i));
        });
        Thread t3 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t3 " + i));
        });

//        thread.start();
        t1.start();
        t2.start();
        t3.start();*/

//        for (int i = 0; i < 5; i++) {
//            heavyMethod();
//        }

//        for (int i = 0; i < 5; i++) {
//            new Thread(()->{heavyMethod();}).start();
//        }

/*        Thread t1 = new Thread(()->heavyMethod());
        Thread t2 = new Thread(()->heavyMethod());
        Thread t3 = new Thread(()-> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });

        t1.start();
        t2.start();
        t3.start();*/

        /*new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s ", i);
            }
        }).start();


        for (int i = 0; i < 3; i++) {
            Thread.currentThread().sleep(1000);
            System.out.printf("t1-%s ", i);
        };
        */

/*        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock){
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s ", i);
            }}
        }).start();

        Thread.sleep(1000);

        synchronized (lock){
        for (int i = 0; i < 3; i++) {
            Thread.currentThread().sleep(1000);
            System.out.printf("t1-%s ", i);
        }};*/

        new Thread(() -> {
            syncMethod("t1 ");
        }).start();
        Thread.sleep(1000);
        syncMethod("m");
    }


    public static void heavyMethod() {

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));

    }

    public static synchronized void syncMethod(String threadName) {

        for (int i = 0; i < 3; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println("%s-%s", threadName,i);
        }

    }
}
