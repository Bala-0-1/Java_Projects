class ProgramStructure{

	public void aboutPrintln() {
		System.out.println("println() is a method to display the text on console");
	}
	public void aboutPublic() {
		System.out.println("public is an access modifier");
	}
	public void aboutMain() {
		System.out.println("Main method is the entry point to a program");
	}
	public void aboutVoid() {
		System.out.println("void is a return type which returns nothing. Just like this method ;) ");
	}	
	public static void main(String args[]){
		ProgramStructure p = new ProgramStructure();
		p.aboutPublic();
		p.aboutVoid();
		p.aboutMain();
		p.aboutPrintln();
		
	
	
	}

}

