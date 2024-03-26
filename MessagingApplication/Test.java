package MessagingApplication;
import java.util.*;
import java.io.*;
public class Test{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("GeeksForGeeks");
        // System.out.println(sb.capacity());
        // for(int i = 0;i<50;i++){
            // sb.append("hii");
        // }
        System.out.println(sb.capacity());
        sb.trimToSize();
        // sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb);
    }


}
