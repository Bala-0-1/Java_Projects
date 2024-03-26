import java.util.*;
class DateChecker{
	String date = "";
	public static void main(String args[]){
		DateChecker dateObj = new DateChecker();
		dateObj.dateVerifier();
	}

	public void dateVerifier(){
		DateChecker dateObj = new DateChecker();
		String date = dateObj.getInput();
		boolean isLength = dateObj.lengthChecker(date);
		if(isLength){
			boolean slash = dateObj.formatChecker(date);
			boolean dayMonthYear = dateObj.DateMonthYear(date);
			if(slash == true && dayMonthYear == true){
				System.out.println("Great job\nNailed it.");
			}
		}
		else{
			System.out.println("Invalid length.\nFatal exception");
		}
		
	}

	public String getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a date : ");
		date = sc.nextLine();
		return date;
	
	}
	
	public boolean formatChecker(String date){
		boolean flag = false;
		if(date.charAt(2) == '/' && date.charAt(5) == '/' ){
			flag = true;
		}
		else if(date.charAt(2) == '/' && date.charAt(5) != '/' ){
			System.out.println("You forgot the slash after month.");
		}
		else if(date.charAt(2) != '/' && date.charAt(5) == '/' ){
			System.out.println("You forgot the slash after day.");
		}
		else if(date.charAt(2) != '/' && date.charAt(5) != '/' ){
			System.out.println("You forgot both the slashes.");
		}
		return flag;
	}

	public boolean lengthChecker(String date){
		boolean flag = false;
		if (date.length() == 10){
			flag = true;
		}
		return flag;
	}

	public boolean leapYear(int year){
		boolean flag = false;
		if( year % 400 == 0){
			flag = true;
		}
		else if (year%100 == 0){
			flag = false;
		}
		else if(year%4 == 0){
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;
	}
	public boolean DateMonthYear(String date){
		boolean flag = false;
		int day = Integer.parseInt(date.substring(0,2));
		int month = Integer.parseInt(date.substring(3,5));
		int year = Integer.parseInt(date.substring(6,10));
		boolean isLeapYear = leapYear(year);
		if(isLeapYear && year<=2023 && year>=1900){
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
				if(day<=31 && day>0){
					flag = true;
				}
				else{
					flag = false;
					System.out.println("Invalid day.");
				}
			}
			else if(month>12){
				System.out.println("Invaild month.");
			}
			else if(month == 2 && day<=29 && day>0){
				flag = true;
				
			}
			else{
				if(month == 4 || month == 6 || month == 9 || month == 11){
					if(day<=30 && day>0){
						flag =  true;
					}
					else{
						flag = false;
						System.out.println("Invalid day.");
					}
			}
		}
		

	}
	else if(isLeapYear != true && year<=2023 && year>=1900){
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			if(day<=31 && day>0){
				flag = true;
			}
			else{
				flag = false;
				System.out.println("Invaild day.");
			}
		}
		else if(month>12){
			System.out.println("Invaild month.");
		}
		else if(month == 2 && day<=28 && day>0){
			flag = true;
			
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11){
			if(month == 4 || month == 6 || month == 9 || month == 11){
				if(day<=30 && day>0){
					flag =  true;
				}
				else{
					flag = false;
					System.out.println("Invalid day.");
				}
		}
	}
	

}
	else{
		System.out.println("Fatal exception has occurred.");
	}


	return flag;


}
}
