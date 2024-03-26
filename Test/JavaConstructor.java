package Test;

import java.math.BigInteger;
import java.lang.Math;
public class JavaConstructor {
    // Integer num;
    BigInteger num;

    //It had a constructor name so the compiler internally threw a warning So I changed it
    public void disp(){
        System.out.println("Java constructor...");
    }

    public JavaConstructor(BigInteger num){
        this.num= num;
    }


    public void display(){
        System.out.println(this.num);
    }

    public JavaConstructor(String num){
        if(num != null){
            this.num = new BigInteger(num);
        }
        else{
            this.num = null;
        }
    }
    public static void main(String[] args) {
        // String i1 = String.valueOf(Math.pow(2, 5000));
        BigInteger result = BigInteger.valueOf(2).pow(500000000);
        System.out.println("BigInteger");
        // System.out.println(i1);
        String s1 = result.toString();
        System.out.println("toString");
        JavaConstructor jc = new JavaConstructor(s1);
        jc.display();
    }
}

//"12314223457434634453434454545747545454754545445454545745454574574454545454575454574545457454574574123456789012345678909876543212345678901234567898765432123456789098765321234567898765432123456789098765432112345678909876543212345678987654321234567890987654321234567890987654321234567890987654323456789012345678923456789012345678905745745747545745745457457457457457475457475467897654555123456789876543234567890234567808541345678908765432134567888931234567873234567876543211"