import java.util.*;
class Chris {
    public static void main(String[] args) {
        Thread[] jobs = new Thread[]{new MyThread(), new MyThread(), new MyThread()};
        //new Thread[]{new Thread(new Job()), new Thread(new Job()), new Thread(new Job())};
        for (Thread job: jobs) 
            job.start();
    }
}
class Job implements Runnable {
    private String name;
    static int Count = 0;
    public Job() {
        this.name = "Job " + Job.Count++;
    }
    //@Override
    public synchronized void run() {
        synchronized(this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + ": " + i);
                try { Thread.sleep(10); } catch (Exception e) {}
            }
        }
    }
}
class MyThread extends Thread {
    private String name;
    static int Count = 0;
    public MyThread() {
        this.name = "Job " + Job.Count++;
    }
    @Override
    public void run() {
        synchronized(this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + ": " + i);
                try { Thread.sleep(10); } catch (Exception e) {}
            }
        }
    }
}
    
