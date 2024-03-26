import java.util.*;

class AgeConsultant{
	float age = 0;
	String stage = "Invalid age";
	public String findStage(){
		if ( age == 0 ){
			stage = "Foetus";
		}
		else if ( age <= 1 && age > 0){
			stage = "Infant";
			
		}
		else if ( age <= 3 && age > 1){
			stage = "Toddler";
			
		}
		else if ( age <= 17 && age > 3){
			stage = "School boy";
			
		}
		else if ( age <=36 && age >=18){
			stage = "Adult";
			
		}
		else if ( age <=45 && age > 36){
			stage = "Middle aged person";
			
		}
		else if ( age > 45 && age < 70){
			stage = "Getting old";
			
		}
		else if (age > 70 ){
			stage = "Sorry man you are getting old . But , age is just a number . \n Don't Worry :)";		
		}
		return stage;
	}
	public boolean isEligibleToVote(){
		boolean isEligible = false;
		if ( age > 17 ){
			isEligible = true;
		}
		return isEligible;
	
	
	}
	public boolean isSeniorCitizen(){
		boolean isSenior = false;
		if ( age > 70 ){
			isSenior = true;
	
	
	
		
		}
		
		return isSenior;
	}
		
	public String medicalGuidance(){
		String medicalGuide = "You are fine. I guess !";
		if ( age >30 && age <= 40){
			medicalGuide = "Still young. Medical check up once every two years is fine.";
		}
		else if( age >40 && age <=60){
			medicalGuide = "Twice a year sould be fine.";
		}
		else if ( age > 60){
		 	medicalGuide = "Take care of your health man.";
		}
		return medicalGuide;

	
	}
	public static void main(String args[]){
		AgeConsultant AC = new AgeConsultant();
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter your age : ");
		AC.age = sc.nextInt(); 
		String stage = AC.findStage();
		boolean vote = AC.isEligibleToVote();
		boolean senior = AC.isSeniorCitizen();
		String med = AC.medicalGuidance();
		System.out.println("Stage : "+stage);
		System.out.println("Eligibility to vote : "+vote);
		System.out.println("Senior citizen : "+senior);
		System.out.println("Medical Advice : "+med);
	
	
	}






}
