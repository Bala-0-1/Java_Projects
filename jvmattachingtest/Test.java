package jvmattachingtest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        // System.out.println(t.getServerProcessID());
        System.out.println(System.getProperty("java.home"));
    }


    public String getServerProcessID(){
        String pid = "0";
        String processid;
        String str1;
        try{
            ProcessBuilder p = new ProcessBuilder("jps");
            Process process = p.start();
            int p2 = process.waitFor();
            if(p2 == 0){
                Scanner sc = new Scanner(process.getInputStream());
                while(sc.hasNextLine()){
                    String val = sc.nextLine();
                    String[] str = val.split(" ");
                    if(str.length>1){
                        processid = str[0];
                        str1 = str[1];
                        System.out.println(str1);
                        System.out.println(processid);
                        if(str1.equals("AdviceServer")){
                            pid = processid;
                            break;
                    }
                    
                    }
                    
                }
            }
            else{
                System.out.println("udsbvibsbvs");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pid;
    }
}
