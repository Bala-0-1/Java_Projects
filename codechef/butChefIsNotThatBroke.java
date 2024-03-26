package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
	    Codechef c = new Codechef();
	    c.chefIsNotThatBroke();
	}
	
	public void chefIsNotThatBroke(){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String[] str;
	    int result;
	    sc.nextLine();
	    for(int i = 0;i<n;i++){
	        str = sc.nextLine().split(" ");
	        int a = Integer.parseInt(str[0]);
	        int b = Integer.parseInt(str[1]);
	        if((String.valueOf(a*b)).length() == 5){
	            if((String.valueOf(a*b)).charAt(0)!= '0'){
	                System.out.println("YES");
	                continue;
	            }
	            else{
	            System.out.println("NO");
	            continue;
	            }
	        }
            else{
                System.out.println("NO");
            }
	    }
	        
	    }
	}
	

