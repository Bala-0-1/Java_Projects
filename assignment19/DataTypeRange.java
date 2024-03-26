package assignment19;

import java.util.Scanner;

public class DataTypeRange {
public static void main(String[] args) {
    try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextLong();
        System.out.println("Feasible Data Types are : ");
        
        switch ((-128 <= num && num <= 127 ) ? 0 :
                (-32768 <= num && num <= 32767) ? 1 : (-2147483648 <= num && num <= 2147483647 ) ? 2 : ( -9223372036854775808l <= num && num <= 9223372036854775807l ) ? 3 : 4) {
            case 0:
                System.out.println("byte\nshort\nint\nlong");
                break;
            case 1:
                System.out.println("short\nint\nlong");
                break;
            case 2:
                System.out.println("int\nlong");
                break;
            case 3:
                System.out.println("Long");
                break;
            case 4:
                System.out.println("Invalid range");
                break;
        }
    
    }
    catch(Exception e){
        System.out.println("Invalid input.");
    }
       
        
    
    }
}
