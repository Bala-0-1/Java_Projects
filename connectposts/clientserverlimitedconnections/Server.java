package connectposts.clientserverlimitedconnections;



import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;


public class Server {
    static ArrayList<ClientHandler> ar = new ArrayList<>();
    static final int maxCount = 3;
    static int count = 0;
    static int i = 0;

    public static void main(String[] args) throws IOException {
        // Server classObj = new Server();

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
            // System.out.println(count);
            if(Server.maxCount>count){
                // ServerSocket ss = new ServerSocket(1234);
                if(ss.isClosed()){
                    ss = new ServerSocket(1234);
                }
                s = ss.accept();
            System.out.println();

            System.out.println("New client request received : " + s);

            System.out.println();

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream());

            out.println("-------------WELCOME TO THE CHAT--------------");
            out.println("At any instance type 'logout' to quit connection to the Server.\nFor Private messaging : <message> # <client_name>");
            
            System.out.println("Creating a new handler for this client...");
            System.out.println();
            ClientHandler mtch = new ClientHandler(s,"client "+count , in, out);

            Thread t = new Thread(mtch);
            
            System.out.println("client name : client"+count);
            System.out.println();
            System.out.println("-------------------------------------------");
            Server.count++;
            ar.add(mtch);

            t.start();
            i++;
            
            // System.out.println(Thread.activeCount());
            }
            else{
                ss.close();
            }


            

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
                    for (ClientHandler mc : Server.ar) {

                    if (mc.name.equals(recipient) && mc.isloggedin) {
                        
                        mc.out.println(this.name + " : " + msgToSend+"(Private message)");
                        mc.out.flush();
                        break;
                    }
                }
                }

                else{
                   for(ClientHandler c : Server.ar){
                    c.out.println(this.name + " : "+received);
                    c.out.flush();
                   }
                }
                


            } catch (Exception e) {
                System.out.println("--------------------------");
                Server.count--;
                removeClientHandler(this);
                System.out.println(this.name+" Client left ");
                System.out.println("-----------------------------");
                // System.out.println(Server.count);
                
                break;
            }
        }
        try {
            this.in.close();
            this.out.close();
        } catch (IOException e) {
            System.out.println("the weird catch is working!");
        }
    }

    private void removeClientHandler(ClientHandler clientHandler) {
        Server.ar.remove(clientHandler);
        System.out.println("Client " + clientHandler.name + " disconnected.");
        
    }
}


