package Test;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;


public class NetworkDevices {
    private static int port = 5502;

    public static void main(String[] args) {
        getNetworkDevices();
    }

    private static void getNetworkDevices(){
        Socket socket = new Socket();

        try {
            Process process = Runtime.getRuntime().exec("arp -a"); 
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String ip = null;
            List<String> ipList = new ArrayList<>(); // List<> Array to hold dynamic IP Addresses
            while ((ip = reader.readLine()) != null) {
                ip = ip.trim();     // Trim the data
                if (!ip.equals("")) { 
                    if (!ip.equals("")) {
                        // Remove all the unwanted spaces between data provided by 
                        // the ARP Table when it is generated.
                        while (ip.contains("  ")) { ip = ip.trim().replace("  ", " "); }
                        // Split each data line into a String Array for processing
                        String[] dataArray = ip.split(" ");
                        // For console output display only...
                        if (dataArray[0].toLowerCase().startsWith("interface:")) {
                            System.out.println("Locating Devices Connected To: " + dataArray[1]);
                        }
                        // If the data line contains the word "dynamic"
                        // then add the IP address on that line to the 
                        // List<> Array...
                        if (dataArray[2].equalsIgnoreCase("dynamic")) {
                            ipList.add(dataArray[0]);
                            // For console output display only...
                            System.out.println("Device Located On IP: " + dataArray[0]);
                        }
                    }
                }
            }
            // Close the Reader
            reader.close();

            // try to connect to the device....
            // You'll need to play with this.
            try {
                for (int i = 0; i < ipList.size(); i++) {
                    ip = ipList.get(i);
                    socket.connect(new InetSocketAddress(ip, port), 1000);
                    System.out.println("Found socket for: " + ip);
                    socket.close();
                }
            } catch (ConnectException | SocketTimeoutException ex) {
                System.out.println("\nSOCKET ERROR - " + ex.getMessage());
            }
        } catch (IOException | InterruptedException e) { 
            System.out.println("\nPROCESS/READER ERROR - " + e.getMessage()); 
        }

    }
}