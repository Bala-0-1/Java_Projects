import java.util.Scanner;
class Slope{
	static float m;
	static float x;
	static float c;
	float slope;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of m : ");
		m = sc.nextInt();
		System.out.print("Enter the value of x : ");
		x = sc.nextInt();
		System.out.print("Enter the value of c : ");
		c = sc.nextInt();
		Slope slObj = new Slope(m,x,c);
		slObj.slopeProcess();
		System.out.println(slObj.slope);
		
		
	}
	
	public Slope(){
		
	
	}

	public Slope(float m, float x, float c){
		this.m = m;
		this.x = x;
		this.c = c;
	
	}
	
	public float getM(){
		return m;
	}

	public float getX(){
		return x;
	}

	public float getC(){
		return c;
	}
	
	public void setM(float m){
		this.m = m;
	}

	public void setX(float x){
		this.x = x;
	}

	public void setC(float C){
		this.c = c;
	}

	public void slopeProcess(){
		float slope = (m*x)+c;
		this.slope = slope;	
	
	}

}
