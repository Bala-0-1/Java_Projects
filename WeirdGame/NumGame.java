package WeirdGame;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class NumGame {
    private String name;
    private int[] arr;

    public NumGame(){
        this.name = "Bala";
        this.arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    public NumGame(String name,int[] arr){
        this.name = name;
        this.arr = arr;
    }

    public NumGame(int[] arr){
        this.arr = arr;
    }

    public NumGame inputGetter(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        int arrLen = (int)(Math.random()*20);
        int[] arr = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            arr[i] = (int)(Math.random()*100);
        }
        // scan.close();
        return new NumGame(name, arr);
    }

    public NumGame removeValue(int num){
        arr = new int[arr.length-num]; 
        return new NumGame(arr);
    }

    public int RandomGenerator(){
        int max = 2;
        int min = 1;
        int randomNum =new Random().nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void mainGame(){
        Scanner sc = new Scanner(System.in);
        inputGetter();
        System.out.println();
        System.out.println("And it begins...");
        NumGame rarr;
        int num = 0;
        while(this.arr.length != 0){

            try{
                System.out.print("User's turn : ");
                num = sc.nextInt();
            }
            catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Wrong input try again!");
                continue;
            }
            if(num>=arr.length){
                System.out.println(this.name+" wins!\nHumans++");
                break;
            }
            if(arr.length == 1 && num == 2){
                num = 1;
            }
            rarr = removeValue(num);
            if(this.arr.length == 0){
                System.out.println("User wins!\nHumans ++");
                break;
            }
            int temp = RandomGenerator();
            System.out.println("Computer's turn : "+temp);
            if(arr.length == 1 && temp == 2){
                    temp = 1;
            }
            rarr = removeValue(temp);
            // System.out.println(rarr);
            if(this.arr.length == 0){
                System.out.println("Computer wins!\nYou lost and AI will takeover");
                break;
            }
            
        }
        sc.close();

    }

    public String toString(){
        String res = "";
        if(arr!=null || arr.length > 0){
            res = "[";
            for(int i = 0; i< arr.length;i++){
                if(i != arr.length - 1){
                    res = res + arr[i] + ", ";
                }
                else{
                    res = res + arr[i] + "]";
                }
            }
        }
        else{
            res = "[]";
        }
        return res;
    }
    public static void main(String args[]){
        NumGame gameObj = new NumGame();
        gameObj.mainGame();
    }
}
