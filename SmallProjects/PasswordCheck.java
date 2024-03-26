import java.util.Scanner;
class PassWordChecker{
	String password = "";
	public static void main(String args[]){
		PassWordChecker p = new PassWordChecker();
		p.validator();
	}
	
	public String getInput(){
		System.out.println("Your password should contain,\natleast 1 uppercase\natleast 1 specialcharacters\natleast 1 number\natleast 8 characters long");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password : ");
		password = sc.nextLine();
		return password;
	
	}
	public void validator(){
		PassWordChecker p = new PassWordChecker();
		p.getInput();
		boolean cap = p.isCaps();
		boolean sp = p.isSpecial();
		boolean ln = p.isLong();
		boolean digit = p.isDigit();
		if (sp==true && digit==true && ln==true && cap==true){
			System.out.println("It's a strong password");
		}
		else if (sp==true && ln==true && cap==true){
			System.out.println("Add a number.");
		}
		else if (sp==true && digit==true && ln==true){
			System.out.println("Add cap letters");
		}
		else if (digit==true && ln==true && cap==true){
			System.out.println("Add special characters.");
		}
		else{
			System.out.println("It is a weak password.");
		}


	}
	public boolean isCaps(){
		boolean bool = false;
		String caps = "QWERTYUIOPASDFGHJKLZXCVBNM";
		for(int i=0;i<password.length();i++){
			if(caps.contains(String.valueOf(password.charAt(i)))){
				bool = true;
				break;
			}
		}
		return bool;
	}
	
	public boolean isLong(){
		boolean bool = false;
		if (password.length() > 8){
			bool = true;
		}
		return bool;
	}

	public boolean isDigit(){

			boolean bool = false;
			String nums = "1234567890";
			for(int i=0;i<password.length();i++){
				if(nums.contains(String.valueOf(password.charAt(i)))){
					bool = true;
					break;
				}
			}
			return bool;
		}


		public boolean isSpecial(){
			boolean bool = false;
			String sp = "!@#$%^&*()_+-=~`<>?}{|,./;'[]";
			for(int i=0;i<password.length();i++){
				if(sp.contains(String.valueOf(password.charAt(i)))){
					bool = true;
					break;
				}
			}
			return bool;
	}
	

	
	
}
