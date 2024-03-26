package Test;
import java.io.*;

public class ThrowsExamples{

void testMethod(int num) throws IOException, ArithmeticException{
if(num==1){
throw new IOException("IOException Occurred");
}
else {
throw new ArithmeticException("ArithmeticException");
}
}
}
class ExampleDemo{

    public static void main(String args[]){ 
        ThrowsExamples obj=new ThrowsExamples(); 
        try {
            obj.testMethod(1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}