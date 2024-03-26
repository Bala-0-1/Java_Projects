package MessagingApplication;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class LoginMethods {
    
    String currentTime;
    FileWriter fw;
    String time;
    String date;

    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void sendMessage(String name,String message){
        currentTime = LocalDateTime.now().format(timeFormat);
        StringTokenizer str = new StringTokenizer(currentTime," ");
        date = str.nextToken(); 
        time = str.nextToken();
        try{
        fw = new FileWriter("/Users/balakumaranb/java/MessagingApplication/Messages.txt", true);
        fw.write(message+" From:"+name+" Time:"+time+" Date:"+date+"\n");
        fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readMessage(String name){
        String str = "";
        File f = new File("/Users/balakumaranb/java/MessagingApplication/Messages.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                str+=sc.nextLine()+"\n";
            }
            if(str.length()!=0){
                System.out.println(str);
            }
            else{
                System.out.println("You have no messages.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      
    }
    public void viewUsers(){
        String str = "";
        try{
            File f = new File("/Users/balakumaranb/java/MessagingApplication/users.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                str+=sc.nextLine()+"\n";
            }
            if(str.length() != 0){
                System.out.println(str);
            }
            else{
                System.out.println("No users found.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
