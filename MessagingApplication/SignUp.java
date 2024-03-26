package MessagingApplication;
import java.util.Scanner;
import java.io.*;

public class SignUp {
    private String name;
    private String password;

    public static void main(String[] args) {
        SignUp s = new SignUp();
        s.signUp();
    }
    public void signUp(){
        FileWriter f;
        FileWriter f1;
        FileWriter f2;
        Scanner sc = new Scanner(System.in);
        try{
            f = new FileWriter("/Users/balakumaranb/java/MessagingApplication/user.txt",true);
            f1 = new FileWriter("/Users/balakumaranb/java/MessagingApplication/passwords.txt",true);
            f2 = new FileWriter("/Users/balakumaranb/java/MessagingApplication/users.txt",true);
            System.out.print("Enter your name : ");
            name = sc.nextLine();
            f.write(name+" ");
            f2.write(name+"\n");
            System.out.print("Enter your password : ");
            password = sc.nextLine();
        String confirm;
        while(true){
            System.out.print("Confirm your password : ");
            confirm = sc.nextLine();
            if(password.equals(confirm)){
                System.out.println("User created successfully!");
                CaeserCipher c = new CaeserCipher(password);
                f.write(c.cipher()+"\n");
                f1.write(c.cipher()+"\n");
                break;
            }
            System.out.println("Wrong password.\nTry again!!");
        }
        f.close();
        f1.close();
        f2.close();
    }
    catch (IOException e){
            System.out.println("File not found!!");
    }
    
    }
}
