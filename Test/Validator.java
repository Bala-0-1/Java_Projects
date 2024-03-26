package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Validator {
    ArrayList<User> users = new ArrayList<>();

    public boolean noSpacesInBetween(String str){
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) == ' '){
                System.out.println("No spaces in between");
                return false;
            }
        }
        return true;
    }


    public boolean isNull(String str){
        if(str.isEmpty()){
            System.out.println("String should not be null");
            return false;
        }
        return true;
    }

    public boolean isEmptyWithSpaces(String str){
        if(str.isBlank()){
            System.out.println("String should not be blank");
            return false;
        }
        return true;
    }

    public boolean hasSpecialCharacters(String str){
        String specialCharacters = "!@#$%^&*()_+{}[]-=:'/.,<>?~`";
        for(int i = 0 ; i<str.length();i++){
            if(specialCharacters.contains(String.valueOf(str.charAt(i)))){
                System.out.println("String should not contain special characters.");
                return false;
            }
        }
        return true;
    }

    public boolean hasTrailingSpaces(String str){
        if(str.charAt(str.length()-1) == ' '){
            System.out.println("Should not contain trailing spaces");
            return false;
        }
        return true;
    }

    public void detailsGetter(){
        Scanner sc = new Scanner(System.in);
        User u = new User();
        String name;
        int password;
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        int i  = 0;
        while(true){
            if(i!=0){
                System.out.print("Enter your name again : ");
                name = sc.nextLine();
            }
            if((hasTrailingSpaces(name) && isEmptyWithSpaces(name) && hasSpecialCharacters(name) && noSpacesInBetween(name) && isNull(name))){
                System.out.print("Enter your pin : ");
                password = sc.nextInt();
                u.setName(name);
                u.setPassword(password);
                System.out.println("User added!!");
                users.add(u);
                break;
                
            }
            else{
                i++;
                continue;
            }
        }
        

    }

    public static void main(String[] args) {
        Validator v = new Validator();
        v.detailsGetter();
    }
}

class User{
    private String name;
    private int password;
    User(){

    }
    User(String name,int password){
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public int getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(int password) {
        this.password = password;
    }

}