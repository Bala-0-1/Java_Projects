package threadtests;

public class Threading implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println("Non-Daemon Thread : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
