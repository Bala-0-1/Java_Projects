package jvmattachingtest;

import java.io.File;
import java.io.IOException;
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

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

public class Test1 {
    public static void main(String[] args) {
        try {
            VirtualMachine vm = VirtualMachine.attach(args[0]);
            String javaHome = System.getProperty("java.home");
            String agentPath = javaHome + File.separator + "lib" + File.separator + "libmanagement_agent.dylib";
            vm.loadAgent(agentPath);
        } catch (AttachNotSupportedException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
           
            e.printStackTrace();
        } catch (AgentLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (AgentInitializationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
