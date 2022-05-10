package java_class_demo;

public class my_thread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        myRunnable r1 = new myRunnable(); //新建一个接口
        Thread t2 = new Thread(r1);


        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.printf(Thread.currentThread().getName()+"-"+i+"\n");
    }
}
class myRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.printf(Thread.currentThread().getName()+"-"+i+"\n");
    }
}