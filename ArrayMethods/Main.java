

public class Main {
    public static void main(String args[]){
    ArrayM arrObj = new ArrayM(5, new int[]{12,34,2,1,13});
    System.out.println("Minimum : "+arrObj.findMin());
    System.out.println("Maximum : "+arrObj.findMax());
    System.out.println("Sum : "+arrObj.sum());
    System.out.println("IsExist 12: "+arrObj.isExist(12));
    System.out.print("Disp : ");
    arrObj.disp();
    System.out.println("Value of index 3 :  "+arrObj.valueOfIndex(3));
    System.out.println("IsDivisible by 3: "+arrObj.isDivisible(3));
    System.out.println("Divisible values by 3 : ");
    arrObj.divisibleValues(3);
    System.out.println("isodd : "+arrObj.isOddSum());
    System.out.println("iseven : "+arrObj.isEvenSum());
    
}
     
}
