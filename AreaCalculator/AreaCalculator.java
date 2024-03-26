class AreaCalculator{
	public static double areaOfCircle(double radius){
		return (3.14)*(radius*radius);
	}

	public static double areaOfSquare(double side){
		return side*side;
	}
	
	public static double areaOfRectangle(double length, double width){
		return 2*(length+width);
	}
	
	public static double areaOfTriangle(double base, double height){
		return (base*height)/2;
	}


}
