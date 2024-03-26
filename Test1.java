// import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.net.*;

public class Test1 {
  public static void main(String args[]){

    Test1 as = new Test1();
    as.connect();

}

public void connect(){
    try {

        Socket s = new Socket("10.52.0.243",4444);
        InputStream is = s.getInputStream();
        Scanner sc = new Scanner(is);
        System.out.println(sc.nextLine());
        sc.close();
        //while(sc.hasNextLine()




    }
    catch(Exception ee){
        System.out.println("error  "+ee);
    }
}
}

