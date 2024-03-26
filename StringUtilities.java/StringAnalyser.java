import java.util.*;
class StringAnalyser{
	public static void main(String args[]){
		StringAnalyser classObj = new StringAnalyser();	
		String inputStr = classObj.getInput();
		int charCount = classObj.characterCount(inputStr);
		int lineCountValue = classObj.lineCount(inputStr);
		System.out.println("Charcount : "+charCount+"\nlinecount : "+lineCountValue);
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
		int count = 0;
		for(int i=0;i<inputStr.length();i++){
			if(inputStr.charAt(i).equals(' ')){
				count+=1;
			}
		
		}
		return count;
	}

	public containsCharacterSequence(String inputStr){
		
	
	
	
	}







}
