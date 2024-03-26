package jvmattachingtest;

import java.io.File;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import com.sun.tools.attach.VirtualMachine;



public class AdviceClient{
    int count = 0;
    public static void main(String[] args) {
        AdviceClient ac = new AdviceClient();
        ac.connect();
        
    }
    public void connect(){
        try{
            String pid = getServerProcessID();
            System.out.println(pid);
            VirtualMachine vm = VirtualMachine.attach(pid);
            String connectorAddress = vm.getAgentProperties().getProperty("com.sun.management.jmxremote.localConnectorAddress");

            if (connectorAddress == null) {
                // Start the JMX agent in the target JVM
                // String agentPath = ManagementFactory.getRuntimeMXBean().getSystemProperties().getProperty("java.home")+"management-agent.jar";
                // String agentPath = "/Users/balakumaranb/java/jvmattachingtest/management-agent.jar";
                // String agentPath = ManagementFactory.getRuntimeMXBean().getSystemProperties().getProperty("java.home") + "/lib/management-agent.jar";
                String javaHome = System.getProperty("java.home");
                String agentPath = javaHome + File.separator + "lib" + File.separator + "libmanagement_agent.dylib";
                // System.out.println(new File(agentPath).canRead());
                // String agentPath = "/Users/balakumaranb/java/jvmattachingtest/libmanage`ment_agent.dylib";
                vm.loadAgent(agentPath, "com.sun.management.jmxremote");
            

                // vm.loadAgent(agentPath);
                // connectorAddress = vm.getAgentProperties().getProperty("com.sun.management.jmxremote.localConnectorAddress");
            }

            // Connect to the JMX agent in the target JVM
            JMXConnector connector = JMXConnectorFactory.connect(new JMXServiceURL(connectorAddress));
            MBeanServerConnection mbs = connector.getMBeanServerConnection();

            // Specify the target MBean name
            ObjectName mbeanName = new ObjectName("AdviceServer");

            // Access properties of the target class using JMX
            AdviceServer targetClassProxy = MBeanServerInvocationHandler.newProxyInstance(
                    mbs, mbeanName, AdviceServer.class, false);

            // Use getters to access properties
            count = targetClassProxy.getCount();

            // Close the JMX connector
            connector.close();

            // Detach from the target JVM
            vm.detach();
        

            if(count<3){
                System.out.println(count);
                Socket s = new Socket("localhost",1000);
                InputStream is = s.getInputStream();
                Scanner sc = new Scanner(is);
                System.out.println(sc.nextLine());
                sc.close();
                // Thread.sleep(100000);
            }
            else{
                System.out.println("not available.");
            }
        }
    
        catch(Exception ee){
            System.out.println("error "+ee);
        }
    }
    public String getServerProcessID(){
        String pid = "0";
        String processid;
        String str1;
        try{
            ProcessBuilder p = new ProcessBuilder("jps");
            Process process = p.start();
            int p2 = process.waitFor();
            if(p2 == 0){
                Scanner sc = new Scanner(process.getInputStream());
                while(sc.hasNextLine()){
                    String val = sc.nextLine();
                    String[] str = val.split(" ");
                    if(str.length>1){
                        processid = str[0];
                        str1 = str[1];
                        if(str1.equals("AdviceServer")){
                            pid = processid;
                            break;
                    }
                    
                    }
                    
                }
            }
            else{
                System.out.println("udsbvibsbvs");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pid;
    }
    
}
