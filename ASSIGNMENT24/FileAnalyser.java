package ASSIGNMENT24;

import java.io.*;
import java.util.*;

public class FileAnalyser {
    public static void main(String[] args) {
        FileAnalyser f = new FileAnalyser();
        f.display();
    }

    public String stringConverter(File f){
        String str = "";
        try{
            Scanner file = new Scanner(f);
            while(file.hasNextLine()){
                str+=file.nextLine()+"\n";
            }
        }
        catch(IOException e){
            str+="File not found!!";
        }
        return str;
    }

    public int characterCount(String str){
        return str.trim().length();
    }

    public int wordCount(String str){
        int noOfWords = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n'){
                if(str.charAt(i-1) != ' ' ){
                    noOfWords++;
                }
            }
        }
        return noOfWords;
    }


    public int lineCount(String str){
        int count=0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '\n'){
                count+=1;
            }
        }
        return count;
    }

    public boolean isExist(String str,String subString){
        return str.contains(subString);
    }

    public void display(){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the absolute path of the file : ");
        String path = sc.nextLine();
        File f = new File(path);
        try{
            Scanner file = new Scanner(f);
            str = stringConverter(f);
            System.out.println();
            System.out.println(str);
            System.out.println("No of characters : "+characterCount(str));
            System.out.println("No of words : "+wordCount(str));
            System.out.println("No of lines : "+lineCount(str));
            System.out.println("Does hello exist?  : "+isExist(str,"hello"));
            

        }
        catch(IOException e){
            System.out.println("File not found!!");
        }
    
}
}

