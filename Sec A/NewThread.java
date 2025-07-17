class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name); 
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted: " + e);
        }
        System.out.println("Exiting thread: " + name);
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Tom");
        NewThread ob2 = new NewThread("Jerry");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Suspended Tom for a few seconds");

            Thread.sleep(1000);
            ob2.mySuspend();
            System.out.println("Suspended Jerry for a few seconds");

            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resumed Tom");

            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Resumed Jerry");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        // Wait for threads to finish
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted: " + e);
        }

        System.out.println("Main thread exiting.");
    }
}
