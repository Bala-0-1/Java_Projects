class Confusion1{
	public static void main(String[] args){
		System.out.println("confusion");
		Confusion obj = new Confusion();
		obj.display();
	}

}
class Confusion{
	public static void main(String[] args){
		System.out.println("confusion is clear");
		Confusion testObj = new Confusion();
		testObj.display();
	}
	public void display(){
		System.out.println("confusion is not clear");
	}
}
