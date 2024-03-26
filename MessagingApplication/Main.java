package MessagingApplication;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            if(choice == 3){
                break;
            }
            System.out.print("Enter you choice,\n1.Login\n2.SignUp\n3.Quit : ");
            choice = sc.nextInt();
            switch(choice){
                case 2:
                    SignUp s = new SignUp();
                    s.signUp();
                    break;
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    Login l = new Login();
                    l.login();
                    System.out.print("So what you wanna do now,\n1.sendMessages\n2.readMessages\n3.viewUsers\n4.QuitToMainMenu\n5.QuitProgram : ");
                    int c = sc.nextInt();
                    LoginMethods lg = new LoginMethods();
                    switch(c){
                        case 1:
                            Scanner sc2 = new Scanner(System.in);
                            System.out.print("Enter the name of the receipient : ");
                            String receipient = sc2.nextLine();
                            System.out.print("Enter the message : ");
                            String message = sc2.nextLine();
                            lg.sendMessage(receipient,message);
                            break;
                        case 2:
                            Scanner sc3 = new Scanner(System.in);
                            System.out.print("Enter your name : ");
                            String name = sc3.nextLine();
                            lg.readMessage(name);
                            break;
                        case 3:
                            lg.viewUsers();
                            break;
                        case 4:
                            break;
                        case 5:
                            choice = 3;
                            break;
                        default:
                            System.out.println("Wrong input...");
                            break;
                        
                    }
                    break;
                case 3:
                    System.out.println("Bye bye....");
                    break;
                default:
                    System.out.println("Wrong input choice...");
            }
        }
        
    }
}
