package chatApp;
import java.io.*;

class RuntimeTest{
    public static void main(String[] args) throws IOException,InterruptedException{
//     String cmd ="shutdown" ;
//     Process pro = Runtime.getRuntime().exec(cmd) ;
//     pro.waitFor();
//     InputStream res = pro.getInputStream ();
//     String line = null;
//     BufferedReader in = new BufferedReader(new InputStreamReader(res));
//     while ((line = in. readLine ()) != null) {
//     System.out.println(cmd + " " + line);
// }
System.out.println(System.getProperty("os.name"));
    }
}
