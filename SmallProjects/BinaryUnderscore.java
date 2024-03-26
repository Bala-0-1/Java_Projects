import java.util.Scanner;
class BinaryUnderscore{
	static int Int = 0;
	public static void main(String args[]){
		BinaryUnderscore obj = new BinaryUnderscore();
		obj.getInput();
		obj.breakTheBits();
	
	
	}
	
	public int getInput(){
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter an integer : ");
		// Int = sc.nextInt();
		Int = 123_23_1234;
		return Int;
	
	}
	
	public void breakTheBits(){
		String s = String.valueOf(Int);
		String[] s1 = s.split("_");
		System.out.println(s);
	
	
	}


}
