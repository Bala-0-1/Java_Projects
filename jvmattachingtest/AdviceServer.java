package jvmattachingtest;

import java.io.*;
import java.lang.instrument.Instrumentation;
import java.net.*;
import java.util.ArrayList;

public class AdviceServer{
    PrintWriter pw;
    static int count=0;
    private static final int maxNumberOfConnections=3;
    String ipAddress;
    ArrayList<String> listOfIPAddresses = new ArrayList<String>();

    // public static void premain(String agentArgs, Instrumentation instrumentation) {
    //     // Your agent initialization code here
    //     System.out.println("Java Agent is loaded!");
    // }

    public static void main(String[] args){
        AdviceServer as = new AdviceServer();
        as.listen();
    }
    public int getCount(){
        return count;
    }
    // public static boolean isConnectionPossible(){
    //     System.out.println(count);
    //     return count<maxNumberOfConnections;
    // }

    public void listen(){
        try{
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("SERVER IS LISTENING.........");
            while(true){
                // if(count<2){
                Socket comm = ss.accept();
                InetAddress ip = comm.getInetAddress();
                ipAddress = ip.getHostAddress();
                if(!inList(ipAddress)){
                    System.out.println("Client connected......");
                    listOfIPAddresses.add(ipAddress);
                    // count++;
                }
                else{
                    System.out.println(ipAddress + " is trying to connect again.");
                    System.out.println("Client reconnected....");
                }
                count++;
                OutputStream os = comm.getOutputStream();
                pw = new PrintWriter(os);
                pw.println("You are connected to the server!");
                pw.flush();
                System.out.println("Number of Clients Connected: "+ count);
                // }
            }
        }
        catch(Exception e){
            System.out.println("ERROR: "+ e);
        }
        pw.close();
    }

    public boolean inList(String ipaddress){
        for(String ip:listOfIPAddresses){
            if(ip.equals(ipaddress)){
                return true;
            }
        }
        return false;
    }
}
