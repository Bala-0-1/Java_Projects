package ComplexNumbers;

public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers(){
        this.real = 1;
        this.imaginary = 2;
    }

    public ComplexNumbers(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImaginary( double imaginary){
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public ComplexNumbers add(ComplexNumbers obj){
        return new ComplexNumbers(this.real+obj.real, this.imaginary+obj.imaginary);
    }

    public String toString(){
        if (this.imaginary<0){
            return this.real+" "+this.imaginary+"i";
        }
        else{
            return this.real+" + "+this.imaginary+"i";
        }
    }

    public ComplexNumbers subraction(ComplexNumbers obj){
        return new ComplexNumbers(this.real-obj.real, this.imaginary-obj.imaginary);
    }

    public ComplexNumbers multiplication(ComplexNumbers obj){
        double firstPart = this.real*obj.real;
        double secondPart = this.real*obj.imaginary;
        double thirdPart = this.imaginary*obj.real;
        double fourthPart = -(this.imaginary*obj.imaginary);
        return new ComplexNumbers(firstPart+fourthPart, secondPart+thirdPart);
    
    }


    public ComplexNumbers division(ComplexNumbers obj) {
        double firstPart = this.real * obj.real + this.imaginary * obj.imaginary;
        double secondPart = this.imaginary * obj.real - this.real * obj.imaginary;
        double divider = obj.real * obj.real + obj.imaginary * obj.imaginary;
        
        return new ComplexNumbers(firstPart / divider, secondPart / divider);
    }
    
    public static void main(String args[]){
        ComplexNumbers c = new ComplexNumbers(3, 7);
        ComplexNumbers c1 = new ComplexNumbers(2, 5);
        System.out.println("First complex number : "+c);
        System.out.println("Second complex number : "+c1);
        System.out.println("Addition : "+c.add(c1));
        System.out.println("Subraction : "+c.subraction(c1));
        System.out.println("Multiplication : "+c.multiplication(c1));
        System.out.println("Division : "+c.division(c1));
    }
}
