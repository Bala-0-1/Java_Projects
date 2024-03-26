public class CustomCalc{
	
	public static double mean(int num1, int num2, int num3){
		return num1+num2+num3/3;
	
	}

	public static int findMin(int num1, int num2, int num3){
		if(num1<num2 && num1<num3){
			return num1;	
		}
		else if(num2<num1 && num2<num3){
			return num2;
		}
		else{
			return num3;
		}
	
	
	}
	
	public static int findMax(int num1, int num2, int num3){
		if(num1>num2 && num1>num3){
			return num1;	
		}
		else if(num2>num1 && num2>num3){
			return num2;
		}
		else{
			return num3;
		}
	}
	
	public static double findMinSqrt(int num1, int num2){
		return Math.sqrt(Math.min(num1,num2));
	
	
	}

	public static double findMaxSqrt(int num1, int num2){
		return Math.sqrt(Math.max(num1,num2));
	
	}

}
