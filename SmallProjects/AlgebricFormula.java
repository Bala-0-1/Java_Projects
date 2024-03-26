import java.util.Scanner;
// To find the value of x from an algebric equation
class AlgebricFormula{
	int a = 0;
	int b = 0;
	int c = 0;
	public float findX(){
		float x = (float)(c-b)/a;
	        return x;	
	
	
	
	}
	public static void main(String args[]){
		AlgebricFormula af = new AlgebricFormula();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");	
		af.a = sc.nextInt();
		System.out.print("Enter the value of b : ");	
		af.b = sc.nextInt();
		System.out.print("Enter the value of c : ");	
		af.c = sc.nextInt();
		System.out.println("The value of x is : "+af.findX());
	
	}




}
