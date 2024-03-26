import java.util.Scanner;
class AreaCalculatorDriver{
	public static void main(String args[]){
		AreaCalculatorDriver obj = new AreaCalculatorDriver();
		obj.userInput();
	}
	
	public void userInput() {
        
		Scanner scanner = new Scanner(System.in);

		System.out.println("Area finder");

		System.out.println("Select an option:");
		System.out.println("1. Area of circle : ");
		System.out.println("2. Area of square : ");
		System.out.println("3. Area of rectangle : ");
		System.out.println("4. Area of triangle : ");

		System.out.print("Enter the option : ");
		int choice = scanner.nextInt();
		System.out.println();

		switch (choice) {
		    case 1:
		    	System.out.println("Enter the radius : ");
		    	Scanner sc1 = new Scanner(System.in);
		    	float temp = sc1.nextFloat();
		        System.out.println("The area of the circle is : "+AreaCalculator.areaOfCircle(temp));
		        break;
		    case 2:
		        System.out.println("Enter the length of one side : ");
		    	Scanner sc2 = new Scanner(System.in);
		    	float temp1 = sc2.nextFloat();
		        System.out.println("The area of the square is : "+AreaCalculator.areaOfSquare(temp1));
		        break;
		    case 3:
		        System.out.println("Enter the length : ");
		    	Scanner sc3 = new Scanner(System.in);
		    	float temp2 = sc3.nextFloat();
		    	System.out.println("Enter the width : ");
		    	float temp3 = sc3.nextFloat();
		        System.out.println("The area of the rectangle is : "+AreaCalculator.areaOfRectangle(temp2,temp3));
		        break;
		    case 4:
		        System.out.println("Enter the base : ");
		    	Scanner sc4 = new Scanner(System.in);
		    	float temp4 = sc4.nextFloat();
		    	System.out.println("Enter the height : ");
		    	float temp5 = sc4.nextFloat();
		        System.out.println("The area of the triangle is : "+AreaCalculator.areaOfTriangle(temp4,temp5));
		        break;
		    default:
		        System.out.println("Invalid option. Please try again.");
		}


	    }
	



}
