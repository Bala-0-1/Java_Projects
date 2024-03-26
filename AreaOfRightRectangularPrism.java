import java.util.Scanner;
class AreaOfRightRectangularPrism{
	int w,l,h;	
	public static void main(String args[]){
		AreaOfRightRectangularPrism ar = new AreaOfRightRectangularPrism();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		ar.l = sc.nextInt();
                System.out.print("Enter the width : ");
		ar.w = sc.nextInt();
		System.out.print("Enter the height : ");
		ar.h = sc.nextInt();
		System.out.println("The area is : "+ar.area());
	
	}
	
	public int area(){
		int a;
		a =  2*((w*l)+(h*l)+(h*w));
		return a;
	
	}
}
