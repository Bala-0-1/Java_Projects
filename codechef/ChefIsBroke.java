package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Codechef c = new Codechef();
		c.weirdThreePeople();
	}
	
	public void weirdThreePeople(){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num;
	    sc.nextLine();
	    for(int i = 0;i<n;i++){
	        num = sc.nextInt();
	        sc.nextLine();
	        if(isBob(num)){
	            System.out.println("BOB");
	        }
	        else if(isAlice(num)){
	            System.out.println("ALICE");
	        }
	        else{
	            System.out.println("CHARLIE");
	        }
	        
	    }
	}
	
	public boolean isBob(int num){
	    if(num%2 == 0 && num%7 == 0){
	        return true;
	    }
	    return false;
	}
	
	public boolean isAlice(int num){
	    if(num%2 != 0 && num%9 == 0){
	        return true;
	    }
	    return false;
	}
	
}
