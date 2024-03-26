package Test;

import java.util.ArrayList;


public class ProducerConsumerProblem {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Producer producer = new Producer(arr, 10);
        Thread pThread = new Thread(producer);
        pThread.start();

        Consumer consumer = new Consumer(arr, 10);
        Thread cThread = new Thread(consumer);
        cThread.start();
        
    }
}

class Producer implements Runnable{
    private ArrayList<Integer> arr;
    int capacity;
    int randomNumber;
    public Producer(ArrayList<Integer> arr,int capacity){
        this.arr = arr;
        this.capacity = capacity;
    }
    public void run(){
        
        try{
        while(true){
            while(arr.size() == capacity){
                wait();
            }
            randomNumber = (int)Math.random()*100;
            arr.add(randomNumber);
            notify();
        }
    }
    catch(InterruptedException e){
        e.getMessage();
    }
    }
}

class Consumer implements Runnable{
    private ArrayList<Integer> arr;
    int capacity;
    public Consumer(ArrayList<Integer> arr,int capacity){
        this.arr = arr;
        this.capacity = capacity;
    }
    public void run(){
        try{
        while(true){
            while(arr.isEmpty()){
                wait();
            }
            arr.remove(arr.size()-1);
            notify();
        }
    }
    catch(InterruptedException e){
        e.getMessage();
    }
    }
}