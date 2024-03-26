package fourte;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    ArrayList<DataClass> arr = new ArrayList<>();
    Random r = new Random();

    public void game(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to forteee.....");
        System.out.println();
        System.out.print("Please enter your name : ");
        User usr = new User(sc.nextLine());
        System.out.println();
        System.out.println("Welcome "+usr.getName());
        System.out.println();
        System.out.println("Here it is rookie it's simple,\nyou will be given four numbers and you have to choose the correct numbers and the correct expressions in between them to win!!\nGood luck rookie\nSee you on the other side...");
        System.out.println();
        System.out.println("Well here we goooooo.......");
        int[] requiredArr = fourNumberCombinations().getNum();
        int target = requiredArr[4];
        System.out.println();
        System.out.println("Your target is : "+target);
        System.out.println();
        int chance = 3;
        boolean hasWon = false;
        System.out.println("The four number combination : "+arrToString(requiredArr));
        System.out.println();
        System.out.println("You have to use all four numbers and three expressions which will be evaluated by our computer(Super awesome btw) and the result shall be announced.\nCareful soldier you only get three chances...");
        System.out.println();
        while(chance>0){
            if(hasWon){
                break;
            }
            System.out.println("This is the input format.\n\n example : 4*3/2+1 \n\nI know all users are dumb but please don't mess it up.\nFine let me put it this way you mess it up you lose a chance\nmuahhahahahahahha.");
            System.out.println();
            try{
                System.out.print("Enter your input : ");
                String temp = sc.nextLine();
                int userEval = parseOperationsAndReturnValue(temp);
                if(userEval == target){
                    hasWon = true;
                    System.out.println("yayyyy you win!!!");
                    break;
                }
                else{
                    chance--;
                    System.out.println("try again....\nremaining chances : "+chance);
                }
            }
            catch(Exception e){
                chance--;
                System.out.println();
                System.out.println("Something went wrong.\nPlease refer to the above instructions,\nChances left : "+chance);
            }

        }
        if(hasWon == false){
            System.out.println();
            System.out.println("Awww don't feel sad.\n you will get them next time...");
        }


    }

    public DataClass fourNumberCombinations(){
        String[] choices = new String[]{"+","-","*","/"};
        int randomOperator = r.nextInt(4);
        int[] arr = new int[5];
        String temp = "";
        int count = 0;
        while(true){
            if(temp.length() == 4){
                break;
            }
            String temp1 = String.valueOf(r.nextInt(10));
            if(temp.contains(temp1)){
                continue;
            }
            temp += String.valueOf(temp1);
            arr[count] = Integer.parseInt(temp1);
            count+=1;
            
        }
        String target = "";
        int counter = 0;
        while(true){
            if(counter == 4){
                break;
            }
            String randomNum = String.valueOf(arr[r.nextInt(4)]);
            String randomOp = choices[r.nextInt(4)];
            if(target.contains(randomNum) || target.contains(randomOp)){
                continue;
            }
            if(target.length() == 6){
                target += randomNum;
            }
            target += randomNum+randomOp;
            counter+=1;
            
        }
        arr[4] = parseOperationsAndReturnValue(target);
        return new DataClass(arr);
    }

    public int parseOperationsAndReturnValue(String target){
        int targetSum;
        targetSum = switcher(n(target.charAt(0)), target.charAt(1), n(target.charAt(2)));
        targetSum = switcher(targetSum, target.charAt(3), n(target.charAt(4)));
        targetSum = switcher(targetSum, target.charAt(5), n(target.charAt(6)));
        return targetSum;
    }

    // public static void main(String args[]){
    //     Game g = new Game();
    //     System.out.println("obj created");
    //     DataClass d = g.fourNumberCombinations();
    //     System.out.println("works");
    //     for(int i = 0;i<d.getNum().length;i++){
    //         System.out.println(d.getNum()[i]);
    //     }


    // }


    public int switcher(int num,char val,int num1){
        switch(val){
            case '+':
                return num+num1;
            case '-':
                return num-num1;
            case '*':
                return num*num1;
            case '/':
                return num/num1;
            default:
                return 0;
        }
    }

    

    public int n(char n){
        return Integer.parseInt(String.valueOf(n));
    }

    
    public boolean isContains(int num, int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public String arrToString(int[] arr){
        String str = "";
        for(int i = 0;i<arr.length-1;i++){
            str+=arr[i]+", ";

        }
        return str;
    }
}





