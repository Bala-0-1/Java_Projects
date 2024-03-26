package processbuildertesting;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class RunningJavaProcesses {
    static String line = "";
    static String prev = " ";
    // static String original = "";

    public static void main(String[] args) {
        try {
            
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder processBuilder;
            Process process;
            if (os.contains("win")) {
                processBuilder = new ProcessBuilder("tasklist");
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                processBuilder = new ProcessBuilder("jps");
            } else {
                throw new UnsupportedOperationException("Unsupported operating system");
            }
            while(true){
            process = processBuilder.start();
            int exitCode = process.waitFor();
            
                if (exitCode == 0) {
                    printOutput(process.getInputStream());
                } else {
                    printOutput(process.getErrorStream());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printOutput(InputStream inputStream) throws IOException {
        try (Scanner sc = new Scanner(inputStream)) {
            
            while (sc.hasNextLine()) {
                line+=sc.nextLine()+"\n";
            }

            
            if(!prev.equals(line)){
                System.out.println(line);
                System.out.println();
                System.out.println("-----------------------------------------------------------------");
                System.out.println();
            }
            prev = line;
            line = "";
        }
    }
}

