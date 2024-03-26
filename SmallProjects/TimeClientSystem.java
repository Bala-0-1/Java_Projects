package com.zs.network;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class TimeClientSystem {


    public static void main(String args[]){

        Socket s = null;
        try {

            s = new Socket("172.24.203.169",8000);

            Scanner sc = new Scanner(s.getInputStream());
            // ObjectInputStream ois = new ObjectInputStream(s.getInputStream());




            while (sc.hasNext()) {
                System.out.println("From server " + sc.nextLine());
            }



           /* PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("hello from client .....");*/

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(s!=null) {
                    s.close();
                }
            }
            catch (Exception ee){
                System.out.println("closed .... ");
            }
        }

    }
}
