import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
	Repetition robj = new Repetition();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string : ");
	String text = sc.nextLine();
	robj.printString(text);
    }

public void printString(String text) {

	String temp=""; 
	for (int i=0; i<text.length(); i++) {
		if(i!=text.length()-1&& text.charAt(i)==text.charAt(i+1)){
			temp+=text.charAt(i);
	}
	else if(i!=0 && text .charAt(i) == text.charAt(i-1)){ 
		temp+=text.charAt(i );
	}
	else{
		continue;

	}

	}	
		System.out.println(temp);
}
}
