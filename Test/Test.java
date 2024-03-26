package Test;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Codechef c = new Codechef();
		c.chefLovesChocolates();
	}
	
	public void chefLovesChocolates(){
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    String string;
	    String[] vals;
	    int res = 0;
	    int x;
	    int y;
	    int punyChefsPay = 0;
	    sc.nextLine();
	    for (int i = 0; i < r; i++){
	        string = sc.nextLine();
	        vals = string.split(" ");
	        x = Integer.parseInt(vals[0]);
	        y = Integer.parseInt(vals[1]);
	        if(y>x){
	            res = (y-x)*2;
	        }
	        punyChefsPay = (x < y) ? x+res : y+res;
	        System.out.println(punyChefsPay);
	        
	    }
	}
}
