package ASSIGNMENT23;

import java.util.Scanner;
import java.io.*;
public class ContentCopier {
    public static void main(String[] args){
        Scanner obj;
        try{
            File f = new File("/home/balakumaran/java/file1.txt");
            FileWriter writer = new FileWriter("/home/balakumaran/java/file2.txt");
            obj = new Scanner(f);
            String str="";
            while(obj.hasNextLine()){
                String lines = obj.nextLine();
                str=lines+"\n"+str;
            }
            writer.write(str.toString());
            writer.close();
            f = new File("file2.txt");
            obj = new Scanner(f);
            while(obj.hasNextLine()){
                String line = obj.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found!");
        }
        catch (IOException e){
            System.out.println("Something went wrong!!");
        }
    }
}
