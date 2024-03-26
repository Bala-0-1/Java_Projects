import java.util.Scanner;
class Emoji{
	String choice="";
	String option="";
	public void emojiToText(){
		String a = "📱";
		String b = "🖥";
		String c = "🪑";
		String d = "📆";
		String e = "📒";
		
		if(choice.equals(a)){
			System.out.println("Its a Phone "+a);	
	
		}
		else if(choice.equals(b)){
			System.out.println("Its a Laptop "+b);
		
		}
		else if(choice.equals(c)){
			System.out.println("Its a Chair "+c);
		
		}
		else if(choice.equals(d)){
			System.out.println("Its a Calendar "+d);
		
		}
		else if(choice.equals(e)){
			System.out.println("Its a Notebook "+e);
		
		}
		else{
			System.out.println("Invalid choice");
		}





}
	public void textToEmoji(String choice){
		String a = "Phone";
		String b = "Laptop";
		String c = "Chair";
		String d = "Calendar";
		String e = "Notebook";
		
		if(choice.equals(a)){
			System.out.println("📱");	
	
		}
		else if(choice.equals(b)){
			System.out.println("🖥");
		
		}
		else if(choice.equals(c)){
			System.out.println("🪑");
		
		}
		else if(choice.equals(d)){
			System.out.println("📆");
		
		}
		else if(choice.equals(e)){
			System.out.println("📒");
		
		}
		else{
			System.out.println("Invalid choice");
		}

	
	
	
	
	}
	public void getOption(){
		Emoji em = new Emoji();
		System.out.println("This is a menu driven program to convert emoji to text and vice versa ");
		System.out.println("It supports only these emoji, \n📱\n🖥\n🪑\n📆\n📒");
		System.out.println("And  It supports only these characters,\nPhone\nLaptop\nChair\nCalendar\nNotebook ");
		
		while(true){
			option = em.menu();
			choice = em.getInput();
			if(option.equals("1")){
				
				em.emojiToText();
			}
			else if(option.equals("2")){
				
				em.textToEmoji(choice);
				
				
			}
			else if(option.equals("3")){
				System.out.println("Bye Bye...");
				break;
			
			}
			else{
				System.out.println("Invalid input\n Try again.");
				break;
			}
		
		
		
		
		}
	}
	public String getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text/emoji: ");
		choice = sc.nextLine();	
		return choice;
	
	
	}
	public String menu(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a choice,\n1.Emoji to text\n2.Text to emoji\n3.Quit");
		String option = sc.nextLine();
		return option;
	
	
	
	}
	
	
	
	
}
