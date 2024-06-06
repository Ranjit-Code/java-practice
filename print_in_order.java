import java.lang.*;

class Foo {

    public Foo() {
        
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String args[]){
        Foo foo = new Foo();

    }
}

class printFirst implements Runnable {
    public void run(){
        System.out.println("first");
    }
}

class printSecond implements Runnable {
    public void run(){
        System.out.println("second");
    }
}


class printThird implements Runnable {
    public void run(){
        System.out.println("third");
    }
}