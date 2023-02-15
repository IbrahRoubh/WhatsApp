package WhatsApp.Server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    private ServerSocket socket;
    public Server(int port){
        try {
            socket=new ServerSocket(port);
        }catch (Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
    public void acceptClient(){
        Socket client=null;
        while (true)
        {
            try {
                System.out.println("wait for client:");
                client=socket.accept();
            }catch (Exception e){
                System.out.println(e);
                System.exit(1);
            }
            run();
        }
    }
    @Override
    public void run(){

    }
}
