package threadtests;



public class SynchronizedExample {

    private static int counter = 0;

    public  synchronized void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        SynchronizedExample s = new SynchronizedExample();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    s.incrementCounter();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Counter Value: " + counter);
    }
}
