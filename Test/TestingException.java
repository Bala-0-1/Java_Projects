package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestingException{
    public static void main(String[] args) {
        TestingException t = new TestingException();
        try {
            t.demoException();

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch( IOException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void demoException() throws IOException,FileNotFoundException,ArrayIndexOutOfBoundsException{

    }
}