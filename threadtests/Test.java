package threadtests;

public class Test{
    public static void main(String[] args) {
        Threading tObj = new Threading();
        Thread t = new Thread(tObj);
        Thread t1 = new Thread(tObj);
        t.start();
        t1.start();
        Thread[] tCount = new Thread[Thread.activeCount()];
        Thread.enumerate(tCount);
        for(int i = 0;i<tCount.length;i++){
            System.out.println(tCount[i]);
        }

    }
}
