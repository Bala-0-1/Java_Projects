class Greetings{

	private String greet;
	public static void main(String args[]){
		// Greetings obj = new Greetings();
		Greetings obj1 = new Greetings("Prathika san");
		// System.out.println(obj);
		System.out.println(obj1);
	}
	
	public void setGreet(String greet){
		this.greet = greet;
	}
	
	public String getGreet(){
		return this.greet;
	}
	
	public Greetings(){
		greet = "Happy Teachers' Day";
	}
	
	public Greetings(String name){
		greet = "\u001B[1m\u001B[33mHappy Teachers' Day, "+"\u001B[4m"+name+"!";
	}
	
	public String toString(){
		return this.greet;
	}
	
	
}
