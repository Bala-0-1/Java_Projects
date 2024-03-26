package chatAppTest;

import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;


public class ServerTest {
    static ArrayList<ClientHandler> ar = new ArrayList<>();

    static int i = 0;

    public static void main(String[] args) throws IOException {
        ServerTest classObj = new ServerTest();

        ServerSocket ss = new ServerSocket(1234);

        Socket s;
        // PrintWriter op = new PrintWriter(s.getOutputStream(), true);
        // Thread sender = new Thread(() -> {
        //     String msg;
        //     while (true) {
        //         msg = sc.nextLine();
        //         op.println(msg);
        //         op.flush();
        //     }
        // });
        // sender.start();

        while (true) {
            s = ss.accept();

            System.out.println("New client request received : " + s);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream());

            out.println("-------------WELCOME TO THE CHAT--------------");
            out.println("At any instance type 'logout' to quit connection to the server.\nFor Private messaging : <message> # <client_name>");

            System.out.println("Creating a new handler for this client...");

            ClientHandler mtch = new ClientHandler(s,"client "+i , in, out);

            Thread t = new Thread(mtch);
            
            System.out.println("Adding this client to active client list");

            ar.add(mtch);

            t.start();
            i++;
            System.out.println(Thread.activeCount());

        }
    }
}


class ClientHandler implements Runnable {
    private String name;
    final BufferedReader in;
    final PrintWriter out;
    Socket s;
    boolean isloggedin;

    public ClientHandler(Socket s, String name, BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
        this.name = name;
        this.s = s;
        this.isloggedin = true;
    }

    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        String received;
        while (true) {
            try {
                received = in.readLine();
                
                if (received.equals("logout")) {
                    this.isloggedin = false;
                    this.s.close();
                    removeClientHandler(this);
                    break;
                }

                String msgToSend = "";
                String recipient = "";

                if(received.contains("#")){
                    StringTokenizer st = new StringTokenizer(received,"#");
                    msgToSend = st.nextToken();
                    recipient = st.nextToken();
                    for (ClientHandler mc : ServerTest.ar) {

                    if (mc.name.equals(recipient) && mc.isloggedin) {
                        
                        mc.out.println(this.name + " : " + msgToSend+"(Private message)");
                        mc.out.flush();
                        break;
                    }
                }
                }

                else{
                   for(ClientHandler c : ServerTest.ar){
                    c.out.println(this.name + " : "+received);
                    c.out.flush();
                   }
                }
                


                // search for the recipient in the connected devices list.
                // ar is the vector storing client of active users

            } catch (IOException e) {
                // Handle exceptions, for example, if the client readerconnects unexpectedly
                System.out.println(this.name+" Client left ");
                removeClientHandler(this);
                break;
            }
        }
        try {
            // closing resources
            this.in.close();
            this.out.close();
        } catch (IOException e) {
            // e.printStackTrace();
        }
    }

    private void removeClientHandler(ClientHandler clientHandler) {
        // Remove the clientHandler from the active clients vector
        ServerTest.ar.remove(clientHandler);
        System.out.println("Client " + clientHandler.name + " disconnected.");
    }
}


