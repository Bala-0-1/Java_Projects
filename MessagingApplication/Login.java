package MessagingApplication;
import java.util.Scanner;
import java.io.*;
import java.util.Collection;

public class Login{
    public static void main(String[] args) {
        Login l = new Login();
        System.out.println(l.login());
    }
    public boolean login(){
        boolean flag = false;
        try{
            File f = new File("/Users/balakumaranb/java/MessagingApplication/user.txt");
            Scanner file = new Scanner(f);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your username : ");
            String name = sc.nextLine();
            int count = 2;
            String[] arr = file.nextLine().split(" ");
            while(true){
                if(file.hasNextLine()){
                arr = file.nextLine().split(" "); 
                }
                if(arr[0].equals(name)){
                    break;
                }
                else if(sc.hasNextLine() == false){
                    System.out.println("User not found!!");
                    break;
                }
                else{
                    System.out.println("Wrong user name!\ntry again!");
                    System.out.print("Enter your username : ");
                    sc.nextLine();
                    continue;
                }
            }
            file = new Scanner(f);
            String[] arr1 = file.nextLine().split(" ");
            while(count!=-1){
                if(file.hasNextLine()){
                arr1 = file.nextLine().split(" "); 
                }
                System.out.print("Enter your password : ");
                String password = sc.nextLine();
                CaeserCipher c = new CaeserCipher(password);
                if(c.cipher().equals(arr1[1])){
                    System.out.println("You are logged in!");
                    flag=true;
                    break;                    
                }
                else{
                    System.out.println("Wrong password!\nYou have "+count+" Chances.");
                    count--;
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!\nIt's a mess on our end\nPlease contact customer support if you see this message\nDontcall@nosupport.nope");
        }
        return flag;
    }
}
