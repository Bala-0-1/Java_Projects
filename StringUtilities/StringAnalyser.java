package StringUtilities;
import java.util.*;
public class StringAnalyser{
	public static void main(String args[]){
		StringAnalyser classObj = new StringAnalyser();	
		classObj.methodCaller();

	}

	public void methodCaller(){
		StringAnalyser classObj = new StringAnalyser();
		Scanner sc = new Scanner(System.in);
		String inputStr = classObj.getInput();
		int charCount = classObj.characterCount(inputStr);
		int lineCountValue = classObj.lineCount(inputStr);
		int wordCountValue = classObj.wordCount(inputStr);
		System.out.println("No. of characters : "+charCount);
		System.out.println("No. of words : "+wordCountValue);
		System.out.println("No. of lines : "+lineCountValue);
		System.out.println("Menu:");
		System.out.println("1.To lower case\n2.To upper case\n3.Toggle case\n4.Check for a substring\n5.Count all the substring occurence\n6.Reverse");
		int choice = sc.nextInt();
		switch (choice){
			case 1:
				System.out.println(classObj.convertToLower(inputStr));

				break;
			case 2:
				System.out.println(classObj.convertToUpper(inputStr));
				break;
			case 3:
				System.out.println(classObj.swapCase(inputStr));
				break;

			case 4:
				System.out.print("Enter the substring to be searched : ");
				Scanner scan = new Scanner(System.in);
				String sub = scan.nextLine();
				boolean flag = classObj.containsCharacterSequence(inputStr,sub);
				if (flag){
					System.out.println("It contains the substring "+sub);
					break;
				}
				else{
					System.out.println("substring not found.");
					break;
				}

			case 5:
				System.out.print("Enter the substring to be searched : ");
				Scanner scc = new Scanner(System.in);
				String str = scc.nextLine();
				int count = classObj.countCharacterSequence(inputStr,str);
				System.out.println("The count of the substring "+str+" is "+count);
				break;
			case 6:
				System.out.println(reverse(inputStr));
				break;
			default:
				System.out.println("Invalid option.");
		}
	}
	public String getInput(){
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		System.out.print("Give first line : ");
		String temp = sc.nextLine();
		inputStr += temp;
		System.out.println();
		while (!temp.equals( "quit")){
			System.out.print("Give next line : ");
			temp=sc.nextLine();
			if(!temp.equals("quit")){
				inputStr+=temp+"\n";
				System.out.println();
			}
		}
		return inputStr;
	}
	public int characterCount(String inputStr){
		return inputStr.trim().length();
	
	}
	
	public int lineCount(String inputStr){
		Scanner sc = new Scanner(inputStr);
		int count = 1;
		while (sc.hasNextLine()) {
		    count++;
		    sc.nextLine();
		}
		return count;
	}

	public int wordCount(String inputStr){
		int count = 1;
		for(int i=0;i<inputStr.length();i++){
			if(inputStr.charAt(i) == ' ' || inputStr.charAt(i) == '\n'){
				count+=1;
			}
		
		}
		return count;
	}

	public boolean containsCharacterSequence(String inputStr,String sub){
		return inputStr.contains(sub);
	
	
	}

	public int countCharacterSequence(String str,String sub){
		int count = 0;
        while(str.contains(sub)){
            str = str.replaceFirst(sub,"");
            count++;
        }
    return count;
    }

	public String convertToLower(String inputStr){
		return inputStr.toLowerCase();
	}

	public String convertToUpper(String inputStr){
		return inputStr.toUpperCase();
	}

	public String swapCase(String inputStr){
		String toggleCase = "";
		for(int i=0;i<inputStr.length();i++) {
			if(Character.isLowerCase(inputStr.charAt(i))){
				toggleCase+=Character.toUpperCase(inputStr.charAt(i));

		}
			else{
				toggleCase+=Character.toLowerCase(inputStr.charAt(i));
			}
		}
		return toggleCase;

	}

	public String reverse(String inputStr){
		String reversedString = "";
		for(int i=inputStr.length()-1;i>=0;i--) {
			reversedString+=inputStr.charAt(i);
		}
		return reversedString;
		}





}












