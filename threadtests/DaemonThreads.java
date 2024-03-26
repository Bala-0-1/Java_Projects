package threadtests;


public class DaemonThreads {
    public static void main(String[] args) {
        Threading tObj = new Threading();
        Thread t = new Thread(tObj);
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                    for(int i = 0;i<20;i++){
                        System.out.println("Daemon Thread : "+i);
                    try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
            }
        }
        });
        t1.setDaemon(true);
        t1.start();
        t.start();
    }
}

// class Example implements Runnable{
//     public void run(){
//                 for(int i = 0;i<20;i++){
//                     System.out.println("Non-Daemon Thread : "+i);
//                     try{
//                         Thread.sleep(500);
//                     }
//                     catch(InterruptedException e){
//                         e.printStackTrace();
//                     }
//                 }
//             }
// }
